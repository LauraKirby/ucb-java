import java.io.*;

class FileCreationDemo
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            File myFile = new File("thomas.txt");
            PrintStream ps = new PrintStream(myFile);
        }
        catch(Throwable e)
        {
            e.printStackTrace();
        }
    }
}