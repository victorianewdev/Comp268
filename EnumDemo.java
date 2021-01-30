public class EnumDemo {
     
    enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
    enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

    public static void main(String[] args) {
        Day tgif;
        Month libra;

        tgif = Day.FRIDAY;
        libra = Month.OCT;

        System.out.println("My sign is libra, since I was born in " + libra);
        System.out.println("That's the " + libra.ordinal() + "-th month of the year.\n      (Counting from 0 of course!)");
        System.out.println("Isn't it nice to get to " + tgif);
        System.out.println( tgif + " is the " + tgif.ordinal() + "-th day of the week.");
        
    }
}