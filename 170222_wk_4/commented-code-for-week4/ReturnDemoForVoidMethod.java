class ReturnDemoForVoidMethod
{
   static int y;
   static void doSomething()
   {
      y = 1;
      for(y=1; y<7; y++)
      {
         if(y == 3)
         {
            return; //in this case, same result as break;
         }
         else System.out.println(y);
      }
   }
   public static void main(String[] args)
   {
      int x;
      for(x=1; x<5; x++)
      {
        doSomething();
        System.out.println("The caller has called myMethod this many times: " + x);
      }
   }
}