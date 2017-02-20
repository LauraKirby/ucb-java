class StringTestDemo
{
	public static void main(String[] args)
	{
		String testString = args[0];
		char testChar = testString.charAt(0);
		if(testChar > 65 & testChar <= 90)
		{
			System.out.println("The value of " + testChar + " is a capital letter with the byte value of " + (byte)testChar);
		}
		else if(testChar >= 97 & testChar <= 122)
		{
			System.out.println("The value of " + testChar + " is a lowercase letter with the byte value of " + (byte)testChar);
		}
		else System.out.println("The value is not in a letter of the English alphabet.");
	}
}