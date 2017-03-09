class SignaturePosition
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
    static void printSomething(int myInt, boolean myBoolean)
    {
        System.out.println("int before boolean");
    }
    public static void main(String[] args)
    {
		// runtime method call
        //printSomething(false, 17);
        printSomething(17, false);
    }
}