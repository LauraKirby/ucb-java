// demonstrate prefix versus postfix
class ShortcutAssignmentOperatorDemo
{
    public static void main(String[] args)
    {
        int x = 3, y = 0;
        System.out.println("x / ++y is " + x / ++y);
        x = 3;
        y = 0;
        System.out.println("x / y++ is " + x / y++);
    }
}