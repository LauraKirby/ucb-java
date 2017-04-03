/*
  Student:
    s15 Laura Kirby

  Usage:
    java InterfacesHwEight

  Application description::
    1.  Write a program with exception handling that uses:
        a) try,
        b) catch, and
        c) finally.

    2. The program must catch:
      a) a standard exception provided at http://docs.oracle.com/javase/8/docs/api/
      b) a custom exception that you invent

  Additional notes:
    - Instead of writing an entirely new program, it is acceptable to add exception handling to one of your earlier programs.
    - Follow the Java convention of naming your Exception class with suffix Exception.
    - For example, OddNumberException or AttemptLimitExceededException.

*/

// 1. class
class Plant
{
  private static String[] primitiveTypes = new String[] {"fern", "moss"};
  static String cholorplast = "I contain chlorophyll, a green pigment that absorbs light energy for photosynthesis";

  String name;
  int cellCount;
  static int waterLevel = 10;
  static int maxWater = 15;

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

  int suckInNutrients(int waterAdded) {
    if ( waterAdded && waterLevel > )
    {

      response = "Moving water in!";
    }
    else if (false)
    {
      response = "The plant has died, no water entered the plant.";
    }
    System.out.println(response);
    return response;
  }
}

// 2. a subclass
class Magnolia extends Plant
{
  static boolean doesBloom = true;
  static boolean hasLeaves = true;
  static boolean hasRoots = true;

  String flowerColor;
  static int waterLevel = 15;


  Magnolia(String plantName, Integer plantCellCount, String flowerColor, int waterLevel)
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


  String printSuperCholoroplast(){
    Integer result = super.calculateChloroplast();
    System.out.println("------------- \n Call super class method using keyword 'super' \n 'calculateChloroplast' " + result + "\n -------------");
    String stringResult = Integer.toString(result);
    return stringResult;
  }
}

class ErrorHandlingHwNine {

  public static void main(String[] args){
    Magnolia aMagnolia = new Magnolia("Stellata", 540, "white", 4);
    aMagnolia.calculateChloroplast();
    aMagnolia.printThisCholoroplast();
    aMagnolia.printSuperCholoroplast();
  }
}