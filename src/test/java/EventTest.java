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

    @Test
    public void newEvent_getFood_dinner() {
        Event testEvent = new Event(100, "dinner", "full bar", "live band");
        assertEquals("dinner", testEvent.getFood());
    }

    @Test
    public void newEvent_getDrinks_fullbar() {
        Event testEvent = new Event(100, "dinner", "full bar", "live band");
        assertEquals("full bar", testEvent.getDrinks());
    }

    @Test
    public void newEvent_getEntertainment_liveband() {
        Event testEvent = new Event(100, "dinner", "full bar", "live band");
        assertEquals("live band", testEvent.getEntertainment());
    }

    @Test
    public void newEvent_getEventCost_150() {
        Event testEvent = new Event(50, "dinner", "full bar", "live band");
        assertEquals(1200, testEvent.getEventCost());
    }

}
