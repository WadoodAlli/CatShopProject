package catalogue;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * BetterBasket enhances the Basket class with additional functionality.
 * 
 * @author 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Sorts the items in the basket by name in alphabetical order.
     */
    public void sortByName() {
        List<Item> items = getItems(); // Assuming Basket has a method getItems() that returns a List<Item>
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return i1.getName().compareTo(i2.getName());
            }
        });
    }

    /**
     * Sorts the items in the basket by price in ascending order.
     */
    public void sortByPrice() {
        List<Item> items = getItems();
        Collections.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item i1, Item i2) {
                return Double.compare(i1.getPrice(), i2.getPrice());
            }
        });
    }

    /**
     * Calculates the total price of all items in the basket.
     * 
     * @return the total price of the items
     */
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Item item : getItems()) {
            total += item.getPrice() * item.getQuantity(); // Assuming Item has getPrice() and getQuantity() methods
        }
        return total;
    }


}
