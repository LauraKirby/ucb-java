import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StackTraceAppender
{
    public static void throwAnException() throws Exception
    {
        String greeting = "hello";
        System.out.println("trying to get a character that is NOT in the String!");
        System.out.println(greeting.charAt(greeting.length()));
    }

    public static void appendToFile(Exception e)
    {
        try
        {
            FileWriter fstream = new FileWriter("exception-log.txt", true);
            BufferedWriter out = new BufferedWriter(fstream);
            // append mode is true
            PrintWriter pWriter = new PrintWriter(out, true);
            e.printStackTrace(pWriter);
        }
        catch(Exception ie)
        {
            throw new RuntimeException("Could not write Exception to file", ie);
        }
    }

    public static void main(String[] args)
    {
        try
        {
            throwAnException();
        }
        catch(Exception e)
        {
            appendToFile(e);
        }
    }
}