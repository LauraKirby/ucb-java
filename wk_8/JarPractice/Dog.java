// Two classes that have non-empty implementations the interface (2)
class Dog implements Animal
{
  public String fetch()
  {
    String result = "run after ball\n";
    System.out.println(result);
    return result;
  }

  public String growel()
  {
    String result = "GRRRRR...\n";
    System.out.println(result);
    return result;
  }
}