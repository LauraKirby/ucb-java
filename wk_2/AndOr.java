class AndOr {
  public static void main (String args[]) {
    int i = 0;
    int ii = 0;

    // i is still incremented even if "if" evaluates to false
    if (false & (++i < 100))
      System.out.println("this won't be displayed");
      System.out.println("if statement executed: " + i); // displays 1

    // in this case, i is not executed bc the short-circuit operator skips the increment
    if(false && (++ii < 100))
      System.out.println("this won't be displayed");
      System.out.println("if statement executed: " + ii); // displays 1
  }
}