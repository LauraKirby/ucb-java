class MultiCatchWithPipeInCatchStatement
{
  public static void main(String[] args)
  {
    int[] numerator =  { 20, 8, 40, 50, 60, 70, 80}; // 7 indices
    int[] denomenator = { 2, 0,  4,  5,  0,   7 };   // 6 indices
    for(int i=0; i<numerator.length; i++)
    {
      try
      {
        System.out.println(numerator[i] + " / " +
                           denomenator[i] + " is " +
                           numerator[i]/denomenator[i]);
        if(i == numerator.length-2)
        {
            String test = "abc";
            System.out.println("i is now " + i + " and we will try to reference an element beyond the String");
            System.out.println(test.charAt(test.length()));
        }
      }
      catch(ArithmeticException |  IndexOutOfBoundsException e)
      {
            if(e instanceof StringIndexOutOfBoundsException)
            {
                System.out.println("The String source code file must have at least 646 lines.");
            }
            e.printStackTrace();
      }
    }
  }
}