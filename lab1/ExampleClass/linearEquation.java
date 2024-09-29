
// bài 2.2.6
// Tìm nghiệm của phương trình ax+b=0;

import java.util.Scanner;

public class linearEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        double a = sc.nextDouble();
        System.out.println("Nhập số b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm !");
            }
        } else {
            double result = -b / a;
            System.out.println("Kết quả x: " + result);
        }
    }
}