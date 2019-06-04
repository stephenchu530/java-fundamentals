package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test public void testReviewInstantiate() {
        Review testReview = new Review("something", "Some One", 2);
    }

    @Test public void testReviewToString() {
        Review testReview = new Review("something", "Some One", 2);

        assertEquals("Should be: Some One, 2, something",
                "Some One, 2, something",
                testReview.toString()
        );
    }
}