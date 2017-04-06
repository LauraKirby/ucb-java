import java.net.*;
import java.io.*;

public class URLReader
{
    public static void main(String[] args) throws Exception
    {
        URL librarySF = new URL("http://sfpl.org/index.php?pg=2000034301");
        BufferedReader in = new BufferedReader(
        new InputStreamReader(librarySF.openStream()));
        String inputLine;
        while ((inputLine = in.readLine()) != null)
        {
            System.out.println(inputLine);
		}
        in.close();
    }
}