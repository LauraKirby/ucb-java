class Stereo
{
    boolean myBool;
    int myInt;
    double myDouble;
    char myChar;
    String myString;
    Stereo() // custom constructor
    {
        myBool = true;
        myInt = 17;
        myDouble = 3.14159;
        myChar = 'k';
        myString = "A constructor can initializes the values of fields";
    }
}
class CustomConstructorDemo
{
    public static void main(String[] args)
    {
        Stereo s = new Stereo();
        System.out.println(s.myBool);
        System.out.println(s.myInt);
        System.out.println(s.myDouble);
        System.out.println(s.myChar);
        System.out.println(s.myString + ".");
    }
}