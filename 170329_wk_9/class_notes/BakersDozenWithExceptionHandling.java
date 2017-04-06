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
class BakersDozenWithExceptionHandling
{
  public static void main(String[] args)
  {
      System.out.println("Let's count some eggs");
      try
      {
          EggCounter ec = new EggCounter();
      }
      catch(Exception e)
      {
          System.out.println("Please ask your administrator to check the log file.");
      }
      System.out.println("We are done counting eggs");
  }
}