/*
  Student:
    s15 Laura Kirby

  Usage:
    java StringDemoHwFive

  Application description:
    - Two classes:
        1. StringDemo class
          a. include the main method, which will call methods of your StringManipulator class.
        2. StringManipulator
          a. a method that calls String methods on an array of type String with at least two (2) different String methods calls INSIDE a for-each loop
            - see Lecture 3: Program Control Statements#foreachloop
          b. a method that calls at least two (2) different String methods on individual Strings that are not in a String array.
    - Notes:
        - You can pick String methods from: http://download.oracle.com/javase/8/docs/api/java/lang/String.html.
        - The length() method does not count toward the minimum of at least two different (2) String methods.
        - The println() method is NOT a method of the String class, and so it also does not count toward the minimum of at least two (2) String methods.

    - Optional Challenge:
        - Write two STATIC methods for your StringManipulator class,
            - one for its for-each loop
            - one for for its Strings that are not in a for-each loop.
            - Make sure that the StringDemo class calls static methods of the StringManipulator class by using the class name rather than an object name.
              - See Lecture 4: Class, Field, Constructor, Method#staticmethoddefinitionandstaticmethodcall.
*/
class StringManipulator
{
  String userStringInput;
  String[] userStringArrayInput;

  StringManipulator(String userStringInput)
  {
    this.userStringInput = userStringInput;
  }

  StringManipulator(String[] userStringArrayInput)
  {
    this.userStringArrayInput = userStringArrayInput;
    System.out.println("The removeVowels");
  }

  // a. a method that calls String methods on an String[] with
    // two different String methods calls INSIDE a for-each loop
  public String[] removeVowels()
  {
      String[] result = new String[10];
      int count = 0;
      for(String s : this.userStringArrayInput)
      {
          // 1st String method - toLowerCase()
          String x = s.toLowerCase();
          // 2nd String method - equals()
          if (x.equals("a") || x.equals("e") || x.equals("i") || x.equals("o") || x.equals("u")) continue;
          result[count] = s;
      }
      return result;
  }

  // b. a method that calls at least two (2) different String methods on individual Strings that are not in a String array.
  String firstLetterOfString()
  {
    String firstLetter  = "";
    // 1st String method - valueOf()
    // 2nd String method - charAt();
    firstLetter = String.valueOf(this.userStringInput.charAt(0));
    System.out.println("The first argument starts with: " + firstLetter);

    return firstLetter;
  }
}


class StringDemoHwFive
{
  public static void main(String[] args)
  {
    String[] userInput = {"h","e","l","l","o"};
    StringManipulator stringArr = new StringManipulator(userInput);
    stringArr.removeVowels();

    String userInputStr = "hello";
    StringManipulator userString = new StringManipulator(userInputStr);
    userString.firstLetterOfString();
  }
}