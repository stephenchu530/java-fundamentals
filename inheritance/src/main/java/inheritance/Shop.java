package inheritance;

import java.util.ArrayList;

public class Shop {
    private String name;
    private String description;
    private int priceCategory;
    private int averageStars;
    private int subTotalStars;
    private int numberOfReviews;
    private ArrayList<Review> reviews;

    public Shop(String name, String description, int priceCategory) {
        this.name = name;
        this.description = description;
        this.priceCategory = priceCategory;
        this.averageStars = 0;
        this.subTotalStars = 0;
        this.numberOfReviews = 0;
        this.reviews = new ArrayList<>();
    }

    public int getAvgStar() {
        return this.averageStars;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name);
        output.append(", ");
        output.append(this.description);
        output.append(", ");
        output.append(this.averageStars);
        output.append(", ");
        output.append(this.priceCategory);

        return output.toString();
    }

    public void addReview(Review review) {
        this.reviews.add(review);
        this.subTotalStars += review.getStars();
        this.numberOfReviews++;
        this.averageStars = this.subTotalStars / this.numberOfReviews;
    }
}
