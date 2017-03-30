// Two classes that have non-empty implementations the interface (1)
class Cat implements Animal
{
  public String fetch()
  {
    String result = "stare at human\n";
    System.out.println(result);
    return result;
  }
  public String growel()
  {
    String result = "grrrr\n";
    System.out.println(result);
    return result;
  }

}