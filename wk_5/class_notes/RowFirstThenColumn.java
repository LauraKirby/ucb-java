/* referenced by row, then column
*/
class RowFirstThenColumn
{
  public static void main(String[] args)
  {
    // array initializer
    String[][] columnsAndRows =
    {
      { "1st Row, 1st Column", "1st Row, 2nd Column" },
      { "2nd Row, 1st Column", "2nd Row, 2nd Column" },
      { "First Name", "Last Name" },
      { "Romeo",  "Montagu" },
      { "Juliet", "Capulet" },
    };
      System.out.println(columnsAndRows[4][0] + " " + columnsAndRows[4][1] + " was not known as Mrs. " + columnsAndRows[3][0] + " " +
      columnsAndRows[3][1]);
  }
}