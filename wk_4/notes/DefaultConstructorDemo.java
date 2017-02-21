class Stereo
{
    boolean myBool;
    int myInt;
    double myDouble;
    char myChar;
    String myString;
    // no constructor defined, so default constructor
}
class DefaultConstructorDemo
{
    public static void main(String[] args)
    {
        Stereo s = new Stereo();
        System.out.println(s.myBool);
        System.out.println(s.myInt);
        System.out.println(s.myDouble);
        System.out.println("the default char value is a blank space:" + s.myChar + ".");
        System.out.println(s.myString);
    }
}