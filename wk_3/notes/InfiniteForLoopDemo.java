import java.util.Scanner;

class InfiniteForLoopDemo
{
  public static void main(String[] args)
  {
      Scanner myScanner = new Scanner(System.in);

      for(;;) // infinite loop
      {
                System.out.println("Insert your ATM card.");
              int cardNumberToTest = myScanner.nextInt();

              switch(cardNumberToTest)
              {
                  case 123:
                  System.out.println("Your card number begins with 123");
                  break;
                  case 456:
                  System.out.println("Your card number begins with 456");
                  break;
                  default:
                  System.out.println("This machine cannot read your ATM card.");
                  break;
              }
      }
  }
}