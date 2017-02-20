// What if the user enters 0?
import java.util.*;

public class DoWhileDemoBlindToFalse
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer between 1 and 5.");
    String[] beatles = ["John", "Ringo", "Paul"]
    System.out.println
    int userInt = sc.nextInt(beatles);
    // act before evaluating a condition
    do
    {
      System.out.println("the value of the integer you entered is: " + userInt + " and I will now increase it.");
      userInt++; // increment after action
    }
    while(userInt > 0 & userInt < 6);
    System.out.println("This loop will iterate at least one time, even if the condition is false.");
  }
}