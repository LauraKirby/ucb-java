class TwoDimensionalShape
{
    double length;
}

class Rectangle extends TwoDimensionalShape
{
    double length;
    double length2;
    Rectangle() {}
    Rectangle(double lengthOfOneSide, double lengthOfAnotherSide)
    {
        this.length = lengthOfOneSide;
        this.length2 = lengthOfAnotherSide;
    }
    double calculateArea() // is overridden by the subclass
    {
        double area;
        area = this.length * this.length2;
        return area;
    }
}
class Square extends Rectangle
{
    Square(double lengthOfSide)
    {
		super();
        this.length = lengthOfSide;
    }
    double calculateArea()  // overrides the superclass version
    {
        return Math.pow(this.length, 2);
    }
}
class Circle extends TwoDimensionalShape
{
    Circle(double radius, boolean isCircle)
    {
        this.length = radius;
    }
    double calculateArea()
    {
        return Math.PI * (Math.pow(this.length, 2));
    }
}
class CalculateAreaOverrideDemo
{
  public static void main(String[] args)
  {
      Square mySquare = new Square(3);
      Rectangle myRectangle = new Rectangle(3, 6);
      Circle myCircle = new Circle(3,true);
      System.out.println(mySquare.calculateArea());
      System.out.println(myRectangle.calculateArea());
      System.out.println(myCircle.calculateArea());
  }
}