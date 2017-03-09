public class VarArgsFinalArg
{
  // does not compile because "..." is for the final arg
  static void methodWithVarArgs(int ... v, String anyString)
  {
  }
  public static void main(String[] args)
  {
  }
}