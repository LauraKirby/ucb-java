interface Science
{
	int BOILING_POINT = 100;
}
class ScienceLab implements Science
{
	public static void main(String[] args)
	{
		System.out.println(BOILING_POINT);
		BOILING_POINT = 212;
	}
}