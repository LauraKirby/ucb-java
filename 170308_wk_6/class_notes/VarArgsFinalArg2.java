public class VarArgsFinalArg2
{
  // does not compile because "..." is for the final arg
  static void methodWithVarArgs(String ... anyString, int ... v)
  {
  }
  public static void main(String[] args)
  {
  }
}