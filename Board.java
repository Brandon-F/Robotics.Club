import java.util.Arrays;
import java.util.Scanner;

public class Board extends TicTacToe {

    public Scanner inputGet = new Scanner(System.in);
    
    public void drawboard(String[] boardGet){
        System.out.println("   |   |   ");
        System.out.println(" "+boardGet[0]+" | "+boardGet[1]+" | "+boardGet[2]+" ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" "+boardGet[3]+" | "+boardGet[4]+" | "+boardGet[5]+" ");
        System.out.println("___|___|___");
        System.out.println("   |   |   ");
        System.out.println(" "+boardGet[6]+" | "+boardGet[7]+" | "+boardGet[8]+" ");
        System.out.println("   |   |   ");
    }

    public String winnerGet(String[] b, int spacesLength){
        if ((b[0] == b[4]) && (b[4] == b[8]) || (b[6] == b[4]) && (b[4] == b[2]) || (b[3] == b[4]) && (b[4] == b[5]) || (b[1] == b[4]) && (b[4] == b[7])){
            return b[4];
        }
        if ((b[0] == b[6]) && (b[0] == b[3]) || (b[0] == b[1]) && (b[0] == b[2])){
            return b[0];
        }
        if ((b[8] == b[7]) && (b[8] == b[6]) || (b[8] == b[5]) && (b[8] == b[2])){
            return b[8];
        }

        if (spacesLength == 0) {
            return "T";
        }
        return " ";
    }

    public String userInput(String[] outputs){
        while (true){
            String input = inputGet.nextLine();
            if (Arrays.asList(outputs).contains(input)){
                return input;
            }

        }
        
    }

}
