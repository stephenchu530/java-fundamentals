package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurantInstantiate() {
        Restaurant restaurant = new Restaurant("Something", 1);
    }

    @Test
    public void testRestaurantToString() {
        Restaurant restaurant = new Restaurant("Something", 1);

        assertEquals("Should return: Something, 0 average stars, 1 price category, 0 reviews.",
                "Something, 0 average stars, 1 price category, 0 reviews.",
                restaurant.toString()
        );
    }

    @Test
    public void testRestaurantAddReview() {
        Restaurant restaurant = new Restaurant("Something", 1);
        Review testReview = new Review("something", "Some One", 2);

        restaurant.addReview(testReview);
    }

    @Test
    public void testRestaurantAddOneReviewToString() {
        Restaurant restaurant = new Restaurant("Something", 1);
        Review testReview = new Review("something", "Some One", 2);

        restaurant.addReview(testReview);
        assertEquals("Should return: Something, 2 average stars, 1 price category, 1 reviews.",
                "Something, 2 average stars, 1 price category, 1 reviews.",
                restaurant.toString()
        );
    }

    @Test
    public void testRestaurantAddTwoReviewsToString() {
        Restaurant restaurant = new Restaurant("Something", 1);
        Review testReview1 = new Review("something", "Some One", 2);
        Review testReview2 = new Review("something", "Some One", 4);

        restaurant.addReview(testReview1);
        restaurant.addReview(testReview2);

        assertEquals("Should return: Something, 2 average stars, 1 price category, 1 reviews.",
                "Something, 3 average stars, 1 price category, 2 reviews.",
                restaurant.toString()
        );
    }

    @Test
    public void testRestaurantAddRepeatReviewToString() {
        Restaurant restaurant = new Restaurant("Something", 1);
        Review testReview1 = new Review("something", "Some One", 2);
        Review testReview2 = new Review("something", "Some One", 4);

        restaurant.addReview(testReview1);
        restaurant.addReview(testReview2);
        restaurant.addReview(testReview1);
        restaurant.addReview(testReview2);

        assertEquals("Should return: Something, 2 average stars, 1 price category, 1 reviews.",
                "Something, 3 average stars, 1 price category, 2 reviews.",
                restaurant.toString()
        );
    }
}
