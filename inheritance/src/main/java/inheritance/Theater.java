package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Theater {
    private String name;
    private int priceCategory;
    private int averageStars;
    private int subTotalStars;
    private int numberOfReviews;
    private ArrayList<Review> reviews;
    private Set<String> movies;

    public Theater(String name, int priceCategory) {
        this.name = name;
        this.priceCategory = priceCategory;
        this.averageStars = 0;
        this.subTotalStars = 0;
        this.numberOfReviews = 0;
        this.reviews = new ArrayList<>();
        this.movies = new HashSet<>();
    }

    public int getAvgStar() {
        return this.averageStars;
    }

    public void addMovie(String movie) {
        this.movies.add(movie);
    }

    public void removeMovie(String movie) {
        this.movies.remove(movie);
    }

    public void addReview(TheaterReview review) {
        this.reviews.add(review);
        this.subTotalStars += review.getStars();
        this.numberOfReviews++;
        this.averageStars = this.subTotalStars / this.numberOfReviews;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name);
        output.append(", ");
        output.append(this.averageStars);
        output.append(", ");
        output.append(this.priceCategory);
        for (String movie: this.movies) {
            output.append(", ");
            output.append(movie);
        }

        return output.toString();
    }

    public static class TheaterReview extends Review {
        private String movie;

        public TheaterReview(String body, String author, int stars) {
            super(body, author, stars);
            this.movie = "";
        }

        public TheaterReview(String body, String author, int stars, String movie) {
            super(body, author, stars);
            this.movie = movie;
        }

        @Override
        public String toString() {
            StringBuilder output = new StringBuilder();

            output.append(this.getBody());
            output.append(", ");
            output.append (this.getAuthor());
            output.append(", ");
            output.append(this.getStars());
            if (this.movie != "") {
                output.append(", ");
                output.append(this.movie);
            }
            return output.toString();
        }
    }
}
