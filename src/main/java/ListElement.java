public class ListElement <T> {

    ListElement<T> previous = null;
    ListElement<T> next = null;
    public T data;

    public ListElement(T data) {
        this.data = data;
    }
}