import java.util.Random;
class RandomGeneratorDemo
{
   public static void main (String[] args)
   {
      Random generator = new Random();
      int a = generator.nextInt();
      int b = generator.nextInt();
      System.out.println ("Two random numbers");
      System.out.println ("Integer a is " + a);
      System.out.println ("Integer b is " + b + "\n");
      if(a > b ) System.out.println("Integer \"a\" is bigger than Integer \"b\"\n");
      if(b > a ) System.out.println("Integer \"b\" is bigger than Integer \"a\"\n");
      if(a == b ) System.out.println("Integer \"a\" and Integer \"b\" are the same.\n");
      if(a > 0 & b > 0) System.out.println("Both numbers are positive.");
      if(a < 0 & b < 0) System.out.println("Both numbers are negative.");
      // xor, the exclusive or, gives false for true ^ true
      if(a < 0 ^ b < 0) System.out.println("One number is positive and the other is negative.");
   }
}