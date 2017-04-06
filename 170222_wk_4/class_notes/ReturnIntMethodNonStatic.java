class ReturnIntMethodNonStatic
{
   int y;

   int myMethod(int myFormalParameter)
   {
      y = 1;
      for(y=1; y<7; y++)
      {
         System.out.println(y);
         if (y == 3)
         {
            System.out.println("y is now 3, so exit this iteration without incrementing");
         }
      }
      return myFormalParameter;
   }
   public static void main(String[] args)
   {
      ReturnIntMethodNonStatic myObject = new ReturnIntMethodNonStatic();
      int x;
      for(x=1; x<3; x++)
      {
        System.out.println("The caller has called myMethod this many times: " + x);
        // System.out.println(myMethod(7)); // ILLEGAL!
        System.out.println(myObject.myMethod(7));
      }
   }
}