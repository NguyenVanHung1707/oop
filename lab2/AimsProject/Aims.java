import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("lac loi", "nhac tre", "a2df", 2, 3.4f);
        anOrder.addDigitalVideoDisc(dvd1);
        System.out.println("Total Cost in: "+ anOrder.totalCost());
    
}
}
