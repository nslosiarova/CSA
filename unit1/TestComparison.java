import javax.swing.JOptionPane;

public class TestComparison 
{
    public static void main(String[] args) {
       int input1;
       String message1 = "Write first value:";
       input1 = Integer.parseInt(JOptionPane.showInputDialog(message1));

       int input2;
       String message2 = "Write second value:";
       input2 = Integer.parseInt(JOptionPane.showInputDialog(message2));

       JOptionPane.showMessageDialog(null, input1+input2);

    }
}