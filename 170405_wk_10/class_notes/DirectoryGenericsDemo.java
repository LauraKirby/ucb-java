import java.io.*;
import java.util.*;

class DirectoryGenericsDemo
{
    public static void main(String[] args)
    {
        List<String> results = new ArrayList<String>();

        File[] files = new File("C:/first-course-in-java/2015-01/FCIJ-2015-Summer/week9").listFiles();

        for(File file : files)
        {
            if (file.isFile())
            {
                results.add(file.getName() + "\n");
            }
        }
        System.out.println(results);
    }
}