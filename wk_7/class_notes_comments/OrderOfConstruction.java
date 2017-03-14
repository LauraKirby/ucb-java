// Demonstrate when constructors are called.
class A
{
  //class A extends java.lang.Object {
  int x = 1; // field assignment
  A()
  {
    System.out.println("Constructing A.");
  }
}

// Create a subclass by extending class A.
class B extends A
{
  //int x = 33; // resetting x to 33

  B()
  {
    System.out.println("Constructing B.");
    System.out.println("B's x = 33? " + x);
  }
}

// Create another subclass layer by extending B.
class C extends B
{
  //int x = 44; // reset

  C()
  {
    System.out.println("Constructing C.");
  }
}

class OrderOfConstruction
{
  public static void main(String[] args)
  {
    C c = new C();
    //int x; // local variable
    //System.out.println(x); // current class  0
    // System.out.println(this.x);  // no object
    System.out.println(c.x); // the value from A // 4
  }
}
// What does this mean for the initialization of instance variables?