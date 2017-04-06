class CharArrayLikeStringDemo
{
    public static void main(String[] args)
    {
        char[] drummer0 = {'R', 'i', 'n', 'g', 'o'};
        String first = new String(drummer0);
        // pass a char array variable as runtime argument
        System.out.println(first);
        String bassGuitarist = "Paul";
        // pass a String variable as runtime argument
        System.out.println(bassGuitarist);
        // pass a String literal as runtme argument
        System.out.println("George");
        String lengthTest = new String("\n");
        System.out.println("The length of the string escape sequence for a new line, \\n, is " + lengthTest.length() + " , which is 1 character on Windows, the Return key. Might be different on a different OS");
        System.out.print("\n");
        System.out.print("That was print(\\n)");
        System.out.println("Now, println within runtime argument of \n");
        System.out.println("That was println\\n");
    }
}