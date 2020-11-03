import java.util.Random;
import javax.swing.JOptionPane;

public class GuessingGame{

  public static void main(String[] args){
    String usernum = JOptionPane.showInputDialog(null, "Choose a number from 0 to 10");
    int num = Integer.parseInt(usernum);
    Random rand = new Random();
    int rannum = rand.nextInt(10);

    if(rannum == num){
      JOptionPane.showMessageDialog(null, "You guessed the right number! " + rannum);
    } else if(rannum != num) {
      JOptionPane.showMessageDialog(null, "Sorry, you didn't guess the right number. " + rannum);
    }
  }
}