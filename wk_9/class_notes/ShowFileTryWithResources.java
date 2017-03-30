/* Version that automatically closes the stream.
   usage: java ShowFileTryWithResources ShowFileTryWithResources.java
*/
import java.io.*;

class ShowFileTryWithResources
{
  public static void main(String[] args)
  {
    int i;
    if(args.length != 1)
    {
      System.out.println("Usage: ShowFile File");
      return;
    }
    try(FileInputStream fin = new FileInputStream(args[0]))
    {
      do
      {
        i = fin.read();
        if(i != -1) System.out.print((char) i);
      } while(i != -1);
    }
    catch(IOException e)
    {
      System.out.println(e);
    }
  }
}