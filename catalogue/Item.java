package catalogue;

public class Item {
    private String name;
    private double price;
    private int quantity;

    // Constructor to initialize the Item
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter method for the name
    public String getName() {
        return name;
    }

    // Setter method for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for the price
    public double getPrice() {
        return price;
    }

    // Setter method for the price
    public void setPrice(double price) {
        this.price = price;
    }

    // Getter method for the quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter method for the quantity
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Method to calculate the total price of the item based on its quantity
    public double getTotalPrice() {
        return price * quantity;
    }

    // Override the toString method for a meaningful representation of an item
    @Override
    public String toString() {
        return "Item{name='" + name + "', price=" + price + ", quantity=" + quantity + "}";
    }
}
