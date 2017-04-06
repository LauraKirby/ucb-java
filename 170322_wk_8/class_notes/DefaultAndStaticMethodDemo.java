class DefaultAndStaticMethodDemo
{
  public static void main(String[] args)
  {
    Implementation1 test = new Implementation1();
    System.out.println("The time in London is " + InterfaceWithDefaultAndStaticMethods.getGMT());
    System.out.println("The default account balance is " + test.getDefaultAccountBalance());
  }
}