import java.util.*;

class ChapterThree {

  public static void main (String args[])
    // throws java.io.IOException {
  //   char choice, ignore;
  //
  //   do {
  //     System.out.println("Help on:");
  //     System.out.println("1. if");
  //     System.out.println("2. switch");
  //     System.out.println("3. for");
  //     System.out.println("4. while");
  //     System.out.println("5. do-while\n");
  //     System.out.println("Choose one:");
  //
  //     choice = (char) System.in.read();
  //
  //     do {
  //       ignore = (char) System.in.read();
  //
  //     } while (ignore != '\n');
  //
  //     System.out.println(ignore);
  //
  //   } while (choice < '1' | choice > '5');
  //
  //
  //   switch(choice) {
  //     case '1' :
  //       System.out.println("The if: \n");
  //       System.out.println("if(condition) statement; \n else statement;");
  //       break;
  //     case '2':
  //       System.out.println("The switch: \n");
  //       System.out.println("switch(expression) {\n case constant: \n \t statement sequence \n \t break; \n }");
  //       break;
  //     case '3':
  //       System.out.println("The for: \n");
  //       System.out.println("for(init; condition; iteration) statement;");
  //       break;
  //     case '4':
  //       System.out.println("The while: \n");
  //       System.out.println("while(condition) statement; \n");
  //       break;
  //     case '5':
  //       System.out.println("The do-while: \n");
  //       System.out.println("do { \t statement; } while (condition);");
  //       break;
  //   }
  //
  //   System.out.println("\n");
  // }

  {
    int count1 = 0, count2 = 0;

    for(int i = 2; i <= 100; i ++)
    {
      System.out.print("Factors of " + i + ": ");
      // to descrease number of iterations, we can remove prime numbers
      // the largest factor of the highest number is 50, so we will never need to go higher than 50
      for (int j = 2; j <= i/2; j++) {
        if ((i%j) == 0 ) System.out.print(j + ", ");

        count1 ++;
      }
      System.out.print(i + "\n\t inner loop: " + count1 + "\n");

      count2 ++;
      System.out.println("\t outter loop: " + count2 + "\n");
    } // end outter four loop
    System.out.println("end count1 = " + count1);
    System.out.println("end count2 = " + count2);

  }
} // end ChapterThree

// a break statement in a loop will cause the loop to break and the next line of the program following the loop will run
// when called within a nested loop, will only break out of the loop it was called in
// label + break can be used to "goto" outter levels from inside a block or loop

// continue - force an early iteration of a loop
// similar to "break", a "continue" statement may use labels