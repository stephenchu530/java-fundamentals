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

        assertEquals("Should return: Something has 1 of 5 stars and is 1 out of 4 price category.",
                new String("Something has 1 of 5 stars and is 1 out of 4 price category."),
                restaurant.toString()
        );
    }
}
