class Donut
{
    boolean hasFlour;
    boolean hasIcing;
    boolean hasMulticoloredSprinkles;
    Donut() // plain, basic, the basis for other forms!
    {
        hasFlour = true;
        System.out.println("Donut constructor has been called");
    }
    // ChocolateCoveredDonut
    Donut(String s)
    {
        this();
        this.hasIcing = true;
        System.out.println("The form with icing has been called");
    }
    //Chocolate with Speckels
    Donut(String icing, boolean hasSpeckles)
    {
        this("speckles, please");
        hasMulticoloredSprinkles = true;
        System.out.println("The chocolate form with speckles has been called");
    }
}
class DonutWithChainedConstructorDemo
{
    public static void main(String[] args)
    {
        //Donut brodieDonut = new Donut();
        //Donut namathDonut = new Donut("choclate");
        Donut unitasDonut = new Donut("chocolate", true);
    }
}