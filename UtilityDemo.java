import java.util.*;

// set up class
class Utility
{
    int multiply(int firstInt, int secondInt)
    {
        return firstInt * secondInt;
    }
}

// run time
class UtilityDemo
{
    public static void main(String[] args)
    {
        // instantiate an instance of a class that has a method for a calculation
        Utility myUtility = new Utility();

        // instantiate a scanner to accept keyboard input
        Scanner myScanner = new Scanner(System.in);

        // prompt the user to do something
        System.out.println("What is your name?");

        // store the user's response in a variable
        // by calling a methon on the scanner object
        String userAnswer = myScanner.nextLine();

        // reference the variable
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

// constructor will initialize instance of object