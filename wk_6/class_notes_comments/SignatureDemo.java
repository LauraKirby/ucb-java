class Printer
{
	boolean myBoolean; // field, instance variable
	int myInt; // ""
	// defining a method
	// signature = boolean > int
	void printSomething(boolean myBoolean, int myInt)
	{
		System.out.println("boolean before int");
	}
	// this overload has the signature: int > boolean
	String printSomething(int myInt, boolean myBoolean)
	{
		System.out.println("int before boolean");
		return "hello";
    }
}
class SignatureDemo
{
    public static void main(String[] args)
    {
		Printer myPrinter = new Printer();
        myPrinter.printSomething(false, 17);
        myPrinter.printSomething(17, false);
    }
}