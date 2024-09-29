// bài 2.2.6 :Tìm nghiệm của pt bậc 2 a*x^2+b*x+c=0

import java.util.Scanner;

public class secondDegreeEquation {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Nghiệm của phương trình là:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } 
        else {
            double re = -b / (2 * a); 
            if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép:");
                System.out.println("x = " + re);
            } 
            else {
                double im = Math.sqrt(-delta) / (2 * a);
                System.out.println("Phương trình có nghiệm phức:");
                System.out.println("x1 = " + re + " + " + im + "i");
                System.out.println("x2 = " + re + " - " + im + "i");
            }
        }
    }
}