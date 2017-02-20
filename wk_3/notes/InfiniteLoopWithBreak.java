import java.util.Scanner;

class InfiniteLoopWithBreak
{
    public static void main(String[] args)
    {
        int yourGuess;
        char correctAnswer = 7;
        Scanner myScanner = new Scanner(System.in);
        for(;;)
        {
            System.out.println("I'm thinking of an number betweem 1 and 10. Can you guess it?");
            yourGuess = myScanner.nextInt();

            if(correctAnswer == yourGuess)
            {
                System.out.println("You guessed it!");
                break; // exit main
            }
            else if(yourGuess < correctAnswer) System.out.println("Too low, but you can try again.");
            else System.out.println("Too high, but you can try again.");
        }
    }
}