/**
 *This class impliments a simple program that willcompute the amount of interest that is earned on $17,000 invested at an interest rate
 *of 0.027 for one year. The interst and the value of the investment after one year are printed to standard output.
 */
public class chpt2 {
    public static void main(String[] args)

    /* Declare the variables. */

    double principal;   //the value of the investment
    double rate;        //the annual interest rate
    double interest;    //interest earned in one year

    /* Declare the computations. */

    principal = 17000;
    rate = 0.027;
    interest = principal * rate;    //Compute the interest.

    principal = principal + interest;
            //compute value of investment afterone year, with interst.
            //(Note: The new value replaces the old value of prinicipal)

    /* Output the results */

    System.out.print("The interest earned is $");
    System.out.println(interest);
    System
}