class A {
  A() {
    System.out.println("Constructing A.");
  }
}
// Create a subclass by extending class A.
class B extends A { // go to Line 1
  B() {
    System.out.println("Constructing B.");
  }
  void doSomething()
  {
	  System.out.println("howdy");
	  super();
  }
}
// Create another subclass by extending B.
class C extends B { // go to Line 7
  C() {
    System.out.println("Constructing C.");
  }
}
class ABC {
  public static void main(String[] args) {
    C c = new C(); // go to Line 13
  }
} // order of construction is top-down