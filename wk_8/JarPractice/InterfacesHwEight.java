/*
  Student:
    s15 Laura Kirby

  Usage:
    java InterfacesHwEight

  Application description:
    - Homework 8: an Executable JAR file
    - Write an application with four (4) separate .java files:
      1. An interface with two methods
         -  ex: such as Returnable.java
      2. Two classes that have non-empty implementations the interface
         - ex: such as Book.java and Sweater.java
      3. A class with main that exercises the implemented methods on both
         kinds of objects
         - ex: such as InterfaceImplementationDemo.java


Test your application and the executable jar file:
  - Compile the class with main
  - Run the class with main
  - Create a jar of all the files, such as week8.jar
  - Test the jar
  - Send the jar to yourself, and if the email does not go through,
    try changing the name, such as week8.rename
  - If the email attachment still does not go through, try uploading
    the file to a cloud service, such as Dropbox or Google Drive
  - You can use any scenario you create, or one of the scenarios below:
    Scenario 1:
      - an Animal interface in one file named Animal.java
        that specifies the speak() and eat() methods.
      - a Dog.java file
      - a Cat.java file
      - an AnimalDemo.java file
      - Implement the interface in Dog.java and Cat.java.
      - Remember that every class that implements and interface must implement every method
        in the interface (except default and static).
      - Remember to declare the implementations as public methods.
      - Put the main method in AnimalDemo.java.

Sending Homework:
  - Create a manifest file named animal-demo-manifest.txt that informs the jar
    utility which class has the main method.
  - This means 4 .java files and 1 .txt file.
  - Test that your .jar file runs properly.
  - Rename your .jar file from, say, homework8.jar to homework8.renamethistojar
    because sometimes gmail blocks the attachment to protect me from receiving an
    executable program. (If this technique does not work, email me "BLOCKED" and
    we will find another solution.)
  - Email a single .renamethistojar file (not a .zip file) that includes:
      - the four .java files
      - the .class files
      - the manifest file that specifies the main class.
  - See the "JAR instructions" at Lecture 8: Interfaces, Jar files, and Packages#Howtocreatea.jarfile
  - I will rename your attachment to .jar, run the jar, inflate the jar, and examine the source code.
*/

class InterfacesHwEight
{
  public static void main(String[] args)
  {
    Cat aCat = new Cat();
    aCat.growel();
    aCat.fetch();

    Dog aDog = new Dog();
    aDog.growel();
    aDog.fetch();
  }
}



