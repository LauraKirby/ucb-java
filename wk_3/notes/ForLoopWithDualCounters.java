class ForLoopWithDualCounters
{
  public static void main(String[] args)
  {
    char ch;
    int myCounter;
    // dual counters
    for(ch = 'a', myCounter = 1; ch <= 'z'; ch++, myCounter++)
    {
      System.out.println(ch + " is the letter at position " + myCounter + " in the alphabet.");
    }
  }
}