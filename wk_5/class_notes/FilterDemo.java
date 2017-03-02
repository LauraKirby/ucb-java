// gosh I wonder if apples are like durnit or like fiddlesticks now?

import java.util.*;

class Filter
{
   String currentString;
   String[] wordsToFilter = new String[3];

   Filter(String s1, String s2, String s3)
   {
       wordsToFilter[0] = s1;
       wordsToFilter[1] = s2;
       wordsToFilter[2] = s3;
   }

   void filterWords()
   {
      System.out.println("Type a word or the character \'q\' to quit.");
      Scanner sc = new Scanner(System.in);
      do
      {
          currentString = sc.next();
          boolean alertFlag = false;

          for(int i = 0; i < wordsToFilter.length; i++)
          {
              if(currentString.contains(wordsToFilter[i]))
              {
                currentString = "Let's be polite!";
                alertFlag = true;
                break;
              }
              else if(currentString.equals("q") | alertFlag == true)
              {
                  currentString = "";
              }
              else
              {
                  continue;
              }
          } System.out.println(currentString);
      }
      while(!currentString.equals(""));
   }
}
class FilterDemo
{
  public static void main(String[] args)
  {
    Filter myFilter = new Filter("gosh", "durnit", "fiddlesticks");
    myFilter.filterWords();
  }
}