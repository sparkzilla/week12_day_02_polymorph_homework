import attractions.Attraction;
import attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ThemeParkTest {

    ThemePark themepark;
    Attraction attraction1;

    @Before
    public void before(){
        themepark = new ThemePark();
        attraction1 = new RollerCoaster("The Snake", 5);
    }

    @Test
    public void canAddAttraction(){
        themepark.addAttraction(attraction1);
        assertEquals("The Snake", themepark.getAttractions().get(0).getName());
    }

    @Test
    public void canAddReviewed(){
        themepark.addReviewed(attraction1);
        assertEquals("The Snake", themepark.getAllReviewed().get(0).getName());
    }
}
