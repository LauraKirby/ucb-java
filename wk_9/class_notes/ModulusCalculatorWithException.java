class TooManyArgsException extends Exception
{
  TooManyArgsException()
  {
    System.out.println("Custom Exception Thrown:");
  }
}
class ModulusCalculatorWithException
{
  public static void main (String[] args)
  {
    try
    {
      if (args.length > 2)
      {
        throw new TooManyArgsException();
      }
      else
      {
        System.out.println("\tThe modulus of \n" + "\t" + args[0] + " divided by " + args[1]);
        int firstString = Integer.parseInt(args[0]);
        int secondString = Integer.parseInt(args[1]);
        System.out.println("\t" + firstString % secondString);
      }
    }
    catch(NumberFormatException e)
    {
      System.out.println("Does not exist. Looks like you did not enter a number. " + e);
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println("You must enter exactly two integers " + e);
    }
    catch(TooManyArgsException e)
    {
      System.out.println("You entered more than two integers " + e);
    }
    finally
    {
      System.out.println("Nothing needs to closed or cleaned up but here is a message anyways.");
    }
  }
}