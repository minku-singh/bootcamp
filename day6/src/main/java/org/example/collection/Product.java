package org.example.collection;

public class Product implements Comparable<Product> {
    int id;
    String name;
    int price;
    String category;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        if (this.id > o.id) {
            return 1;
        }
        else if (this.id < o.id) {
            return -1;
        }
        else {
            return 0;
        }
    }
}
