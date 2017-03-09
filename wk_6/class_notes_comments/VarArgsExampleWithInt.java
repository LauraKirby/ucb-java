public class VarArgsExampleWithInt
{
    int doSomething(int ... numberOfApples)
    {
        return(3);
    }
    public static void main(String[] args)
    {
        VarArgsExampleWithInt va = new VarArgsExampleWithInt();
        System.out.println(va.doSomething());
        System.out.println(va.doSomething(7));
        System.out.println(va.doSomething(7,88));
        System.out.println(va.doSomething(7,88, -999, 5555));
    }
}