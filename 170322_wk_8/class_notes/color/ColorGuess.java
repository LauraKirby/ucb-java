/* USAGE:
Step 1: Compile one directory above the package directory.
    javac color/ColorGuess.java
Step 2: Run by invoking the fully-qualified class name.
    java color.ColorGuess
*/
package color;

import java.io.*;
public class ColorGuess
{
    public static void main(String[] args)
    {
        System.out.println("France, the United Kingdom, and the United States all have national flags with the colors red, white, and _______ " );
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            String s = in.readLine();
            if (s.equalsIgnoreCase("blue"))
                System.out.println("Correct");
            else
                throw new ColorException("Incorrect answer.");
        }
        catch(ColorException ce)
        {
            System.err.println("Incorrect: "+ ce.getError());
        }
        catch (IOException e)
        {
            System.err.println("A problem occurred: "+ e.getMessage());
        }
        finally
        {
            try
            {
                in.close(); // avoid memory leak!
                System.out.println("This concludes the program.");
            }
            catch (IOException e)
            {
                System.err.print("Error message: "+ e.getMessage());
            }
		}
	}
}