class PrintAllTheDataInATwoDimensionalArrayDemo
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
    for(int i = 0; i < columnsAndRows.length; i++)
    {
        for(int j=0; j < 2; j++)
        {
          System.out.println("values for row " + i + " " + columnsAndRows[i][j]);
        }
        System.out.println();
    }
  }
}