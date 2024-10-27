import java.util.ArrayList;
import java.util.List;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private List<DigitalVideoDisc> itemsOrdered = new ArrayList<>();

    // hàm thêm 1 đơn hàng vào giỏ
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(disc);
        } else {
            System.out.println("Không thể mua thêm,vượt quá số lượng cho phép!");
        }
    }

    // hàm xóa 1 đơn hàng khỏi giỏ
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        if (itemsOrdered.remove(disc)) {
            System.out.println("Removed: " + disc.getTitle());
        } else {
            System.out.println("DVD not found in cart.");
        }
    }

    // hàm tính tổng tiền
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
