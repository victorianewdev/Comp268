
import textio.TextIO;

 public class chpt2 {
   
    public static void main(String[] args) {

        /**Exercises for Chapter 2 */

        /** 1. Write a program that will print your inititals to standard output in letters that are nine lines tall.  Eache big letter should be made up of a buch of *'s.  For example
         * if your initials were "DJE", the the output would look something like: (please see text, I am not interested in copying it)
         */

        System.out.println("****           *****   *******     ****        ");
        System.out.println(" **             **      ** **       **         ");
        System.out.println("  **           **       **  **      **         ");
        System.out.println("   **         **        **   **     **         ");
        System.out.println("    **       **         **    **    **         ");
        System.out.println("     **     **          **     **   **         ");
        System.out.println("      **   **           **      **  **         ");
        System.out.println("       ** **            **       ** **         ");
        System.out.println("        ****            **        ****         ");

        /** 2. Write a program tha simulates rolling a pair of dice.  You can simulate rolling one die by choosing one the integers 1, 2, 3, 4, 5, or 6 at random.  The number you pick represents the
         * number on the die after it is rolled. As pointed out in Section 2.5, the expression (int)(Math.random()*6) +1  does the computation to select a random integer between 1 and 6.  You can assign
         * this value to a valuable to represent on of the dice being rolled.  Do this twice and add the results toghether to get the total roll.  Your program should report the number showing on each
         * die as well as the total roll.  For example: 
         * The first die comes up 3
         * The second die comes up 5
         * Your total roll is 8
        */

        int dieOne;
        int dieTwo;

        dieOne = (int)(Math.random() * 6) + 1;
        dieTwo =(int)(Math.random() * 6) + 1;

        System.out.println("\n\nThe first die comes up: "+ dieOne + "\nThe second die comes up:"+ dieTwo  + "\nYour total roll is: " + (dieOne + dieTwo)+ "\n\n");

        /*3. Write a program that asks the user's name, and then greets the user by name.  Before outputting the user's name convert it to upper case letters.  For example, if the user's name is Fred,
        /*then the program should respond "Hello, FRED, nice to meet you" */

        String name;

        System.out.print("Hello, what is your name?  ");
        name = TextIO.getln();

        System.out.println("\nHello " + name.toUpperCase() + ", nice to meet you\n");

        /** 4. Write a program that helps the user count his change.  The program should ask how many quarters the user has, then how many dimes, then how many nickels, then how many pennies.  Then
         * the program should tell the user how much money he has, expressed in dollars.
         */

         double quarters, dimes, nickels, pennies, total;
         

         System.out.print(name + " how many quarters do you have? ");
         quarters = (TextIO.getInt()) * 0.25;
         
         System.out.print("\nHow many dimes do you have? ");
         dimes = (TextIO.getInt())* 0.1;
         
         System.out.print("\nHow many nickels do you have? ");
         nickels = (TextIO.getInt() * 0.05);
         
         System.out.print("\nHow many pennies do you have? ");
         pennies = (TextIO.getInt() * 0.01);

         total = quarters + dimes + nickels + pennies;

         System.out.printf("\n\nYou have $%1.2f\n\n", total);

         /** 5. IF you have N eggs, then you N/12 dozen eggs, with N%12 eggs left over. (This is essencially the definition of the / and % operators for integers.)  Write a program that asks
          * the user how many eggs she has and then tells the user how many dozen eggs she has and how many extra eggs are left over.
          * 
          * A gross of eggs is equal to 144 eggs. Extend your program so that it will tell the user how many gross, how many dozen, and how many left over eggs she has.  For example, if the user says
          * that she has 1342 eggs, then your program should respond with Your number of eggs is 9 gross, 3 dozen, and 10.
          */

          int eggs, gross;

        System.out.print("Hello "+ name +", how many eggs do you have? ");
        eggs = TextIO.getInt();

        gross = eggs/144; eggs = eggs - (gross * 144);

        System.out.print("\n\n Your number of eggs are "+ gross + " gross, "+ (eggs/12) +" dozen, and " + (eggs%12) + "\n\n");

        /*
         * 6. This exercise asks you to write a program that tests some of the built-in
         * subroutines for working with Strings. The program should ask the user to
         * enter their first name and their last name, separated by a space. Read the
         * user’s response using TextIO.getln(). Break the input string up into two
         * strings, one containing the first name and one containing the last name. You
         * can do that by using the indexOf() subroutine to find the position of the
         * space, and then using substring() to extract each of the two names. Also
         * output the number of characters in each name, and output the user’s initials.
         * (The initials are the first letter of the first name together with the first
         * letter of the last name.) A sample run of the program should look something
         * like this: Please enter your first name and last name, separated by a space.
         * ? Mary Smith Your first name is Mary, which has 4 characters Your last name
         * is Smith, which has 5 characters Your initials are MS
         */

        //String firstName, fullName;
        //String last;
        //int position;

        System.out.print("\n\n\nPlease enter your first and last name, seperated by a space.  ");
        name = TextIO.getln();

        System.out.println("Your name is " + name);

        //position = fullName.indexOf(" ");
        //firstName = fullName.substring(0, position);
        //last = fullName.substring(position);

        //System.out.println("\n\nYour first name is " + firstName + ", which is " + firstName.length() + " characters.\nYour last name is " + last + ", which is " + last.length() + " characters.");
        //System.out.println("Your initials are " + firstName.charAt(0) + last.charAt(1) + "\n\n");

        /**
         * 7. Suppose that a file named “testdata.txt” contains the following information:
         * The first line of the file is the name of a student. Each of the next three
         * lines contains an integer. The integers are the student’s scores on three
         * exams. Write a program that will read the information in the file and display
         * (on standard output) a message that contains the name of the student and the
         * student’s average grade on the three exams. The average is obtained by adding
         * up the individual exam grades and then dividing by the number of exams.
         * (solution)
         */
        String name2;
        int grade1, grade2, grade3, average;
    

         TextIO.readUserSelectedFile();
         name2 = TextIO.getWord();
         grade1 = TextIO.getInt();
         grade2 = TextIO.getInt();
         grade3 = TextIO.getInt();
         average = (grade1 + grade2 + grade3) / 3;

         System.out.println("Your name is " + name2 + " and your average grade is " + average + "\n\n");
    } 
    
} 

