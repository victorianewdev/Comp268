


import textio.TextIO;

public class CreateProfile {

  public static void main(String[] args) {

    String name;      // The user's name.
    String email;     // The user's email address.
    double salary;    // The user's yearly salary.
    String favColor;  // The user's favorite color.

    TextIO.putln("Good Afternoon!  This program will create");
    TextIO.putln("your profile file, if you will just answer");
    TextIO.putln("a few simple questions.");
    TextIO.putln();

    /* Gather response from the user. */

    TextIO.put("What is your name?        ");
    name = TextIO.getln();

    TextIO.put("What is your email address?       ");
    email = TextIO.getln();

    TextIO.put("What is your yearly income?       ");
    salary = TextIO.getlnDouble();

    TextIO.put("What is your favourite color?     ");
    favColor = TextIO.getln();

    /* Write the user's information to the file name profile.text */

    TextIO.writeFile("profile.text");

    TextIO.putln("Name:   " + name);
    TextIO.putln("Email:  " + email);
    TextIO.putln("Favorite Color:   " + favColor);
    TextIO.putf( "Yearly Income:  %,1.2f%n", salary);

    /* Print a final message to standard output. */

    TextIO.writeStandardOutput();
    TextIO.putln("Thank you.  Your profile has been written to profile.txt");


  }
}
