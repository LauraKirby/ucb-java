class ForEachOnTwoDimensionalArrayDemo
{
  public static void main(String[] args)
  {
    String[][] columnsAndRows =
    {
      { "0th Row, 0th Column", "0th Row, 1st Column" },
      { "1st Row, 0th Column", "1st Row, 1st Column" },
      { "First Name", "Last Name" },
      { "Romeo",  "Montagu" },
      { "Juliet", "Capulet" },
    };
    for(String[] outerArray : columnsAndRows)
    {
        for(String s : outerArray)
        {
          System.out.println(" " + s);
        }
        System.out.println();
    }
  }
}