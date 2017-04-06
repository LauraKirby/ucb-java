import java.io.*;
import java.util.*;

class ScannerReadFromFileDemo
{
    public static void main(String[] args)
    {
        try
        {
            //Scanner sc = new Scanner(System.in);
            Scanner sc = new Scanner(new File("ScannerReadFromFileDemo.java"));
            while(sc.hasNextLine())
            {
                String s = sc.next();
                System.out.println(s);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("No file to read");
        }
    }
}