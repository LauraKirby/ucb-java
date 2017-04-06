// Use throws demo.
class ThrowDemo {
    public static char prompt(String str)
        throws java.io.IOException {

        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    // multi-catch: one catch for multifple different types of errors
    public  void mutliCatch(int a, int b){
        int result;
        char chrs[] = { 'A', 'B', 'C' };

        for(int i = 0; i < 2; i++) {
            try {
                if(i == 0)
                    result = a / b; //generate ArithmeticException
                else
                    chrs[5] = 'X'; //generate an ArrayIndexOutOfBoundsException
            }
            // this catch clause catches both exceptions.
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caught: " + e);
            }
        }

        System.out.println("After multi-catch.");
    }
}

class ReadingCh9 {
    public static void main(String args[]) {
      ThrowDemo handleException = new ThrowDemo();

      char ch;

      try {
         ch = handleException.prompt("Enter a letter");
      }
      catch(java.io.IOException exc) {
          System.out.println("I/O exception occured.");
          ch = 'X';
      }

      System.out.println("You pressed " + ch);

      handleException.mutliCatch(88,0);
    }
}

/*
JDK 7
multi-catch:
  - allows two or more exceptions to be caught by the same catch clause
  - common for catch clauses to execute the same code sequence even though they catch different exceptions
  - you can now use a single catch clause to hand the exceptions without code duplications

More precise rethrow:
  - restricts the type of excepptions that can be rethrown to only those checked exceptions
    that the associated try block throws

Final rethrow:
  - the catch parameter must be 'final'
  - it cannot be assigned a new value inside the catch block
  - it can be explicity specified as 'final' but not necessary

unchecked exceptions:
  - automatically available and do not need to be included in the 'throws' list
  - compiler does not check to see if a method handles or throws these exceptions

checked exceptions:
  - must be included in the method's 'throws list' if that method can generate this
    type of exceptoin and does not handle it itself

chained constructors:
  - contructors:
      1. Throwable(Throwable causeExc)
      2. Throwable(String msg, Throwable causeExc)
  - methods:
      1. Throwable getCause()
      2. Throwable initCause(Throwable causeExc)

checked exceptions:
*/