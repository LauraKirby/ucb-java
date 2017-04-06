class ThreadGenerator implements Runnable
{
  Thread thrd;
  static ArraySumCalculator sa = new ArraySumCalculator();
  int[] fieldForIntArray;
  int answer;
  // Construct a new thread.
  ThreadGenerator(String name, int[] formalParameterOfInts)
  {
    thrd = new Thread(this, name);
    this.fieldForIntArray = formalParameterOfInts;
    thrd.start(); // start the thread
  }
  // Begin execution of new thread.
  public void run()
  {
    int sum;
    System.out.println(thrd.getName() + " starting.");
    answer = sa.getSumOfTheArray(fieldForIntArray);
    System.out.println("Sum for " + thrd.getName() +
                       " is " + answer);
    System.out.println(thrd.getName() + " terminating.");
  }
}
class ArraySumCalculator
{
  private int sum;
  synchronized int getSumOfTheArray(int[] myArrayOfInts)
  {
    sum = 0; // reset sum
    for(int i=0; i<myArrayOfInts.length; i++)
    {
      sum += myArrayOfInts[i];
      System.out.println("Running total for " +
             Thread.currentThread().getName() +
             " is " + sum);
      try
      {
        Thread.sleep(10); // allow task-switch
      }
      catch(InterruptedException exc)
      {
        System.out.println("Main thread interrupted.");
      }
    }
    return sum;
  }
}
class SynchronizedThreads
{
  public static void main(String[] args)
  {
    int[] arrayOfIntsInMain = {1, 2, 3, 4, 5};
    ThreadGenerator mt1 = new ThreadGenerator("Child #1", arrayOfIntsInMain);
    ThreadGenerator mt2 = new ThreadGenerator("Child #2", arrayOfIntsInMain);
  }
}