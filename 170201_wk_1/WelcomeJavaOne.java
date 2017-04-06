/*
  Student:
    s01 Laura Kirby
  Usage:
    java WelcomeJava "complete"
  Application description:
    1. uses the modulus operator % to return the remainder of the division of the left operand by the right operand
    2. uses the escape sequences \t and \n when printing strings
    3. makes use of String[] args
 */

class WelcomeJavaHwOne
{
    public static void main(String[] args)
    {
        // 1. modulus operator % to return the remainder of the division
        System.out.println(53 % 10);
        // 2. escape sequences \t and \n when printing strings
        System.out.println("My first Java assignment. \n Submitted on: \t 2/6/17");
        // 3. String[] args
        System.out.println("Execution " + args[0] + ".");
    }
}