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

class LoopsHwThree
{
    public static void main(String[] args)
    {
        String myName = "Laura";
        String lowerName = myName.toLowerCase();
        char[] name = lowerName.toCharArray();

        // 1. if ...else if ... else if ... else ladder
        // String comparision likely doesn't work because they are two different objects. I will have to do a char comparison
        System.out.println("1) if ...else if ... else if ... else ladder.\n\t- Experiement with the String object, fail for a while - experiement with char comparisions.");
        if (!lowerName.matches("[a-zA-Z]+"))
            System.out.println("Please enter letters 'a' through 'z'.");
        else if (name[0] == 'l' && lowerName.length() <= 7)
            System.out.println("You are correct, my name starts with the letter 'L' and is between 1 and 7 characters long.");
        else if (name[0] == 'l')
            System.out.println("You are correct, my name starts with the letter 'L'");
        else if (lowerName.length() <= 7)
            System.out.println("You are correct, my name is between 1 and 7 characters long.");
        else
            System.out.println("Please try again. \nHint: it rhymes with 'Cora'");

        // 2. switch with cases
        System.out.println("2) Switch with cases.\n\t- View random thoughts about colors depending on the case (aka color)");
        String RED = "red";
        String BLUE = "blue";
        String PURPLE = "purple";
        String color = PURPLE;

        switch(color)
        {
            case "red" :
                System.out.println("We have landed on 'red', the first color of the rainbow.");
                break;
            case "orange":
                System.out.println("The only color of the rainbow that share's its name with a kind of fruit.");
                break;
            case "yellow":
                System.out.println("The color of the large object heating out planet");
                break;
            case "green" :
                System.out.println("We get this color after mixing yellow and blue");
                break;
            case "blue":
                System.out.println(BLUE + " is often associated with the color of water.");
                break;
            case "purple":
                System.out.println("Jimi Hendrix named a song with this color as part of the title.");
                break;
        }

        // 3. while loop
        System.out.println("3) Create a while loop.\n\t- Loop from 20 to 0 by twos");
        int count = 20;
        while (count >= 0) {
            System.out.print(count + ", ");
            count -= 2;
        }

        // 4. do-while loop
        // int systemStartProcess[] = new int[10]
        System.out.println("\n 4) do-while loop\n\t- Illustrate a process starting regardless of current state.\n\t- Begin computer startup:\n");
        int systemStartProcess[] = {1,1,1,1,1,1,1,0,1,1};
        int startUpPosition = 0;

        do {
          if (systemStartProcess[startUpPosition] == 0) System.out.println("\n Warning ");
          System.out.print("\n. . . . . . .\n");
          startUpPosition ++;
        } while (startUpPosition <  systemStartProcess.length);

        // 5. for loop - the tradition form with three statements in the parentheses
        System.out.println("\n 4) do-while loop");
        for (int i = 0; i < systemStartProcess.length; i++) {
          if (systemStartProcess[i] == 1) System.out.print("\n. . . . . . .\n");
          else if (systemStartProcess[i] == 0) System.out.println("\n Warning ");
        }

        // 6. for each loop that processes an array
        System.out.println("\n 6) for each loop that processes an array");

    }
}
