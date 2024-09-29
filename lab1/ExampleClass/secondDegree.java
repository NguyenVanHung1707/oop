// Bài 2.2.6
//Tìm nghiệm của hệ phương trình

import java.util.Scanner;

public class secondDegree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a1: ");
        double a1 = sc.nextDouble();
        System.out.print("Nhập b1: ");
        double b1 = sc.nextDouble();
        System.out.print("Nhập c1: ");
        double c1 = sc.nextDouble();
        System.out.print("Nhập a2: ");
        double a2 = sc.nextDouble();
        System.out.print("Nhập b2: ");
        double b2 = sc.nextDouble();
        System.out.print("Nhập c2: ");
        double c2 = sc.nextDouble();
        
        double det = a1 * b2 - a2 * b1;
        if (det == 0){
            if (c1 / c2 == a1 / a2) {
                System.out.println("Hệ phương trình có vô số nghiệm.");
            }
            else {
                System.out.println("Hệ phương trình vô nghiệm.");
            }
        } 
        else {
            double x = (c1 * b2 - c2 * b1) / det;
            double y = (a1 * c2 - a2 * c1) / det;
            System.out.println("Nghiệm của hệ phương trình là:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
       
    }
}