package raffaelecaravetta;

import java.util.Random;

public class Product {
    Long id;
    String name;
    String category;
    String price;
    public Product( String name, String category, String price) {
        Random random = new Random();
        this.id= random.nextLong(1000000000);
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
