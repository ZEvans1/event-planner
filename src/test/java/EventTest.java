import models.Event;
import org.junit.*;

import static org.junit.Assert.*;

public class EventTest {

    @Test
    public void newEvent_instantiatiesCorrectly() {
        Event testEvent = new Event(100, "dinner", "full bar", "live band");
        assertEquals(true, testEvent instanceof Event);

    }

    @Test
    public void newEvent_getGuests_100() {
        Event testEvent = new Event(100, "dinner", "full bar", "live band");
        assertEquals(100, testEvent.getGuests());
    }
}
