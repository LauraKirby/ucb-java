import java.util.Scanner;

class ElseIfDemo
{
  public static void main(String[] args)
  {
      Scanner myScanner = new Scanner(System.in);
      System.out.println("enter a vowel");
      char charToTest = myScanner.next().toUpperCase().charAt(0);

      if(charToTest == 'A') System.out.println(charToTest + " - This is a vowel");
      else if(charToTest == 'E') System.out.println(charToTest + " - This is a vowel");
      else if(charToTest == 'I') System.out.println(charToTest + " - This is a vowel");
      else if(charToTest == 'O') System.out.println(charToTest + " - This is a vowel");
      else if(charToTest == 'U') System.out.println(charToTest + " - This is a vowel");
      else System.out.println("You did not enter a vowel");
  }
}