/*
  Student:
    s15 Laura Kirby
  Usage:
    java UserInput
  Application description:
    1. prompt the user to input an integer
    2. store the input in a variable
    3. prompt the user for a second value
    4. store it in a different variable

    5. process the two variables using:
        a. relational operator
        b. logical operators
        c. Ex: (relational) and & or | (logical)
    6. show a result to the user
    7. place the operators in an `if`  condition to display a message to the user if the condition evaluates to true or false
        a. you may use more than one if condition
        a. see Lecture 2: Data Types#Combiningrelationalandlogicaloperators
 */
import java.util.*;
class UserInputHwTwo
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a whole number between -100 and 100.");
        int userIntOne = myScanner.nextInt();

        System.out.println("Enter a second whole number between -100 and 100.");
        int userIntTwo = myScanner.nextInt();

        if (userIntOne >= 0 && userIntTwo >= 0)
        {
            System.out.println("You have entered two positive numbers.");
        }
        else if (userIntOne >= 0 || userIntTwo >= 0)
        {
            System.out.println("You have entered at least one positive number.");
        }
    }
}