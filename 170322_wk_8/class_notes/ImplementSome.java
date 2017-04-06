/* Illustrate that an abstract class can perform
   partial implementation of an interface */
interface TwoMethods
{
   void method1();
   void method2();
}
abstract class PartialImplementation implements TwoMethods
{
   public void method1()
   {
      System.out.println("PartialImplementation is an abstract class that hereby implements method1");
   }
   // leave the implementation to the subclass
   public abstract void method2();
}
// class FinishImplementation extends PartialImplementation implements TwoMethods {
class FinishImplementation extends PartialImplementation
{
   public void method2()
   {
      System.out.println("FinishImplementation is a nonabstract class that implements interface method2.");
   }
}
class ImplementSome
{
   public static void main(String[] args)
   {
       //PartialImplementation pi = new PartialImplementation();
       // create an object and call methods on it
       FinishImplementation fi = new FinishImplementation();
       fi.method1();
       fi.method2();
  }
}