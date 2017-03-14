class Donut
{
    boolean hasFlour; // false
    boolean hasIcing;
    boolean hasMulticoloredSprinkles;
    Donut() // plain, basic, the basis for specializations!
    {
        hasFlour = true;
        System.out.println("Donut constructor has been called"); // go to
    }
}
class ChocolateCoveredDonut extends Donut // go line 1
{
    ChocolateCoveredDonut()
    {
        //super(); // go line 6
        System.out.println("ChocolateCoveredDonut has called super()");
        this.hasIcing = true;
        System.out.println("The subclass constructor with icing has been called");
    }
}
class ChocolateWithSprecklesDonut extends ChocolateCoveredDonut
{
    ChocolateWithSprecklesDonut()
    {
        super();
        this.hasMulticoloredSprinkles = true;
        System.out.println("The subclass constructor for spreckles has been called");
    }
}
class DonutInheritanceDemo
{
    public static void main(String[] args)
    {
        ChocolateWithSprecklesDonut unitasDonut = new ChocolateWithSprecklesDonut();
        System.out.println(unitasDonut.hasFlour);
        System.out.println(unitasDonut.hasIcing);
        System.out.println(unitasDonut.hasMulticoloredSprinkles);
    }
}