import textio.TextIO;

public class part3 {
    public static void main(String[] args) {
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
        
        String firstName, name;
        String last;
        int position;


        System.out.print("\n\n\nPlease enter your first and last name, seperated by a space.  ");
        name = TextIO.getln();

        position = name.indexOf(" ");
        firstName = name.substring(0, position);
        last = name.substring(position);

        System.out.println("\n\nYour first name is " + firstName + ", which is " + firstName.length() + " characters.\nYour last name is " + last + ", which is " + last.length() + " characters.");
        System.out.println("Your initials are "+ firstName.charAt(0) + last.charAt(1) + "\n\n");

        //System.out.println("\n\n your name is " + firstName);

}
}