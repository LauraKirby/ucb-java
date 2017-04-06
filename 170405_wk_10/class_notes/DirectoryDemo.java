import java.io.*;

class DirectoryDemo
{
    public static void main(String[] args)
    {
        //File directory = new File("C:/first-course-in-java/1961-01/FCIJ-1961-Summer/week49");
        File directory = new File("..");
        File[] listOfFiles = directory.listFiles();

        for (int i = 0; i < listOfFiles.length; i++)
        {
            if (listOfFiles[i].isFile())
            {
                System.out.println("File " + listOfFiles[i].getName());
            }
            else if (listOfFiles[i].isDirectory())
            {
                System.out.println("Directory " + listOfFiles[i].getName());
            }
        }
    }
}