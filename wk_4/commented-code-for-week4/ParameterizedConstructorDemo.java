// A parameterized constructor.
class SpecialAgent
{
     int salary;
      // define the constructor
      SpecialAgent(String name)
      {
          System.out.println("Constructing " + name);
      }
      void useGadget(String gadgetName)
      {
        System.out.println("using gadget " + gadgetName);
    }
}
class ParameterizedConstructorDemo
{
  public static void main(String[] args)
  {
    // pass an argument to the constructor
    SpecialAgent agent007 = new SpecialAgent("James Bond");
    agent007.useGadget("wetsuit with bird on top for stealth");
    SpecialAgent agent86 = new SpecialAgent("Maxwell Smart");
    agent86.useGadget("shoe-phone");
  }
}