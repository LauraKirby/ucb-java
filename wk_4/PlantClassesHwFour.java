/*
  Student:
    s15 Laura Kirby

  Usage:
    java PlantClassesHwFour

  Application description:
    1. two classes, such as Cat and Dog, each contain:
    2. parameterized constructor
    3. parameterized method
    4. instance variable, also known as a field
    5 class variable, also known as a static field - see Lecture 4: Class, Field, Constructor, Method#staticfieldisoftheclass

    Example:
    - ClassDesignDemo.java, has the main method that instantiates the two classes by calling the parameterized constructor of each class.
      - Dog fido = new Dog("watchdog");
    - The main method then calls the parameterized method on each of the  newly created objects, such as fido and tibby.
      - fido.doWork("wag tail at robbers");
    - The main method also references both the instance variable (on an instance) and the static variable (using the class name plus the dot operator).
      - Dog.numberOfLegs can be a static variable and fido.weight can be an instance variable.
    - Make sure your scenario makes sense:
      - The class name is a singular noun, such as SpellChecker
      - Each field represents a datum, attribute, or state, such as red for the current color of a TrafficLight object, or numberOfLetters for a String
      - The method names are verbs for behavior, such as checkSpelling()


    Pseudo code:

      class:
        Plant
      fields:
        cholorplast - green color in leaves

      constructor:
        name, numberOfCells

      methods:
        - transportResource (resource)
        -  makeFood (String airQuality, boolean waterPresence, float sunExposure)
            if airQuality is above 50 then continue, water is present and sunExposure is greater that 10.5 then make food
            else
            no food can be made, plant begins to shrivel
        - suckInNutrients (mode) - eg roots
        - transportResource (water) - roots suck up water and move it to the leaves
        - consumeH2O (air) -- leaves take in air

      Class: Plant
          Subclass: moss
              - bloom - false
              - stem - false
              - roots - false
              - color (season, location)
            Fern
              - bloom - false
              - leaves - true
              - roots - true
              - color (season, sunlight)
            Magnolia
              - leaves - true
              - bloom - true
              - roots - true
              - color (season, waterSupply)
            Cactaceae
              - leaves - false
              - bloom - true
              - roots - true
              - color (season, climate)
*/


// 1. a class  (1)
class Plant
{
  // 5. class variable (1)
  static String cholorplast = "I contain chlorophyll, a green pigment that absorbs light energy for photosynthesis";

  // 4. instance variable, also known as a field (1)
  private static String[] primitiveTypes = new String[] {"fern", "moss"};
  String name;
  int cellCount;

  // 2. parameterized constructor (1)
  Plant(String name, int cellCount)
  {
    this.name = name;
    this.cellCount = cellCount;
  }

  // parameterized method
  String suckInNutrients (String mode) {
    System.out.println("I absorb nutrients through my " + mode + ".");
    String response = "Moving water in, the mode is unknown.";
    if (mode == "roots")
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

  boolean isPrimitive () {
    String plantType = this.name.toLowerCase();
    boolean result = false;
    if (plantType.equals("fern") || plantType.equals("moss")) {
      result = true;
    }
    return result;
  }

  // 3. parameterized method (1)
  Integer calculateChloroplast (Integer cells) {
    Integer chloroplastRatio = 100;
    Integer totalCholoroplast = (cells * chloroplastRatio);
    System.out.println("There are about " + chloroplastRatio + " cholorplasts per cell. \n Returning: " + totalCholoroplast);
    return totalCholoroplast;
  }

  boolean makeFood (int airQuality, boolean waterPresence, double sunExposure) {
    boolean food = false;
    if (airQuality >= 50 && waterPresence && sunExposure >= 10.5 ){
      food = true;
      System.out.println("all required items present, mixing items in the cholorplast");
    }
    else
    {
      System.out.println("no food can be made, plant begins to shrivel");
    }
    return food;
  }
}

// TO DO: refactor 'Magnolia' into a subclass of 'Plant'
// 1. a class  (2)
class Magnolia
{
  // 5. class variable (2)
  static boolean doesBloom = true;
  static boolean hasLeaves = true;
  static boolean hasRoots = true;

  // 4. instance variable, also known as a field (2)
  String flowerColor;
  Integer waterLevel;

  // 2. parameterized constructor (2)
  Magnolia(String flowerColor, Integer waterLevel)
  {
    this.flowerColor = flowerColor;
    this.waterLevel = waterLevel;
  }

  // 3. parameterized method (2)
  String findColor(String season){
    if (season.equals("summer"))
    {
      System.out.println("If the plant receives sufficient water for level: " + waterLevel + ", then plant is likely to be geen with a " + flowerColor + " flower.");
    }
    else if (season.equals("winter"))
    {
      System.out.println("If the plant receives sufficient water for level: " + waterLevel + ", then plant is likely to be brown. In the summer you can hope for a " + flowerColor + " flower.");
    }
    return flowerColor;
  }
}

class PlantClassesHwFour
{
  public static void main(String[] args)
  {
    // 1 & 2. instantiate instance of class and add agruments to parameterized constructor (1)
    Plant fern = new Plant("Fern", 30);

    if (fern.isPrimitive()) {
      System.out.println("I must have some funny looking parts");
    }

    // 3. parameterized method (1)
    fern.suckInNutrients("roots");
    fern.calculateChloroplast(100000);

    // 4. instance variable, also known as a field (1)
    System.out.println(fern.cellCount);
    System.out.println(fern.name);

    // 5. class variable (1)
    System.out.println(Plant.cholorplast);


    System.out.println("------------------------- \n Moving to Class number 2 \n -------------------------");

    // 1 & 2. instantiate instance of class and add agruments to parameterized constructor (2)
    Magnolia magnolia = new Magnolia("yellow", 3);

    // 3. parameterized method (2)
    magnolia.findColor("summer");

    // 4. instance variable, also known as a field
    System.out.println("How much water does my specific Magnolia require? " + magnolia.waterLevel);

    // 5. class variable (2)
    System.out.println("Do Magnolias bloom? " + Magnolia.doesBloom);
    System.out.println("Do Magnolias have leaves? " + magnolia.hasLeaves);
  }
}

