import javax.swing.JOptionPane;
import java.lang.NumberFormatException;
public class Quiz{
    public static void main(String[]args){
        int firstValue;
        int secondValue;
        while(true){
            try{
                firstValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Write first value of the interval"));
                secondValue = Integer.parseInt(JOptionPane.showInputDialog(null, "Write second value of the interval"));
            }
            catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "Write NUMBER!");
                continue;
            }
            break;
        }
        for (int i = firstValue; i <=secondValue; i++){
            boolean prime = true;
            for(int a = 2; a<=i-1; a++){
                if(i % a == 0){
                    prime = false;
                    break;
                }
            }
            if (prime==true){
                System.out.println(i);
            }
        }
    }
}