import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestLinkedList {
  @Test
  public void testAdd() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    assertEquals(15, list.sizeIndex());
  }
}