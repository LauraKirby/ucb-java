// Demonstrate the while loop.
class WhileDemo
{
  public static void main(String[] args)
  {
    char ch;
    // print the alphabet using a while loop
    ch = 'a'; // initialize the counter
    while(ch <= 'z') // test the condition
    {
      System.out.print(ch);
      ch++; // increment the counter
    }
  }
}