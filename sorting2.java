import java.util.*;

class Product implements Comparable<Product> {

    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    @Override
    public int compareTo(Product other) {

        int priceComparison = Double.compare(other.price, this.price);

        if (priceComparison == 0) {
            return this.productName.compareToIgnoreCase(other.productName);
        }

        return priceComparison;
    }

    @Override
    public String toString() {
        return productName + " " +price;
    }
}

public class sorting2 {

    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Laptop", 55000));
        products.add(new Product(102, "Mouse", 800));
        products.add(new Product(103, "Keyboard", 1500));
        products.add(new Product(104, "Monitor", 12000));
        products.add(new Product(105, "Phone", 55000));
        products.add(new Product(106, "Tablet", 12000));

        Collections.sort(products);

        System.out.println("Products sorted by price:");

        for (Product p : products) {
            System.out.println(p);
        }
    }
}