import javax.swing.JOptionPane;

public class Fibbonacci{
    public static void main(String[] args){
        int input;
        String n = "+";
        input = Integer.parseInt(JOptionPane.showInputDialog(null, "What's the number of lines you want?"));
        for (int i=1; i<=input; i++ ){
            System.out.println(n);
            n = n+"+";
            /* for (int j=1; j<=i; j++)
                System.out.print("+");
            System.out.println();
                */
        }

    }
}