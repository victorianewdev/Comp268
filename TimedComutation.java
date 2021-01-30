/**
* This program performs some mathematical computations and displays the results.  It also displays the valuse of the constant
* Math.PI.  It then reports the number of seconds that the computer spent on this task.
*/

public class TimedComputation {

  public static void main(String[] args) {

    long startTime;   // Starting time of program, in nanoseconds.
    long endTime;     // Time when computations are done, in nanoseconds
    long compTime;    // Run time in nanoseconds
    double seconds;   // Time difference in seconds

    startTime = System.nanoTime();

    double width, height, hypontenuse;    // sides of a triangle
    width = 42.0;
    height = 17.0;
    hypontenuse = Math.sqrt (width*width + height*height);
    System.out.print("A triangle with sides 42 and 17 has hypontenuse");
    System.out.println(hypontenuse);

    System.out.println(\nMathimatically, sin(x)*sin(x))
  }

}
