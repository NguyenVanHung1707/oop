// bài 2.2.5
import javax.swing.JOptionPane;

public class calculate {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNotification = "You're just entered: ";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        strNotification += strNum2;

        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);

        double tong = num1+num2;
        double hieu = num1 - num2;
        double tich = num1 * num2;
        int thuong = (int)(num1/num2);
        JOptionPane.showMessageDialog(null,"Tổng hai số: " + tong);
        JOptionPane.showMessageDialog(null,"Hiệu hai số: " + hieu);
        JOptionPane.showMessageDialog(null,"Tích hai số: " + tich);
        JOptionPane.showMessageDialog(null,"Thương hai số: " + thuong);
    }
}