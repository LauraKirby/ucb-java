class TernaryOperatorDemoWithStrings
{
   public static void main(String[] args)
   {
       int y = 6;
       int z = 0;
       // ternary operator syntax:
       // the assignment y = depends on:
       // (boolean condition)?
       //                           if true;
       //                                else if false
       y = "hello!".length() == 6 ? 100: 200;
       // equivalent logic with if else
       if("hello!".length() == 6)
       {
           y = 100;
       }
       else
       {
           y = 200;
       }
       System.out.println(y);
       //  artificially force the condition to be true
       z = true ? 33: 44;
       System.out.println(z);
       //  test with a String method
       String greeting0 = "Bonjour!";
       String greeting1 = "Guten Tag!";
       y = (greeting1.length() >= greeting0.length()) ? 10: 8;
       System.out.println(y);
   }
}