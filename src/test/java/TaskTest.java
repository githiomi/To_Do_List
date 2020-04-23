import org.junit.*;
import static org.junit.Assert.*;

public class TaskTest {

    @Test
    public void Task_takesInstance_true () {
        Task newTask = new Task("");
        assertEquals(true, newTask instanceof Task);
    }

    @Test
    public void Task_takesInstanceWithDescription_string () {
        Task newTask = new Task("Mow my lawn");
        assertEquals("Mow my lawn", newTask.getDescription());
    }
}
