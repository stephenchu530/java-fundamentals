package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public Review(String body, String author, int stars) {
        this.body = body;
        this.author = author;

        if (stars < 0) stars = 0;
        if (stars > 5) stars = 5;
        this.stars = stars;
    }

    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(this.author);
        output.append(", ");
        output.append(this.stars);
        output.append(", ");
        output.append(this.body);
        return output.toString();
    }

    public int getStars() {
        return this.stars;
    }
}
