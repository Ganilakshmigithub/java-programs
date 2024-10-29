package Spring.Core.Shopping;

import org.springframework.stereotype.Component;

@Component // Make this class a Spring-managed component
public class ShoppingCart {

    // Method to add an item to the cart
    public void addItem(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Item is null; cannot add.");
        } else {
            System.out.println("Adding item: " + item);
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String item) {
        if (item == null) {
            throw new IllegalArgumentException("Error while removing; item is null.");
        } else {
            System.out.println("Removing item: " + item);
        }
    }

    // Method to list items in the cart
    public void listItems() {
        System.out.println("Listing items in the cart.");
    }
}
