class SubstringDemo
{
	static String magicWord = "antidisestablishmentarianism";
	public static void main(String[] args)
	{
		System.out.println("If you lived in 19th century England and were of the Anglican faith, you would probably favor " + magicWord + ".");
		System.out.println("If you were Catholic or Baptist, you would probably favor " + magicWord.substring(0,4) + magicWord.substring(7,(magicWord.length())));
	}
}