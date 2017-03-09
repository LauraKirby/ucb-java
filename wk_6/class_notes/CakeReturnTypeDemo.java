class Cake
{
    Cake()
    {
        System.out.println("Thank you for asking me to construct a cake!");
    }
    Cake getCake()
    {
        return new Cake();
    }
}
class CakeReturnTypeDemo
{
    public static void main(String[] args)
    {
        Cake myCake = new Cake();
        Cake yourCake = myCake.getCake();
        System.out.println(yourCake.getClass());
    }
}