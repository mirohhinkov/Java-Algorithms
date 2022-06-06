package algorithms.sort;

public class Product implements Comparable<Product> {
    private String name;
    private double rating;

    public Product(String name, double rating) {
        this.name = name;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return this.getName() + ": " + this.getRating();
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(this.getRating(), product.getRating());
    }
}
