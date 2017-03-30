class Something
{
    String doSomething()
    {
        try
        {
          System.out.println("try in doSomething()");
        }
        /*catch(Exception e)
        {
            System.out.println("exception thrown! " + e);
        }*/
        finally
        {
            System.out.println("In \"finally\" block - try and finally are enough, or try and catch are enough, but you have the option of try, catch, and finally -- all three");
        }
        return "return string from doSomething";
    }
    String doSomethingThatThrowsException()
    {
        try
        {
          System.out.println("\ntry in doSomethingThatThrowsException()");
          System.out.println(1/0);
        }
        catch(Exception e)
        {
            System.out.println("exception thrown! " + e);
        }
        finally
        {
            System.out.println("finally executes before the method returns its value.");
        }
        return "Return string from doSomethingThatThrowsException";
    }
}
class FinallyAlwaysExecutesBeforeReturnDemo
{
  public static void main(String[] args)
  {
    Something s = new Something();
    System.out.println(s.doSomething());
    System.out.println(s.doSomethingThatThrowsException());
    System.out.println("\nall done");
  }
}