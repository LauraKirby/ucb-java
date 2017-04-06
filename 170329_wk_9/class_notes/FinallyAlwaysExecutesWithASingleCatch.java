class FinallyAlwaysExecutesWithASingleCatch
{
   public static void main(String[] args)
   {
      int size;
      for(size = 3; size > -3; size--)
      {
         try
         {
            System.out.println("size = " + size);
            System.out.println(12 / size);
            int myArray[] = new int[size];
            System.out.println(myArray.length);
         }
         catch(ArithmeticException | ArrayIndexOutOfBoundsException | NegativeArraySizeException e)
         {
             System.out.println("oops " + e.toString());
         }
         finally
         {
             System.out.println("finally executed");
         }
      }
   }
}