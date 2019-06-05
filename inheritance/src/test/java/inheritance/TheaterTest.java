package inheritance;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TheaterTest {
    Theater basicTheater;
    Theater.TheaterReview[] reviews;

    @Before
    public void setUpBasicShop() {
        this.basicTheater = new Theater("Basic Theater", 2);
    }

    @Before
    public void setUpFiveReviews() {
        this.reviews = new Theater.TheaterReview[5];
        this.reviews[0] = new Theater.TheaterReview("This place rocks!", "Someone Cool", 4);
        this.reviews[1] = new Theater.TheaterReview("This place is terrible!", "Someone Bad", 0, "The Piano");
        this.reviews[2] = new Theater.TheaterReview("I like it and the movie", "I don't know", 2, "Fun Movie II");
        this.reviews[3] = new Theater.TheaterReview("Meh", "Jon Doe", 1);
        this.reviews[4] = new Theater.TheaterReview("I'd come back", "Steve", 3, "Avengers");
    }

    @Test
    public void testShopToString() {
        assertEquals("Should print out: Basic Theater 0 2",
                "Basic Theater, 0, 2",
                this.basicTheater.toString()
        );
    }

    @Test
    public void testAddReview() {
        this.basicTheater.addReview(this.reviews[0]);
        assertEquals("Should have average star rating of 4",
                4,
                this.basicTheater.getAvgStar()
        );
        this.basicTheater.addReview(this.reviews[1]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicTheater.getAvgStar()
        );
        this.basicTheater.addReview(this.reviews[2]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicTheater.getAvgStar()
        );
        this.basicTheater.addReview(this.reviews[3]);
        assertEquals("Should have average star rating of 1",
                1,
                this.basicTheater.getAvgStar()
        );
        this.basicTheater.addReview(this.reviews[4]);
        assertEquals("Should have average star rating of 2",
                2,
                this.basicTheater.getAvgStar()
        );
        assertEquals("Should print out: Basic Theater 2 2",
                "Basic Theater, 2, 2",
                this.basicTheater.toString()
        );
    }

    @Test
    public void testAddMovies() {
        this.basicTheater.addMovie("Movie Title 1");
        assertEquals("Should print out: Basic Theater, 0, 2, Movie Title 1",
                "Basic Theater, 0, 2, Movie Title 1",
                this.basicTheater.toString()
        );
        this.basicTheater.addMovie("Some Other Bad Movie");
        assertEquals("Should print out: Basic Theater, 0, 2, Movie Title 1, Some Other Bad Movie",
                "Basic Theater, 0, 2, Movie Title 1, Some Other Bad Movie",
                this.basicTheater.toString()
        );
    }

    
}