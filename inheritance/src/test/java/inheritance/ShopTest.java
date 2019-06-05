package inheritance;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ShopTest {
    Shop basicShop;
    Review[] reviews;

    @Before
    public void setUpBasicShop() {
        this.basicShop = new Shop("Basic Shop", "Best shop in town", 2);
    }

    @Before
    public void setUpFiveReviews() {
        this.reviews = new Review[5];
        this.reviews[0] = new Review("This place rocks!", "Someone Cool", 4);
        this.reviews[1] = new Review("This place is terrible!", "Someone Bad", 0);
        this.reviews[2] = new Review("I like it", "I don't know", 2);
        this.reviews[3] = new Review("Meh", "Jon Doe", 1);
        this.reviews[4] = new Review("I'd come back", "Steve", 3);
    }

    @Test
    public void testShopToString() {
        assertEquals("Should print out: Basic Shop, Best shop in town, 0, 2",
                "Basic Shop, Best shop in town, 0, 2",
                this.basicShop.toString()
        );
    }

    @Test
    public void testAddReview() {
        this.basicShop.addReview(this.reviews[0]);
        assertEquals("Should have average star rating of 4",
                4,
                this.basicShop.getAvgStar()
        );
        this.basicShop.addReview(this.reviews[1]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicShop.getAvgStar()
        );
        this.basicShop.addReview(this.reviews[2]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicShop.getAvgStar()
        );
        this.basicShop.addReview(this.reviews[3]);
        assertEquals("Should have average star rating of 1",
                1,
                this.basicShop.getAvgStar()
        );
        this.basicShop.addReview(this.reviews[4]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicShop.getAvgStar()
        );
        assertEquals("Should print out: Basic Shop, Best shop in town, 2, 2",
                "Basic Shop, Best shop in town, 2, 2",
                this.basicShop.toString()
        );
    }
}