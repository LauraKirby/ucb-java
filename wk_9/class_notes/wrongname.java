// interrupted at first error
class Test {
   public static void main(String[] args) {
      int size;
      for(size = 3; size > -3; size--)
      {
         System.out.println("size = " + size);
         int myArray[] = new int[size];
         System.out.println(myArray.length);
      }
   }
}