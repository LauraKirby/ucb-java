// usage:
// java ColorReplacementDemo

import java.io.*;
import java.util.*;

class ReplaceColorUtility
{
	static void replace(String oldstring, String newstring, File in, File out) throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader(in));
		PrintWriter writer = new PrintWriter(new FileWriter(out));
		String line = null;
		while ((line = reader.readLine()) != null)
		{
			writer.println(line.replaceAll(oldstring, newstring));
		}
		reader.close();
		writer.close();
	}

	static void askUser()
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("What is the name of your HTML file?");
			String inputFile = sc.next();
			File in = new File(inputFile);
			if (!in.exists())
			{
				System.out.println("The input file " + in + " does not exist.  End of application!");
				return;
			}

			System.out.println("What is the name of the new HTML file to create?");
			String outputFile = sc.next();
			File out = new File(outputFile);
			if (out.exists())
			{
			      System.out.println("The output file " + out + " already exists. End of application!");
			      return;
			}

			System.out.println("What is string to find in the current HTML file? Typically, this is a color name, like white, yellow, tan, or silver");
			String findMe = sc.next();
			String oldString = findMe;

			System.out.println("What is the replacement string for the new HTML file?");
			String updatedString = sc.next();
			String newString = updatedString;
			replace(oldString, newString, in, out);

			System.out.println("To test if the replacement occurred, open the newly-created file named " + outputFile);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}

class ColorReplacementDemo
{
	public static void main(String[] args)
	{
		ReplaceColorUtility.askUser();
	}
}