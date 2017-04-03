/*
  Student:
    s15 Laura Kirby

  Usage:
    java InheritanceHwSeven

  Application description:
    - Write a program in which you create a
      1. class
      2. subclass of that class
          a. override a method inherited from its immediate superclass and
          b. use the this keyword to make use of the local version of the overridden method
          c. use the super keyword to make use of the super version of the overridden method
      3. demo class with main.

    See the HouseBoat class and build method in lesson 7 class notes.

    Examples:
    The IncomeTax class has a calculate method that accepts an integer and returns a double.
    If FederalIncomeTax and StateIncomeTax are subclasses of IncomeTax, both subclasses can
    call both this.calculateTax() and super.calculateTax() and each subclass might override
    the inherited method in a different way.

    Note that StateIncomeTax is NOT a subclass of FederalIncomeTax because the state level
    is NOT related to the federal level. For example, California has a state income tax that
    can be higher than an individual's federal income tax, while Texas and Florida have no
    state income tax.

    If SpecialAccount is a subclass of Account, a method in the subclass might call
    this.getInterest(isChecking) and super.getInterest(isChecking).
    The class with main should not be a subclass of any class. It is the executive that
    orchestrates the flow of calls. The main method must show the results of the method calls.
    The main method is also our "unit test" to see what we defined in the other classes works
    as we expect.

    Optional challenges:
    -- Use this. and super. to reference fields or super() or super(arg) to call a constructor.
    -- Use the keyword final (which exists at three levels, class, method, local variable)
    -- Use an abstract class

    A possible scenario:
    (1) Write an abstract class, AbstractRestaurant, with both an abstract method,
    calculateTax() and a non-abstract method, getPretaxPrice().
    (2) Write a subclass of the abstract class, Restaurant, named NewYorkStateRestaurant, and make NewYorkStateRestaurant implement calculateTax() with the rate of 4.0%.
    (3) Write a subclass of NewYorkStateRestaurant named NewYorkCityRestaurant that overrides calculateTax() such that this.calculateTax() charges 12.875%. Call both this.calculateTax() and super.calculateTax(). Note that New York official tax rates change periodically and are posted at http://ny.rand.org/stats/govtfin/salestax.html)
*/

// 1. class
class Plant
{
  private static String[] primitiveTypes = new String[] {"fern", "moss"};
  static String cholorplast = "I contain chlorophyll, a green pigment that absorbs light energy for photosynthesis";

  String name;
  int cellCount;

  Plant(String name, int cellCount)
  {
    this.name = name;
    this.cellCount = cellCount;
  }

  Integer calculateChloroplast() {
    Integer chloroplastRatio = 100;
    Integer totalCholoroplast = (this.cellCount * chloroplastRatio);
    System.out.println("------------- \n Method belonging to the 'super' class was called. \n There are about " + chloroplastRatio + " cholorplasts per cell. \n Returning: " + totalCholoroplast + "\n -------------");
    return totalCholoroplast;
  }
}

// 2. a subclass
class Magnolia extends Plant
{
  static boolean doesBloom = true;
  static boolean hasLeaves = true;
  static boolean hasRoots = true;

  String flowerColor;
  Integer waterLevel;

  Magnolia(String plantName, Integer plantCellCount, String flowerColor, Integer waterLevel)
  {
    super(plantName, plantCellCount);
    this.flowerColor = flowerColor;
    this.waterLevel = waterLevel;
  }

  // a. override a method inherited from its immediate superclass
  Integer calculateChloroplast() {
    Integer chloroplastRatio = 100;
    Integer totalCholoroplast = (cellCount * chloroplastRatio) + 25;
    System.out.println("------------- \n Override 'calculateChloroplast' \n Returning: " + totalCholoroplast + "\n -------------");
    return totalCholoroplast;
  }

  // b. use the this keyword to make use of the local version of the overridden method
  String printThisCholoroplast(){
    Integer result = this.calculateChloroplast();
    System.out.println("------------- \n Call class method using keyword 'this'. \n calculateChloroplast " + result + "\n -------------");
    String stringResult = Integer.toString(result);
    return stringResult;
  }

  // c. use the super keyword to make use of the super version of the overridden method
  String printSuperCholoroplast(){
    Integer result = super.calculateChloroplast();
    System.out.println("------------- \n Call super class method using keyword 'super' \n 'calculateChloroplast' " + result + "\n -------------");
    String stringResult = Integer.toString(result);
    return stringResult;
  }
}

// 3. demo class with main.
class InheritanceHwSeven
{
  public static void main(String[] args)
  {
    Magnolia aMagnolia = new Magnolia("Stellata", 540, "white", 4);
    aMagnolia.calculateChloroplast();
    aMagnolia.printThisCholoroplast();
    aMagnolia.printSuperCholoroplast();
  }
}
