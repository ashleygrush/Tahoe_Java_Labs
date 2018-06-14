package part_03;


import java.util.Scanner;

/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    //main method
    public static void main(String[] strings) throws java.io.IOException {

        //scanner to enter a number 0-2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");

        //create int variable "playerHand" that takes user input
        int playerHand = input.nextInt();

        //create int variable "computerHand" that generates a random number 0-2
        int computerHand = (int)(Math.random() * 2 + 0);

        //call the getHand method for the playerHand
        String player = getHand(playerHand);

        //call the getHand method for the computerHand
        String computer = getHand(computerHand);

        //create an String variable "winner" by calling the determineWinner() method with parameters computerHand and playerHand
        String winner = determineWinner(playerHand, computerHand);

        //print out the player hand and computer hand
        System.out.println("You entered " +player);
        System.out.println("Computer enters " +computer);
        //print out the winner
        System.out.println(winner);

    }

    // getHand method
    public static String getHand(int hand){
        // create a switch statement to determine each players hand - return the String, ie "scissor" that goes with the int "hand"
        // 0 = scissor, 1 = rock, 2 = paper

        switch (hand){
            case 0:
                return "0 = scissor.";
            case 1:
                return "1 = rock.";
            case 2:
                return  "2 = paper.";
        default:
            System.out.println("Not a valid entry.");
        }

        //this is a temporary return statement to squash error - you'll need to update
        return "re-enter a key between 0-2.";
    }

    //determineWinner method returns a String such as "You won!" or "You lost :(" or "You tied!"
    public static String determineWinner(int player, int computer) {

        String status = "";

        // determine if the game is a tie
        if (computer == player){
            System.out.println("Game is a tie.");
        }

        // if it is not a tie, use a switch statement and a turnery operator to determine the winner
        if (computer != player) {
            switch (player) {
                case 0:
                    status = (computer != 1) ? "You won!" : "You lost...";
                    break;
                case 1:
                    status = (computer != 2) ? "You won!" : "you lost...";
                    break;
                case 2:
                    status = (computer != 0) ? "You won!" : "you lost...";
                    break;
            }

        }return status;
    }
}





