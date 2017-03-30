import java.io.*;

class FileCreationDemoWithoutTryCatch
{
    public static void main(String[] args) //throws IOException
    {
		File myFile = new File("thomas.txt");
		PrintStream ps = new PrintStream(myFile);
    }
}