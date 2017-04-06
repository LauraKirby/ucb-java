/* Comparf two files.
usage: java CompFile FIRST.TXT SECOND.TXT
*/
import java.io.*;

class FileComparison
{
    public static void main(String[] args)
    {
        int i=0, j=0;
        FileInputStream f1;
        FileInputStream f2;

        // First make sure that both files have been specified.
        if(args.length !=2 )
        {
            System.out.println("Usage: CompFile f1 f2");
            return;
        }

        // open first file
        try
        {
            f1 = new FileInputStream(args[0]);
        }
        catch(FileNotFoundException exc)
        {
            System.out.println(args[0] + " File Not Found");
            return;
        }
        // open second file
        try
        {
            f2 = new FileInputStream(args[1]);
        }
        catch(FileNotFoundException exc)
        {
            System.out.println(args[1] + " File Not Found");
            // Close the first file if the second file
            // cannot be opened.
            try
            {
                f1.close();
            }
            catch(IOException exc2)
            {
                System.out.println("Cannot close " + args[0]);
            }
            return;
        }

        // Compare files.
        try
        {
          do
          {
            i = f1.read();
            j = f2.read();
            if(i != j) break;
          }
          while(i != -1 && j != -1);
          if(i != j)
          {
            System.out.println("We are reading at character number " + i + " and the original says: " + (char)i + " but second file says: " + (char)j);
          }
          else
            System.out.println("Files are the same.");
        }
        catch(IOException exc)
        {
            System.out.println("File Error of type IOException");
        }
        try
        {
            f1.close();
        }
        catch(IOException exc)
        {
            System.out.println("Error closing " + args[0]);
        }
        try
        {
            f2.close();
        }
        catch(IOException exc)
        {
            System.out.println("Error closing " + args[1]);
        }
    }
}