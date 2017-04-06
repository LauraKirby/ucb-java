class UseMainThread
{
  public static void main(String[] args)
  {
    Thread myThread;
    // Get the main thread.
    myThread = Thread.currentThread();
    // Display main thread's name.
    System.out.println("Main thread is called: " +
                       myThread.getName());
    // Display main thread's priority.
    System.out.println("Priority: " +
                       myThread.getPriority());
    System.out.println();
    // Set the name and priority.
    System.out.println("Setting name and priority.\n");
    myThread.setName("Thread #1 The King of All");
    myThread.setPriority(Thread.NORM_PRIORITY+3);
    System.out.println("Main thread is now called: " +
                       myThread.getName());
    System.out.println("Priority is now: " +
                       myThread.getPriority() + " but this thread has no other thread to compete against.");
  }
}