/* Demonstrate the foreach style of enhanced for loop,
   which is well suited for processing an array. */
class ForDemoWithForEach
{
  public static void main(String[] args)
  {
    int[] myArrayOfIntegers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int sum = 0;
    // print the alphabet using a while loop
    for(int x : myArrayOfIntegers)
    {
      System.out.println("Value of x is: " + x + " and value of sum is " + sum);
      sum += x; // sum = sum + x;
    }
    System.out.println("Outside foreach loop. Sum is: " + sum);
  }
}