// class definition
    // field declarations
    // constructor definitions
    // method definitions
// class with main
        // object instantiation
        // call a method on an object
//--------------------------
// class definition
class ClassName
{
    // static fields are class variables
    // non-static fields are instance variables
    static final int BOILING_POINT = 100;
    type fieldName;
    Constructor(type formalParmeterList)
    {
        // name matches class name
        // performs initialization
    }
    SavingsAccount(double initialDeposit, int SSN, String firstName, char MiddleInital, String lastName)
    {
        // initialize a newly created account
    }
    // method definitions
    returnType methodName(type formalParmeterList)
    {
        // do something on objects
        // that have been initialized
    }
}
// ---------------------------
// class with main
class SomethingDemo
{
    public static void main(String[] args)
   {
    // object instantiation
    // call a method on an object
    // normally, this is NOT the place for
    // lots of loops, switches, if-else-ladders
    // call constructor to create new object
    Type objectName = new Type();
    // call a method ON an object
    objectName.methodName();
    // call a static method OF a class
    ClassName.methodName();
  }
}