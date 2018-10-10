import javax.swing.JOptionPane;
import java.lang.NumberFormatException;
public class LoopInLoop{
    public static void main(String[] args){
        int input;
        try{
            input = Integer.parseInt(JOptionPane.showInputDialog(null,"What's the number of lines you want?" ));
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Invalid value!");
            return;
        }
        for(int x=0; x<input; x++){
            for(int i=0; i<=0; i++){
                System.out.println(x+","+i+x+","+i);
            }
        }
    }
}