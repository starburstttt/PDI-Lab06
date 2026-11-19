package ex8_catalog;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> catalog = new ArrayList<>();
        catalog.add(new Electronics("Laptop", 999.99, 24));
        catalog.add(new Clothing("Jacket", 79.50, "L"));
        catalog.add(new Book("Effective Java", 45.00, "Joshua Bloch"));

        for (Product p : catalog) {
            System.out.println(p.getInfo());
        }
    }
}
