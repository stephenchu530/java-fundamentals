package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int priceCategory) {
        this.name = name;

        this.stars = 0;

        if (priceCategory < 1) priceCategory = 1;
        if (priceCategory > 4) priceCategory = 4;
        this.priceCategory = priceCategory;

        this.reviews = new ArrayList<>();
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();

        output.append(this.name);
        output.append(", ");
        output.append(this.stars);
        output.append(" average stars, ");
        output.append(this.priceCategory);
        output.append(" price category, ");
        output.append(this.reviews.size());
        output.append(" reviews.");

        return output.toString();
    }

    private int averageStars() {
        int sum = 0;

        for (Review review: this.reviews) {
            sum += review.getStars();
        }
        if (sum == 0) return 0;
        return sum / this.reviews.size();
    }

    public void addReview(Review review) {
        if (!this.reviews.contains(review)) {
            this.reviews.add(review);
            this.stars = this.averageStars();
        }
    }
}
