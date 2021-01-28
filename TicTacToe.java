import java.util.Random;
import java.util.ArrayList;
public class TicTacToe {
    public static void main(String[] args){
        Random r = new Random();
        int rand;
        String[] board = {" "," "," "," "," "," "," "," "};
        //Create board object
        Board gameBoard = new Board();
        //set game state
        boolean playing = true;
        System.out.println("Hello! Welcome to TicTacToe!");

        while(playing){
            for (int i = 0; i < board.length; i++) {
                board[i] = String.valueOf(i+1);
            }
            //Create arraylist with all values
            ArrayList<Integer> spaces = new ArrayList<Integer>();
            spaces.add(0);
            spaces.add(1);
            spaces.add(2);
            spaces.add(3);
            spaces.add(4);
            spaces.add(5);
            spaces.add(6);
            spaces.add(7);
            spaces.add(8);
            //Randomize the player letter
            rand = r.nextInt(2);
            String player;
            String ai;
            int index;
            //Notifies player of their letter
            if (rand == 0) {
                player = "X";
                ai = "O";
                System.out.println("You are in X! You go!");
            }
            else{
                player = "O";
                ai = "X";
                System.out.println("You are O! You go!/n");
            }
            if (ai == "X") {
                rand = r.nextInt(spaces.size());
                index = spaces.get(rand);
                board[index] = "X";
                spaces.remove(rand);
            }
            String winner = " ";
            while (winner == " ");
            gameBoard.drawboard(board);
            System.out.println("Type the number of the square you would like to place your " + player +"on.");
            int choice = -1;
            //Parse number
            while(!spaces.contains(choice)){
                String temp = gameBoard.userInput(new String[]{"1","2","3","4","5","6","7","8"});
                choice = Integer.parseInt(temp);
                choice =- 1;
            }
            //Assign the player the value that they choose
            board[choice] = player;
            //Remove that index since the user chose it
            spaces.remove(spaces.indexOf(choice));
            
            winner = gameBoard.winnerGet(board, spaces.size());

            if (winner == " ") {
                gameBoard.drawboard(board);
                System.out.println("The AI has its turn. /n");
                //Let the ai choose from the available indexes
                rand = r.nextInt(spaces.size());
                index = spaces.get(rand);
                board[index] = ai;
                spaces.remove(rand);
                winner = gameBoard.winnerGet(board, spaces.size());

            //Draw the board and decide winner/tie
            gameBoard.drawboard(board);
            if (winner == player) {
                System.out.println("You win! congrats! /n");
            }
            else if (winner == ai) {
                System.out.println("The ai wins!");
            }
            else{
                System.out.println("it was a tie!");
            }
            //Ask the user if they want to play again
            System.out.println("Do you want to play again?");
            String reply = gameBoard.userInput(new String[]{"Y","N","y","n"});

            if(reply.equals(("N"))|| reply.equals("n")) {
                playing = false;
            }
        }
    }
}
}
