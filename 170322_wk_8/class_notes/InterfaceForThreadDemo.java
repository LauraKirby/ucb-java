class MyThread implements Runnable
{
  int count;
  Thread myCustomThread;
  // Construct a new thread.
  MyThread(String name)
  {
    myCustomThread = new Thread(this, name);
    count = 0;
    myCustomThread.start(); // start the thread
  }
  // Begin execution of new thread.
  public void run()
  {
    System.out.println(myCustomThread.getName() + " starting.");
    try
    {
      do
      {
        Thread.sleep(500);
        System.out.println("In " + myCustomThread.getName() +
                           ", count is " + count);
        count++;
      } while(count < 10);
    }
    catch(InterruptedException exc)
    {
      System.out.println(myCustomThread.getName() + " interrupted.");
    }
    System.out.println(myCustomThread.getName() + " terminating.");
  }
}
class InterfaceForThreadDemo
{
  public static void main(String[] args)
  {
    System.out.println("Main thread starting.");
    MyThread mt = new MyThread("Child #1");
    do
    {
      System.out.print(".");
      try
      {
        Thread.sleep(100);
      }
      catch(InterruptedException exc)
      {
        System.out.println("Main thread interrupted.");
      }
    } while (mt.count != 10);
    System.out.println("Main thread ending.");
  }
}