import java.io.*;

public class CopyFileWithStream
{
  public static void copyFile(File inputFile, File outputFile) throws IOException
  {
    FileInputStream fis  = new FileInputStream(inputFile);
    FileOutputStream fos = new FileOutputStream(outputFile);
    try
    {
        byte[] myBuffer = new byte[2048];
        int i = 0;
        while ((i = fis.read(myBuffer)) != -1)
        {
            fos.write(myBuffer, 0, i);
        }
    }
    catch (IOException e)
    {
        throw e;
    }
    finally
    {
        if (fis != null) fis.close();
        if (fos != null) fos.close();
    }
  }
  public static void main(String[] args) throws IOException
  {
    CopyFileWithStream.copyFile(new File(args[0]), new File(args[1]));
  }
}