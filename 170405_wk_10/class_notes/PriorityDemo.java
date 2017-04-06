// Demonstrate thread priorities.
class Priority implements Runnable
{
  int count;
  Thread myThread;
  static boolean stop = false;
  static String currentName;
  /* Construct a new thread. Notice that this
     constructor does not actually start the
     threads running. */
  Priority(String name)
  {
    myThread = new Thread(this, name);
    count = 0;
    currentName = name;
  }
  // Begin execution of new thread.
  public void run()
  {
    System.out.println(myThread.getName() + " starting.");
    do
    {
      count++;
      if(currentName.compareTo(myThread.getName()) != 0)
      {
        currentName = myThread.getName();
        System.out.println("In " + currentName);
      }
    } while(stop == false && count < 10000000);
    stop = true;
    System.out.println("\n" + myThread.getName() +
                       " terminating.");
  }
}
class PriorityDemo
{
  public static void main(String[] args)
  {
    Priority highPriorityThread = new Priority("High Priority");
    Priority lowPriorityThread = new Priority("Low Priority");
    // set the priorities
    highPriorityThread.myThread.setPriority(Thread.NORM_PRIORITY+3);
    lowPriorityThread.myThread.setPriority(Thread.NORM_PRIORITY-3);
    // start the threads
    highPriorityThread.myThread.start();
    lowPriorityThread.myThread.start();
    try
    {
      highPriorityThread.myThread.join();
      lowPriorityThread.myThread.join();
    }
    catch(InterruptedException exc)
    {
      System.out.println("Main thread interrupted.");
    }
    System.out.println("\nHigh priority thread counted to " +
                       highPriorityThread.count);
    System.out.println("Low  priority thread counted to " +
                       lowPriorityThread.count);
  }
}