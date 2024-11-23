import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    // Function to add an order to the cart
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
        } else {
            System.out.println("Cannot add more items, exceeds maximum allowed quantity!");
        }
    }


    // Function to remove an order from the cart
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            System.out.println("Removed: " + disc.getTitle());
        } else {
            System.out.println("DVD not found in cart.");
        }
    }
//hello hung
    // Total cost
    public float totalCost() {
        float total = 0;
        for (DigitalVideoDisc disc : itemsOrdered) {
            total += disc.getCost();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Cart contents:");
        for (DigitalVideoDisc disc : itemsOrdered) {
            System.out.println(disc);
        }
        System.out.println("Total Cost: $" + totalCost());
    }
}
