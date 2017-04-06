import java.util.*;

class Utility
{
    int multiply(int firstInt, int secondInt)
    {
        return firstInt * secondInt;
    }
}
class UtilityDemo
{
    public static void main(String[] args)
    {
        Utility myUtility = new Utility();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String userAnswer = myScanner.nextLine();
        System.out.println("Your name is " + userAnswer);
        System.out.println("Let's multiply two integers.");
        System.out.println("Type in an integer.");
        int myFirstInt = myScanner.nextInt();
        System.out.println("Type in an second integer.");
        int mySecondInt = myScanner.nextInt();
        int productFromMethodCall = myUtility.multiply(myFirstInt, mySecondInt);
        System.out.println("The product is: " + productFromMethodCall);
    }
}