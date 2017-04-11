/*
  Student:
    s15 Laura Kirby

  Usage:
    java JavaPackagesHwTen

  Application description:
    - Write a program that makes use of the functionality that the java.io package provides.
    - You can do a minimal usage of the package, or, if you want, something a bit more complex.
    - For example, your application might:
      - write the characters the user enters at the keyboard to a file named keyboardInput.txt
      - save a stack trace into a log file that is appendable
      - read a file, modify that file, and save the newly-modified file to the file system
      - compare two files and indicate the first location where the two files differ
      - capture the source code of a web page URL
*/

import java.io.*;
import java.util.*;

class LKUtility {
  String docText = "Anna decided to spend the civic holiday on a kayak adventure.\n At noon she found out that her mom was out driving a racecar";
  PrintWriter writer;
  String file = "./story.txt";

  void writeStory() {
    try{
      this.writer = new PrintWriter(file, "UTF-8");
      this.writer.println(this.docText);
    } catch(IOException e){
      System.out.println("Something went wrong");
    } finally{
      this.writer.close();
    }
  }

  String[] printPalindromes() {
    String[] words = docText.split(" ");
    String[] palindromes;
    int count = 0;
    String result = "";

    for(String s : words) {
      String eachWord = s.toLowerCase();
      String reverse = new StringBuffer(s).reverse().toString().toLowerCase();

      if(eachWord.length() > 1 && eachWord.equals(reverse)) {
        System.out.println(eachWord);
        count += 1;
        result += eachWord += " ";
      }
    }

    System.out.println("there are " + count + " palindromes");
    palindromes = result.split(" ");
    return palindromes;
  }
}

class JavaPackagesHwTen {

  public static void main(String[] args) {
    LKUtility aCustomUtility = new LKUtility();
    aCustomUtility.writeStory();
    aCustomUtility.printPalindromes();
  }

}