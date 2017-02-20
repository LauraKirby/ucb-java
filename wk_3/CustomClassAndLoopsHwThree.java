/*
  Student:
    s15 Laura Kirby
  Usage:
    java UserInput
  Application description:
    1. if ...else if ... else if ... else ladder
    2. switch with cases
    3. while loop
    4. do-while loop

    5. for loop - the tradition form with three statements in the parentheses

    6. for each loop that processes an array

 */
import java.util.*;
// class Iterators
// {
//     int numberForLoop()
//     {
//
//     }
// }

class CustomClassAndLoopsHwThree
{
    public static void main(String[] args)
    {

        System.out.println("Guess my name.");
        Scanner myScanner = new Scanner(System.in);
        String userGuess = System.in.read();
        int count = 1;

        for (; userGuess != "laura"; count++)
        {
            System.out.println(userGuess);
            do {
              char ignore = System.in.read();
            } while (ignore != '\n');


            if (userGuess == "laura")
            {
                System.out.println("You are correct, my name is Laura");
                userGuess = System.in.read();
            }
            else if (userGuess.charAt(0))
            {
                System.out.println("You are correct, my name starts with the letter 'L' and is between 1 and 7 characters long.");
                System.out.println("Attempt: " + count);
                userGuess = System.in.read();
            }
            else if (userGuess.length() > 7)
            {
                System.out.println("You are correct, my name is between 1 and 7 characters long.");
                System.out.println("Attempt: " + count);
                userGuess = System.in.read();
            }
            else if (!userGuess.matches("[a-zA-Z]+"))
            {
                System.out.println("Please enter letters 'a' through 'z'.");
                System.out.println("Attempt: " + count);
                userGuess = System.in.read();
            }
            else
            {
                System.out.println("Please try again. \nHint: it rhymes with 'Cora'");
                System.out.println("Attempt: " + count);
                System.out.println("user guess " + userGuess);
                System.out.println("user guess " + userGuess.length());
                userGuess = System.in.read();
            }

        }
        System.out.println("Good job! You guessed my name in " + count + "tries.");



      // else if (userGuess.getClass() != String.class)
      // {
      //     System.out.println("Please enter letters 'a' through 'z'");
      // }

    }
}
