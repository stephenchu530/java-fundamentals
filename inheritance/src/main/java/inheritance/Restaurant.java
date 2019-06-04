package inheritance;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;
    private ArrayList<Review> reviews;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;

        if (stars < 0) stars = 0;
        if (stars > 5) stars = 5;
        this.stars = stars;

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
        output.append(this.averageStars());
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
}
