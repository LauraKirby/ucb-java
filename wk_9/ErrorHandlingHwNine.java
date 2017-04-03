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

class PlantException extends Exception {
  int max;
  PlantException(int max) {
    this.max = max;
    System.out.println(" \t Exception: Must enter a number lower or equal to: " + max);
  }
}

class Plant {
  private static String[] primitiveTypes = new String[] {"fern", "moss"};
  static String cholorplast = "I contain chlorophyll, a green pigment that absorbs light energy for photosynthesis";

  String name;
  String[] bloomingSeasons;
  int cellCount;
  int waterLevel = 10;
  int maxWater = 20;

  Plant(String name, int cellCount) {
    this.name = name;
    this.cellCount = cellCount;
  }

  int suckInNutrients(int waterAdded) throws PlantException {
    int spaceForConsumption = maxWater - waterLevel;
    System.out.println("'suckInNutrients' was called with " +  waterAdded + "\n\t - waterAdded: " + waterAdded + "\n\t - maxWater: " + maxWater + "\n\t - current waterLevel: " + waterLevel + "\n\t - spaceForConsumption: " + spaceForConsumption );
    if ( waterLevel < maxWater )
    {
      if ( waterAdded < spaceForConsumption ) {
        waterLevel = waterLevel + waterAdded;
        System.out.println("\n\t Since: waterAdded is less than spaceForConsumption. \n\t\t -> return new waterLevel: " + waterLevel + "\n");
      }
      else if ( waterAdded > spaceForConsumption ) {
        System.out.println("\n\t Since: waterAdded is greater than spaceForConsumption. \n\t\t -> throw new PlantException\n");
        throw new PlantException(spaceForConsumption);
      }
    } else {
      System.out.println("Water not added");
    }
    return waterLevel;
  }

  // 2. The program must catch: b) a custom exception that you invent
  void feedPlant(int quantity) {
    try {
      suckInNutrients(quantity);
    } catch(PlantException e) {
      System.out.println(" \t - Plant was not able to consume nutrients.");
    } finally {
      System.out.println(" \t - ending waterLevel: " + waterLevel);
      System.out.println(" \t - Finally: Report waterLevel to head gardner\n");
    }
  }

  // 2. The program must catch: a) a standard exception
  void printThreeBloomingSeasons (){
    try
    {
      for(String s : bloomingSeasons)
      {
        System.out.println(s);
        String thirdSeason = bloomingSeasons[2];
      }
    } catch(Exception e){
      System.out.println("Could not print months. Double check that your object has 3 blooming seasons.");
    }
  }
}

class Magnolia extends Plant
{
  static boolean doesBloom = true;
  static boolean hasLeaves = true;
  static boolean hasRoots = true;

  String flowerColor;
  String[] bloomingSeasons = {"spring", "summer"};

  Magnolia(String plantName, Integer plantCellCount, String flowerColor, int waterLevel)
  {
    super(plantName, plantCellCount);
    this.flowerColor = flowerColor;
    this.waterLevel = waterLevel;
  }
}

class ErrorHandlingHwNine {

  public static void main(String[] args){
    Magnolia aMagnolia = new Magnolia("Stellata", 540, "white", 4);

    // 2. The program must catch: b) a custom exception that you invent
    aMagnolia.feedPlant(3);
    aMagnolia.feedPlant(100);

    // 2. The program must catch: a) a standard exception
    aMagnolia.printThreeBloomingSeasons();
  }
}