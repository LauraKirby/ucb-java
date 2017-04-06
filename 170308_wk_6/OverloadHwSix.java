/*
  Student:
    s15 Laura Kirby

  Usage:
    java OverloadHwSix

  Application description:
    1. an overloaded constructor
    2. an overloaded method
    3. the class with main method must call a constructor
    4. the class with the main method much call both overloads of the method.
    5. a method that calls a constructor
    6. a constructor that calls another constructor using the keyword this().
    7. one of the formal parameters of a constructor overload or a method overload must be an object (as opposed to a primitive)
    8. one method must return an object (as opposed to being void or returning a primitive)

    Object Oriented & Java Guidelines:
    - The class name is a noun that begins with a capital letter, such as Account
    - The method name is a verb, such as getName or calculateInterest.
    - If you have a parameterless constructor, place it before the parameterized constructor. (simple > more complex)
    - Similarly, if you have a parameterless method, place it before the parameterized method. (simple > more complex)
    - Remember that this() to call the target constructor must be the first call when chaining constructors.
*/

// - The class name is a noun that begins with a capital letter
class Hand
{
  // 5. class variable (1)
  private static String[] primitiveTypes = new String[] {"fern", "moss"};

  int age;
  String belongsTo;
  int numberOfFingers;
  String side;
  String colorOfNails;

  Hand(){
    this.belongsTo = "unknown";
    this.colorOfNails = "";
  }

  // 1. part a: an overloaded constructor
  Hand(int age, int numberOfFingers)
  {
    // 6. a constructor that calls another constructor using the keyword this().
    this();
    this.age = age;
    this.numberOfFingers = numberOfFingers;
  }

  // 1. an overloaded constructor
  // 7. one of the formal parameters of a constructor overload or a method overload must be an object (as opposed to a primitive)
  Hand(String belongsTo, String side, String colorOfNails)
  {
    this(0,5);
    this.belongsTo = belongsTo;
    this.side = side;
    this.colorOfNails = colorOfNails;
  }

  // The method name is a verb, such as getName or calculateInterest.
  String getColorOfNails() {
    String result = colorOfNails;
    if (colorOfNails.length() <= 0) result = "clear";
    System.out.println("getColorOfNails 1: " + result);
    return result;
  }

  String getColorOfNails(String color) {
    colorOfNails = color;
    System.out.println("getColorOfNails 2: " + colorOfNails);
    return colorOfNails;
  }

  // Methods: the names are verbs

  // 2. part a: an overloaded method
  String pickUp(int items){
    String result;
    if (items > 5) result = "i'm now holding, 5 items";
    else if (items < 5) result = "too many items";
    else result = "something went wrong";
    System.out.println(result);
    return result;
  }

  // 2. part b: an overloaded method
  String pickUp(String item){
    String result = item;
    System.out.println("i'm now holding, " + result);
    return result;
  }

  // 5. a method that calls a constructor
  // String belongsTo, String side, String colorOfNails
  Hand duplicate(String name, String side, String color) {
    // looks like i cannot pass in arguments to use the different contructors here
    Hand newHand = new Hand();
    this.belongsTo = name;
    this.side = side;
    this.colorOfNails = color;
    System.out.println("Duplicate hand object -- belongs to: " + belongsTo + ", side: " + side + ", color of nails: " + colorOfNails);
    return newHand;
  }

  // 8. one method must return an object (as opposed to being void or returning a primitive)
  // all methods above meet this requirement

}


class OverloadHwSix
{
  public static void main(String[] args)
  {
    // 3. the class with main method must call a constructor
    Hand aHand = new Hand(20, 5);
    Hand overLoadedHand = new Hand("Laura", "right", "clear");

    // 4. the class with the main method much call both overloads of the method.
    aHand.pickUp(10);
    aHand.pickUp("grapes");
    aHand.getColorOfNails();
    aHand.getColorOfNails("green");

    aHand.belongsTo = "San Francisco";
    aHand.side = "left";

    System.out.println("Original hand object -- belongs to: " + aHand.belongsTo + ", side: " + aHand.side + ", color of nails: " + aHand.colorOfNails);

    // 5. a method that calls a constructor
    String owner = aHand.belongsTo;
    aHand.duplicate(aHand.belongsTo, aHand.side, aHand.colorOfNails);

    Hand emptyHand = new Hand(20, 5);
  }
}