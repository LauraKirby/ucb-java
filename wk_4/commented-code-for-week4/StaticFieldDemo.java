/* Demonstrate that a static field can be accessed by the class name, and no instantiation is necessary */
class MathStuff
{
  static double approximateValueOfPi =3.141592653589793238462643383279502884197169;
}
class StaticFieldDemo
{
  public static void main(String[] args)
  {
    MathStuff myMathStuff = new MathStuff();
    // System.out.println(myMathStuff.approximateValueOfPi);
    System.out.println(MathStuff.approximateValueOfPi);
    System.out.println(myMathStuff.approximateValueOfPi);
  }
}