import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {
  @Test
  public void testAdd() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    assertEquals(1, list.sizeIndex());
  }

  @Test
  public void testInsert() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    list.insertAt(1, new ListElement<String>("Titi"));
    assertEquals(2, list.sizeIndex());
  }

  @Test
  public void testRemove() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    list.insertAt(1, new ListElement<String>("Titi"));
    assertEquals(2, list.sizeIndex());
    list.insertAt(2, new ListElement<String>("Tata"));
    list.insertAt(3, new ListElement<String>("Tete"));
    list.removeAt(1);
    assertEquals("Toto", list.getDataAt(0));    
    assertEquals("Tata", list.getDataAt(1));
    assertEquals("Tete", list.getDataAt(2));
  }

  @Test
  public void testPushStartNull() {
    LinkedList<String> list = new LinkedList<>();
    list.insertAt(1, new ListElement<String>("Titi"));
    list.removeAt(1);
    assertEquals(null, list.getDataAt(1));
  }

  @Test
  public void testPushStart() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    assertEquals("Toto", list.getDataAt(0));
  }

  @Test
  public void testPushEnd() {
    LinkedList<String> list = new LinkedList<>();
    list.pushEnd(new ListElement<String>("Toto"));
    assertEquals("Toto", list.getDataAt(0));
  }

  @Test
    public void testFindeIndex() {
    LinkedList<String> list = new LinkedList<>();
    list.insertAt(1, new ListElement<String>("Titi"));
    list.insertAt(2, new ListElement<String>("Tata"));
    list.insertAt(3, new ListElement<String>("Toto"));
    list.insertAt(4, new ListElement<String>("Toto"));
    list.insertAt(5, new ListElement<String>("Toto"));
    list.insertAt(6, new ListElement<String>("Tete"));
    assertEquals(2, list.firstIndexOf("Toto"));
  }

  @Test
    public void testFindeIndexlast() {
    LinkedList<String> list = new LinkedList<>();
    list.insertAt(1, new ListElement<String>("Titi"));
    list.insertAt(2, new ListElement<String>("Tata"));
    list.insertAt(3, new ListElement<String>("Toto"));
    list.insertAt(4, new ListElement<String>("Toto"));
    list.insertAt(5, new ListElement<String>("Toto"));
    list.insertAt(6, new ListElement<String>("Tete"));
    int a = list.lastIndexOf("Toto");
    assertEquals(4, a);
  }

  @Test
    public void testRemove2() {
    LinkedList<String> list = new LinkedList<>();
    list.insertAt(3, new ListElement<String>("Toto"));
    list.insertAt(6, new ListElement<String>("Tete"));
    list.remove("Toto");
    int index = list.firstIndexOf("Tete");
    assertEquals(0, index);
  }
}
