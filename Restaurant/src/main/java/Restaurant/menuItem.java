package Restaurant;

import java.util.Date;

public class menuItem {


    private String name;
    private String description;
    private double price;
    private String category;
    private Date dateAdded;

    public menuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = new Date();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + "\n" +
                description + "\n" +
                category.toUpperCase() + " | $" + price;
    }
Boolean isNew() {
        return true;
}


}