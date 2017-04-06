import java.io.*;

class KeyboardToDisk
{
  public static void main(String[] args)
  {
    String stringFromUser;
    FileWriter fw;
    BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
    try
    {
      // true for appending
      fw = new FileWriter("keyboard-to-disk.txt", true);
    }
    catch(IOException exc)
    {
      System.out.println("Error:" + exc.getMessage());
      System.out.println("Cannot open file.");
      return ;
    }

    System.out.println("Enter text ('stop' to quit).");
    do
    {
      System.out.print("> ");
      stringFromUser = br.readLine();

      if(stringFromUser.compareTo("stop") == 0) break;

      fw.write(stringFromUser);
    }
    while(stringFromUser.compareTo("stop") != 0);

    fw.close();
    System.out.println("Look at the output in file  keyboard-to-disk.txt");
  }
}