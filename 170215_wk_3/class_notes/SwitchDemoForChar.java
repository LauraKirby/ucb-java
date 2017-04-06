import java.util.Scanner;

class SwitchDemoForChar
{
  public static void main(String[] args)
  {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("enter a capital vowel");
      char charToTest = myScanner.next().toUpperCase().charAt(0);

      switch(charToTest)
      {
          case 'A':
          System.out.println(charToTest + " - This is a vowel");
          break;
          case 'E':
          System.out.println(charToTest + " - This is a vowel");
          break;
          case 'I':
          System.out.println(charToTest + " - This is a vowel");
          break;
          case 'O':
          System.out.println(charToTest + " - This is a vowel");
          break;
          case 'U':
          System.out.println(charToTest + " - This is a vowel");
          break;
          default:
          System.out.println("You did not enter a vowel.");
      }
  }
}