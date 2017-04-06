// questions: pg 137

class ChapterFive {
  public static void main (String args[]) {
    int sample[] = new int[10];
    int i;

    for(i = 0; i < 10; i = i+1)
    {
      sample[i] = i;
      System.out.println("index of array " + sample[i]);
    }

    for(i = 0; i < 10; i = i+1)
      System.out.println("second array " + sample[i]);

    // Bubble Sort
    int nums[] = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};
    int a, b, t;
    int size = 10;
    for(a = 1; a < size; a++){
      for(b = size-1; b >= a; b--){
        if(nums[b-1] > nums[b]) {
          // exhange elements
          t = nums[b-1];
          nums[b-1] = nums[b];
          nums[b] = t;
        }
      }
    }

  }
}

// array boundaries are strictly enforced in Java and will cause a run-time error and terminate the program.

// Array class doesn't exist within the documentation
// arrays existed before OO