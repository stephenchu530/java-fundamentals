package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurantInstantiate() {
        Restaurant restaurant = new Restaurant("Something", 1, 1);
    }

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Something", 1, 1);

        assertEquals("Should return: Something, 0 average stars, 1 price category, 0 reviews.",
                "Something, 0 average stars, 1 price category, 0 reviews.",
                restaurant.toString()
        );
    }
}
