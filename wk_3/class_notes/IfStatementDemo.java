class IfStatementDemo
{
  public static void main(String[] args)
  {
    // if block
    if(2 + 2 == 4)
    {
        System.out.println(2 + 2 == 4);
    }
    // if statement on one line
        if(2 + 2 == 4) System.out.println(2 + 2 == 4);
    // if condition governs following line
    if(2 + 2 == 4)
    System.out.println(2 + 2 == 4);
    // does not govern anything after the following line
    if(2 + 2 == 5)
    System.out.println(2 + 2 == 5);
    System.out.println(2 + 2 == 5);
  }
}