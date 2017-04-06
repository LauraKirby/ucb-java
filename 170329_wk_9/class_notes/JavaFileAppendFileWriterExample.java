import java.io.*;

public class JavaFileAppendFileWriterExample
{
    public void appendToCheckbook()
    {
      BufferedWriter bw = null;

      try
      {
         // "true" means append
         bw = new BufferedWriter(new FileWriter("checkbook.dat", true));
         bw.write("400:08311998:UC Berkeley Extension:800.95");
         bw.newLine();
         bw.flush();
      }
      catch (IOException ioe)
      {
        ioe.printStackTrace();
      }
      finally
      {
        if(bw != null) try {bw.close();}
        catch (IOException ioe2) {}
      }
    }
    public static void main(String[] args)
    {
        JavaFileAppendFileWriterExample a = new JavaFileAppendFileWriterExample();
        a.appendToCheckbook();
        System.out.println("Look on the file system for checkbook.dat, which gets longer each time you run this program.");
    }
}