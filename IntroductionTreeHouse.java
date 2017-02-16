// importing the java io package
import java.io.Console;

class IntroductionTreeHouse
{
    public static void main(String[] args)
    {
      Console console = System.console();
      console.printf("Hello \n");
      String firstName = console.readLine("What is your name? ");
      console.printf("Hi %s \n", firstName);

      console.printf("Part 2: Mad Libs");

      String name = console.readLine("Enter your name:  ");
      String adjective = console.readLine("Enter an adjective: ");
      console.printf("\n%s is very %s", name, adjective);

      console.printf("Part 2: Test \n");
      String name2 = console.readLine();

      console.printf("Part 3: Integers \n");
      String ageAsString = console.readLine("Enter your age: ");

      int age = Integer.parseInt(ageAsString);
      if (age < 13) {
        console.printf("Sorry you must be at least 13-years-old to use this program.")
        System.exit(0);
      }
    }
}