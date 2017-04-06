import java.io.*;

class EggCounter
{
    EggCounter()
    {
        System.out.println("EggCounter() constructor");
        this.getCountOfEggs();
    }

    void getCountOfEggs()
    {
      int[] eggs = new int[13];
      for(int i = 0; i <= eggs.length; i++)
      {
          eggs[i] = i;
          System.out.println(eggs[i]);
      }
      System.out.println("done counting");
    }
}

class TestUtility
{
    void runTest() throws IOException
    {
        try
        {
            System.out.println("Let's count some eggs");
            EggCounter ec = new EggCounter();
            System.out.println("We are done counting eggs");
        }
        catch(Throwable e)
        {
            FileOutputStream fos = new FileOutputStream(new File("log2.txt"));
            PrintStream ps = new PrintStream(fos);
            e.printStackTrace(ps);
            System.out.println("Something went wrong. Please ask your administrator to check the log file.");
        }
    }
}

class BakersDozen
{
  public static void main(String[] args)
  {
    try
    {
        TestUtility tu = new TestUtility();
        tu.runTest();
    }
    catch(IOException ioe) { }
  }
}