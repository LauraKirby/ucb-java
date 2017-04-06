// Method overriding requires matching return type.
class A
{
  void printMessage()
  {
    System.out.println("Hello in A");
  }
}
class B extends A
{
  //String show() illegal because return type does not match the overriden method
  /*void printMessage()
  {
    System.out.println("Hello in B");
    // return "OK";
  }*/
  void printMessage() // subclass override
  {
      //return
      System.out.println("Hello in B");
  }
}
class OverrideRequiresMatchingReturnTypeDemo
{
  public static void main(String[] args)
  {
    B subOb = new B();
    subOb.printMessage();
  }
}