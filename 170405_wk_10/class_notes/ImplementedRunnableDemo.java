class ThomasChildThread implements Runnable
{
  Thread myChildThread;

  // Construct and start the child thread
  ThomasChildThread(String name)
  {
    myChildThread = new Thread(this, name);
    myChildThread.start();
  }

  // Define what the thread does during its life
  public void run()
  {
    System.out.println(myChildThread.getName() + " starting.");
    try
    {
      for(int count=0; count < 10; count++)
      {
        Thread.sleep(400);
        System.out.println("In " + myChildThread.getName() +
                           ", count is " + count);
      }
    }
    catch(InterruptedException exc)
    {
      System.out.println(myChildThread.getName() + " interrupted.");
    }
    System.out.println(myChildThread.getName() + " terminating.");
  }
}

class ImplementedRunnableDemo
{
  public static void main(String[] args)
  {
    System.out.println("Main thread already running. Time to create a child thread.");

    ThomasChildThread mt = new ThomasChildThread("childThread");

    for(int i=0; i < 50; i++)
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
    }

    System.out.println("Main thread ending.");
  }
}
