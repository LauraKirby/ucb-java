/*
  Student:
    s15 Laura Kirby
  Usage:
    java LoopsHwThree
  Application description:
    1. if ...else if ... else if ... else ladder
    2. switch with cases
    3. while loop
    4. do-while loop
    5. for loop - the traditional form with three statements in the parentheses
    6. for each loop that processes an array
 */

import java.util.*;

class LoopsHwThree
{
    public static void main(String[] args)
    {
        String myName = "Laurakirbyhi";
        String lowerName = myName.toLowerCase();
        char[] name = lowerName.toCharArray();

        // 1. if ...else if ... else if ... else ladder
        // String comparision likely doesn't work because they are two different objects. I will have to do a char comparison
        System.out.println("1) if ...else if ... else if ... else ladder.\n\t- Experiement with the String object, fail for a while - experiement with char comparisions:");
        if (!lowerName.matches("[a-zA-Z]+"))
            System.out.println("Please enter letters 'a' through 'z'.");
        else if (name[0] == 'l' && lowerName.length() <= 7)
            System.out.println("\tYou are correct, my name starts with the letter 'L' and is between 1 and 7 characters long.");
        else if (lowerName.charAt(0) == 'l')
            System.out.println("\tYou are correct, my name starts with the letter 'L'");
        else if (lowerName.length() <= 7)
            System.out.println("\tYou are correct, my name is between 1 and 7 characters long.");
        else
            System.out.println("\tPlease try again. \nHint: it rhymes with 'Cora'");
        System.out.println();

        // 2. switch with cases
        System.out.println("2) Switch with cases.\n\t- View random thoughts about colors depending on the case (aka color):");
        String RED = "red";
        String BLUE = "blue";
        String PURPLE = "purple";
        String color = PURPLE;

        switch(color)
        {
            case "red" :
                System.out.println("\tWe have landed on 'red', the first color of the rainbow.");
                break;
            case "orange":
                System.out.println("\tThe only color of the rainbow that share's its name with a kind of fruit.");
                break;
            case "yellow":
                System.out.println("\tThe color of the large object heating out planet");
                break;
            case "green" :
                System.out.println("\tWe get this color after mixing yellow and blue");
                break;
            case "blue":
                System.out.println("\t" + BLUE + " is often associated with the color of water.");
                break;
            case "purple":
                System.out.println("\tJimi Hendrix named a song with this color as part of the title.");
                break;
        }
        System.out.println();

        // 3. while loop
        // use when the loop will repeat an unknown number of times
        System.out.println("3) Create a while loop.\n\t- Loop from 20 to 0 by twos:");
        int count = 20;
        while (count >= 0)
        {
            if (count == 20) System.out.print('\t');
            System.out.print(count + ", ");
            count -= 2;
        }
        System.out.println();

        // 4. do-while loop
        // when you need a loop that will always preform at least one iteration
        System.out.println("\n 4) do-while loop\n\t- Illustrate a process attempting to start regardless of current state and run until an error is reached:\n");
        int systemStartProcess[] = {1,1,1,1,1,1,1,0,1,1};
        int startUpPosition = 0;

        do
        {
            System.out.println("\t. . . . . . .\n");
            startUpPosition ++;
        } while (systemStartProcess[startUpPosition] == 1);
        System.out.println();

        // 5. for loop
        // the traditional form with three statements in the parentheses
        // use when performing a known number of iterations
        System.out.println("\n 5) for loop\n\t- Illustrate a process that will run x number of times");
        for (int i = 0; i < systemStartProcess.length; i++)
        {
            if (systemStartProcess[i] == 1) System.out.println("\t. . . . . . .\n");
            else if (systemStartProcess[i] == 0) System.out.println("\tWarning ");
        }
        System.out.println();

        // 6. for each loop that processes an array
        System.out.println("\n 6) for each loop that processes an array");

        // cool, it looks like a space character can be of type char
        char[] myCity = { 's','a','n',' ','f','r','a','n','c','i','s','c','o' };
        for(char letter : myCity)
        {
            System.out.print(letter);
        }
    }
}
