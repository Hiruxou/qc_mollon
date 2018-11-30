public class Main {
    public static void main(String[] args) {
        System.out.println("-- Test --");
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("--------- Add ---------");

        list.pushStart(new ListElement<Integer>(1));
        list.insertAt(1, new ListElement<Integer>(2));
        list.insertAt(2, new ListElement<Integer>(3));
        list.insertAt(3, new ListElement<Integer>(5));
        list.insertAt(4, new ListElement<Integer>(6));
        list.insertAt(5, new ListElement<Integer>(7));
        list.insertAt(6, new ListElement<Integer>(8));
        list.insertAt(7, new ListElement<Integer>(8));
        list.insertAt(8, new ListElement<Integer>(8));
        list.pushEnd(new ListElement<Integer>(10));
        
        for (int i = 0; i < list.sizeIndex(); i++) {
            System.out.println(list.getDataAt(i));
        }

        System.out.println("--------- Size of list #1 ---------");

        System.out.println("Size: " + list.sizeIndex());
        
        System.out.println("--------- First Index Of ---------");

        System.out.format("%d: %d\n", 3, list.firstIndexOf(3));
        System.out.format("%d: %d\n", 15, list.firstIndexOf(15));
        System.out.format("%d: %d\n", 8, list.firstIndexOf(8));

        System.out.println("--------- Last Index Of ---------");

        System.out.format("%d: %d\n", 3, list.lastIndexOf(3));
        System.out.format("%d: %d\n", 15, list.lastIndexOf(15));
        System.out.format("%d: %d\n", 8, list.lastIndexOf(8));

        System.out.println("--------- Remove At ---------");

        list.removeAt(3);
        list.removeAt(3);
        list.removeAt(15);
        list.removeAt(4);

        for (int i = 0; i < list.sizeIndex(); i++) {
            System.out.println(list.getDataAt(i));
        }

        System.out.println("--------- Size of list #2 ---------");

        System.out.println("Size: " + list.sizeIndex());

        System.out.println("--------- Remove ---------");

        list.remove(4);
        list.remove(7);
        list.remove(2);

        for (int i = 0; i < list.sizeIndex(); i++) {
            System.out.println(list.getDataAt(i));
        }

        System.out.println("--------- Size of list #3 ---------");

        System.out.println("Size: " + list.sizeIndex());

        System.out.println("--------- Remove when empty---------");

        list.removeAt(0);
        list.removeAt(0);
        list.removeAt(0);
        list.removeAt(0);
        list.removeAt(0);
        list.removeAt(0);
        list.removeAt(2515);

        System.out.println("--------- Size of list #4 ---------");

        System.out.println("Size: " + list.sizeIndex());
    }
}