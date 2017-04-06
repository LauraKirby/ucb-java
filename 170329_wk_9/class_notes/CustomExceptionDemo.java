class LasVegasCasinoException extends Exception
{
    LasVegasCasinoException()
    {
        System.out.println("LasVegasCasinoException constructor");
    }
}
class CustomExceptionDemo
{
  public static void main(String[] args)
  {
    int[] numerator =  { 20, 8, 40, 50, 60, 70, 80}; // 7 indices
    int[] denomenator = { 2, 1,  4,  5,  1,   7 };   // 6 indices
    for(int i=0; i<numerator.length; i++)
    {
      try
      {
        System.out.println(numerator[i] + " / " +
                           denomenator[i] + " is " +
                           numerator[i]/denomenator[i]);
        if(numerator[i]/denomenator[i] > 50)
        {
            throw new LasVegasCasinoException();
        }
      }
      catch(ArithmeticException e)
      {
            throw e;
      }
      catch(ArrayIndexOutOfBoundsException e)
      {
            throw e;
      }
      catch(LasVegasCasinoException e)
      {
          System.out.println("LasVegasCasinoException caught because the value is greater than 50 and the customer is winning too much.");
      }
    }
  }
}