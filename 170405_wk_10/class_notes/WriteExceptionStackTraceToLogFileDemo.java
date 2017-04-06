import java.io.*;

class WriteExceptionStackTraceToLogFileDemo
{
    public static void main(String[] args) throws IOException
    {
        try
        {
            System.out.println(0/0);
        }
        catch(Throwable e)
        {
            FileOutputStream fos = new FileOutputStream(new File("log.txt"));
            PrintStream ps = new PrintStream(fos);
            e.printStackTrace(ps);
            System.out.println("Something went wrong. Please ask your administrator to check the log file.");
        }
    }
}