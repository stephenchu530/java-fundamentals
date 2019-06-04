package inheritance;

public class Restaurant {
    private String name;
    private int stars;
    private int priceCategory;

    public Restaurant(String name, int stars, int priceCategory) {
        this.name = name;

        if (stars < 0) stars = 0;
        if (stars > 5) stars = 5;
        this.stars = stars;

        if (priceCategory < 1) priceCategory = 1;
        if (priceCategory > 4) priceCategory = 4;
        this.priceCategory = priceCategory;
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.name);
        output.append(" has ");
        output.append(this.stars);
        output.append(" of 5 stars and is ");
        output.append(this.priceCategory);
        output.append(" out of 4 price category.");

        return output.toString();
    }
}
