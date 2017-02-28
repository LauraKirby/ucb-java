class StringReturner
{
   // field or instance variable
   String myString = "This is myString";
   // method with a return type of String
   String stringTester(boolean doesReturnGreeting)
   {
      if(doesReturnGreeting)
      {
          return myString;
      }
      else
      {
          String s = new Boolean(doesReturnGreeting).toString();
          return s;
      }
   }
}
class ReturnStringDemo
{
   public static void main(String[] args)
   {
      //String myString = "";
      String s = ""; // initialized value to be reassigned
      StringReturner sr = new StringReturner();
      String myString = sr.stringTester(true);
      s = sr.stringTester(false);
      System.out.println(myString);
      System.out.println(s);
   }
}