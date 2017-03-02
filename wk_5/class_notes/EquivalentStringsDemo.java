class EquivalentStringsDemo
{
	public static void main(String[] args)
	{
		String myString = "hello";
		String yourString = "HELLO";
		if(myString.toUpperCase().equals(yourString))
		{
			System.out.println("These two strings have equivalent content");
		}
		if(myString.toUpperCase() == yourString)
		{
			System.out.println("These two variables point to the same String object");
		}
		myString = yourString;
		if(myString.toUpperCase() == yourString)
		{
			System.out.println("AFTER the statement that myString = yourString, these two variables point to the same String object");
		}
	}
}