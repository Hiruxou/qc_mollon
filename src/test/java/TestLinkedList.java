import org.junit.*;
import static org.junit.Assert.*;

public class TestLinkedList {
  @Test
  public void testAdd() {
    LinkedList<String> list = new LinkedList<>();
    list.pushStart(new ListElement<String>("Toto"));
    assertEquals(15, list.sizeIndex());
    }
}