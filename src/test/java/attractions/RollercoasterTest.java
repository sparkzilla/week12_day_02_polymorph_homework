package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor1 = new Visitor(11, 180, 50.00);
        visitor2 = new Visitor(16, 125, 50.00);
        visitor3 = new Visitor(13, 180, 50.00);
        visitor4 = new Visitor(13, 210, 50.00);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canVisitAttraction(){
        assertFalse(rollerCoaster.isAllowedTo(visitor1));
        assertFalse(rollerCoaster.isAllowedTo(visitor2));
        assertTrue(rollerCoaster.isAllowedTo(visitor3));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.50, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void isDoubleForTallVisitors(){
        double price = rollerCoaster.priceFor(visitor4);
        assertEquals(17.00, price, 0.00);
    }
}
