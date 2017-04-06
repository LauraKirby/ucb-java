class ThreadRunner implements Runnable
{
  int count;
  Thread myMainThread;
  // Construct a new thread.
  ThreadRunner(String name)
  {
    myMainThread = new Thread(this, name);
    count = 0;
    myMainThread.start(); // start the thread
  }
  // Begin execution of new thread.
  public void run()
  {
    System.out.println(myMainThread.getName() + " starting.");
    try
    {
      do
      {
        Thread.sleep(500);
        System.out.println("In " + myMainThread.getName() +
                           ", count is " + count);
        count++;
      } while(count < 10);
    }
    catch(InterruptedException exc)
    {
      System.out.println(myMainThread.getName() + " interrupted.");
    }
    System.out.println(myMainThread.getName() + " terminating.");
  }
}
class JoinThreads
{
  public static void main(String[] args)
  {
    System.out.println("Main thread starting.");
    ThreadRunner childThread1 = new ThreadRunner("Child #1");
    ThreadRunner childThread2 = new ThreadRunner("Child #2");
    ThreadRunner childThread3 = new ThreadRunner("Child #3");
    try
    {
      childThread1.myMainThread.join();
      System.out.println("The main thread will not terminate before Child #1.");
      childThread2.myMainThread.join();
      System.out.println("The main thread will not terminate before Child #2.");
      childThread3.myMainThread.join();
      System.out.println("The main thread will not terminate before Child #3.");
    }
    catch(InterruptedException exc)
    {
      System.out.println("Main thread interrupted.");
    }
    System.out.println("Main thread ending.");
  }
}