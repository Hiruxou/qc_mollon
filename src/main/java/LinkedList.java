public class LinkedList<T> {

  private int size;
  private int elementNotInside = -1;
  ListElement<T> start;
  ListElement<T> end;

  /**
 * Constructeur.
 */
  public LinkedList() {
    this.size = 0;
    this.start = new ListElement<T>(null);
    this.end = new ListElement<T>(null);

    this.start.next = this.end;
    this.end.previous = this.start;
  }

  private boolean indexInList(int position) {
    return (size > position);
  }

  private ListElement<T> getAt(int position) {
    if (!indexInList(position)) {
      return null;
    }

    ListElement<T> element = this.start.next;
    for (int i = 0; i < position; i++) {
      element = element.next;
    }
    return element;
  }

  /**
 * get the data at X posiotion.
 * @param position in list.
 * @return element at position.
 */
  public T getDataAt(int position) {
    ListElement<T> element = getAt(position);
    if (element == null) {
      throw new IndexOutOfBoundsException("Out of range");
    }
    return element.data;
  }

  /**
 * Insert element at X position.
 * @param position for insert.
 * @param newElement is what is insert.
 */
  public void insertAt(int position, ListElement<T> newElement) {
    ListElement<T> currentElement = this.getAt(position);

    if (currentElement == null) {
      currentElement = this.end;
    }

    newElement.next = currentElement;
    newElement.previous = currentElement.previous;
    currentElement.previous.next = newElement;
    currentElement.previous = newElement;

    this.size += 1;
  }

  /**
 * Try to push at the start of list.
 * @param newElement to insert at the first place.
 */
  public void pushStart(ListElement<T> newElement) {
    newElement.next = this.start.next;
    newElement.previous = this.start;    
    this.start.next.previous = newElement;
    this.start.next = newElement;
    
    this.size += 1;
  }

  /**
   * Try to push at the end of list.
   * @param newElement to insert at the end place.
   */
  public void pushEnd(ListElement<T> newElement) {
    newElement.previous = this.end.previous;
    newElement.next = this.end;    
    this.end.previous.next = newElement;
    this.end.previous = newElement;

    this.size += 1;
  }

  /**
   * Remove a element.
   * @param element at remove.
   */
  private void remove(ListElement<T> element) {
    element.previous.next = element.next;
    element.next.previous = element.previous;
    
    this.size -= 1;
  }

  /**
   * Remove in public.
   * @param element for remove.
   */
  public void remove(T element) {
    ListElement<T> currentElement = this.start;
    if (element == null) {
      return;
    }

    while (currentElement != this.end) {
      if (element.equals(currentElement.data)) {
        this.remove(currentElement);
        return;
      }
      currentElement = currentElement.next;
    }
  }

  /**
   * remove at X position.
   * @param position for remove.
   */
  public void removeAt(int position) {
    ListElement<T> currentElement = this.getAt(position);
    if (currentElement == null) {
      throw new IndexOutOfBoundsException("Out of range");
    }
    if (currentElement != null) {
      this.remove(currentElement);
    }
  }

  /**
   * Find the first index.
   * @param element to find.
   * @return the first element find.
   */
  public int firstIndexOf(T element) {
    ListElement<T> currentElement = this.start.next;
    int i = 0;

    if (element == null) {
      return -1;
    }
    while (currentElement != this.end) {
      if (element.equals(currentElement.data)) {
        return i;
      }
      i++;
      currentElement = currentElement.next;
    }

    return -1;
  }

  /**
   * Find the last index.
   * @param element to find the last.
   * @return the last element find.
   */
  public int lastIndexOf(T element) {
    ListElement<T> currentElement = this.end.previous;
    int i = size - 1;

    if (element == null) {
      return -1;
    }
    while (currentElement != this.start) {
      if (element.equals(currentElement.data)) {
        return i;
      }
      i--;
      currentElement = currentElement.previous;
    }

    return -1;
  }

  /**
   * What is the size.
   * @return the size of list.
   */
  public int sizeIndex() {
    return this.size;
  }
}