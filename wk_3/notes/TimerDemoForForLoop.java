import java.util.*;
import java.text.*;
class TimerDemoForForLoop
{
    public static void main(String[] args)
    {
        int i;
        int j;
        double startTime = System.nanoTime();
        for(i = 0; i < 1; i++)
        {
            System.out.println("i = 0; i < 1; i++ ");
            System.out.println(System.nanoTime() - startTime);
        }
        startTime = System.nanoTime();
        for(i = 0; i < 10; i++)
        {
            System.out.println("i = 0; i < 10; i++ ");
            System.out.println(System.nanoTime() - startTime);
        }
        startTime = System.nanoTime();
        for(i = 0, j = 10; i < 10; i++, j--)
        {
            System.out.println("i = 0, j = 10; i < 10; i++, j-- ");
            System.out.println(System.nanoTime() - startTime);
        }
        startTime = System.nanoTime();
        for(i = 0; i < 1; i++)
        {
            System.out.println("i = 0; i < 1; i++ ");
            System.out.println(System.nanoTime() - startTime);
        }
        startTime = System.nanoTime();
        for(i = 0; i < 10; i++)
        {
            System.out.println("i = 0; i < 10; i++ ");
            System.out.println(System.nanoTime() - startTime);
        }
    }
}