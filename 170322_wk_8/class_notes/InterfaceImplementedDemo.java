interface Shape
{
    double calculateArea();
    double calculatePerimeter();
}
class Circle implements Shape
{
    double radius;
    Circle(double radius, boolean isCircle)
    {
        this.radius = radius;
    }
    public double calculateArea()
    {
        return Math.PI * (Math.pow(this.radius, 2));
    }
    // perimeter analogous to circumference
    public double calculatePerimeter()
    {
        double circumference = 2 * Math.PI * this.radius;
        return circumference;
    }
}
class Rectangle implements Shape
{
    double length, width;
    Rectangle(double l, double w)
    {
        this.length = l;
        width = w;
    }
    public double calculateArea()
    {
        return length * width;
    }
    public double calculatePerimeter()
    {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
class InterfaceImplementedDemo
{
  public static void main(String[] args)
  {
      Rectangle myRectangle = new Rectangle(3,3);
      System.out.println("myRectangle perimeter is " + myRectangle.calculatePerimeter());
      System.out.println("myRectangle area is " + myRectangle.calculateArea());
      Circle myCircle = new Circle(3,true);
      System.out.println("myCircle circumference is " + myCircle.calculatePerimeter());
      System.out.println("myCircle area is " + myCircle.calculateArea());
  }
}