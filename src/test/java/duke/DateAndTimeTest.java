package duke;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Test cases for the DateAndTime class.
 */
public class DateAndTimeTest {

    /**
     * Test the DateAndTime::isValidDate() method.
     */
    @Test
    public void validTest() {
        DateFormatter test1 = new DateFormatter();
        assertTrue(test1.isValidDate("2023-04-01", "2023-04-02"));
    }

    /**
     * Test the DateAndTim::dayParse() method.
     */
    @Test
    public void dateStringTest() {
        assertEquals("Apr 01 2023", DateFormatter.parseDay("2023-04-01", "MMM dd YYYY"));
    }
}
