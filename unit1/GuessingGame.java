import java.util.Scanner;
import javax.swing.JOptionPane;

import jdk.nashorn.internal.scripts.JO;

public class GuessingGame
{
    public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            int count = 0;
            // random number generator
            int a = 1 + (int) (Math.random()*19);
            int guess = 0;

            System.out.println("I'm thinking of number between 1 and 20" + "... gues what it is?");

            while (guess != a){
                  //guess = keyboard.nextInt();
                  guess = Integer.parseInt(JOptionPane.showInputDialog("I'm thinking of number between 1 and 20" + "... gues what it is?"));
                  count++;
                  if (guess > a){
                        //System.out.println("My nymber is lower! Guess again!");
                        JOptionPane.showMessageDialog(null, "My nymber is lower! Guess again!");
                  }
                  else if (guess < a){
                        //System.out.println("My number is higher! Guess again!");
                        JOptionPane.showMessageDialog(null, "My number is higher! Guess again!");
                  }
                  if(count == 10){
                        break;
                  }
            }
            if (count != 10){
                  //System.out.println("Congratulations you guessed the number with " + count + " tries");
                  JOptionPane.showMessageDialog(null, "Congratulations you guessed the number with " + count + " tries");      
            }
            else {
                  //System.out.println("You lost! You used all 10 guesses!");
                  JOptionPane.showInputDialog(null, "You lost! You used all 10 guesses!");     
            }

            
      }

}



