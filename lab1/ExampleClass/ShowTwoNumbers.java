//2.2.4
import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strNofication = "you've just entered ";

        strNum1 = JOptionPane.showInputDialog(null,"please input the fist number:","input the fist number",JOptionPane.INFORMATION_MESSAGE);
        strNofication += strNum1 + " and ";

        strNum2 = JOptionPane.showInputDialog(null,"please input the second number:","input the second number",JOptionPane.INFORMATION_MESSAGE);
        strNofication += strNum2 ;
        JOptionPane.showMessageDialog(null,strNofication,"Show two numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
