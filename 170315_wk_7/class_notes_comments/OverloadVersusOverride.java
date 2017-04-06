class Donut
{
  int i, j;
  Donut(int a, int b)
  {
    i = a;
    j = b;
  }
  // display i and j
  void show()
  {
    System.out.println("The show method in plain Donut is parameterless, and here i and j are " + i + " " + j);
  }
}
// Create a subclass by extending class A.
class ChocolateDonut extends Donut
{
  int i = -888;
  int k;
  ChocolateDonut(int a, int b, int c)
  {
    super(a, b);
    k = c;  // assign to k the value of 3
  }
   // override show()
   void show()
   {
     System.out.println("Override of the show method is parameterless, and here i and j are " + i + " and " + j);
  }
  // overload show() with a different signature
  void show(String message)
  {
    System.out.println("Overload that is inside the show method of ChocolateDonut, where the signature is different because this version takes a String parameter " + message + k);
  }
}
class OverloadVersusOverride
{
  public static void main(String[] args)
  {
    ChocolateDonut subOb = new ChocolateDonut(1, 2, 3); // instantiate an object called subOb of the class B
    subOb.show("subOb.show - The value of  k on a ChocolateDonut object: "); // this calls show() in ChocolateDonut
    subOb.show(); // this calls show() in Donut
  }
}