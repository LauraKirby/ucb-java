class Donut
{
	int weight;
    Donut()
    {
        System.out.println("Donut constructor has been called");
    }
}
class ChocolateCoveredDonut
{
    ChocolateCoveredDonut(Donut d)
    {
        System.out.println("ChocolateCoveredDonut constructor has been passed an object of type Donut, and whether the Donut object has an identifier or not, the JVM knows this object as " + d.toString());
    }
}
class DonutRuntimeArgDemo
{
    public static void main(String[] args)
    {
        Donut myDonut = new Donut();
        ChocolateCoveredDonut ccd2 = new ChocolateCoveredDonut(myDonut);
        ChocolateCoveredDonut ccd = new ChocolateCoveredDonut(new Donut());
        ChocolateCoveredDonut ccd3 = new ChocolateCoveredDonut(new Donut());
    }
}