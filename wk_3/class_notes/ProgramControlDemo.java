import java.util.Scanner;

class ProgramControlDemo
{
    static char quitProgramChar = 'x';
    static char charToTest;

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a vowel of the alphabet, or end this program by typing the letter x");

        do
        {
            char charToTest = input.next().toUpperCase().charAt(0);
            if(charToTest == 'A') System.out.println(charToTest + " - This is a vowel");
            else if(charToTest == 'E') System.out.println(charToTest + " - This is a vowel");
            else if(charToTest == 'I') System.out.println(charToTest + " - This is a vowel");
            else if(charToTest == 'O') System.out.println(charToTest + " - This is a vowel");
            else if(charToTest == 'U') System.out.println(charToTest + " - This is a vowel");
            else if(charToTest == 'X') break;
            else System.out.println(charToTest + " - This is neither a vowel nor x");
            break;
        }
        while(charToTest != quitProgramChar);

        System.out.println("Enter a number in the range of 0-9.");
        int intToTest = input.nextInt();
        switch(intToTest)
        {
            case 0:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 1:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 2:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 3:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 4:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 5:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 6:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 7:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 8:
            System.out.println("You have entered the number: " + intToTest);
            break;
            case 9:
            System.out.println("You have entered the number: " + intToTest);
            break;
            default:
            System.out.println("You have entered an invalid selection " + intToTest);
            break;
        }
    }
}