package algorithms.sort;

public class Product implements Comparable<Product> {
    String name;
    double rating;

    public Product(String name, double rating) {
        super();
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
        return this.getName() + ": " + this.rating;
    }

    @Override
    public int compareTo(Product product) {
        return Double.compare(this.getRating(), product.getRating());
    }
}