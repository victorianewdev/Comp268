import textio.TextIO;

/**
 * A program that reads a integer that is typed in by the user and computes and prints the square of the integer.
 */

 public class PrintSquare {

    public static void main(String[] args) {

        int userInput;       // The number input by the user.
        int square;         // the userInput, multiplied by itself.

        System.out.print("Please type a number: ");
        userInput = TextIO.getlnInt();
        square = userInput * userInput;

        System.out.println("\nThe number that you entered was " + userInput + "\nThe square of that number is " + square + "\n\n");

        
    }
 }