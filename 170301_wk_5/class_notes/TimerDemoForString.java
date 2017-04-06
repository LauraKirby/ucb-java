import java.util.*;
import java.text.*;

class TimerDemoForString
{
    public static void main(String[] args)
    {
        double startTime = System.nanoTime();
        System.out.println("Creating first a NON-empty string, then an empty string.");
        startTime = System.nanoTime();
        String s2 = new String("Hello");
        System.out.println(System.nanoTime() - startTime);
        startTime = System.nanoTime();
        String s = new String();
        System.out.println(System.nanoTime() - startTime);
        System.out.println("Creating an empty string, then a non-empty string.");
        startTime = System.nanoTime();
        String s3 = new String();
        System.out.println(System.nanoTime() - startTime);
        startTime = System.nanoTime();
        String s4 = new String("Goodbye");
        System.out.println(System.nanoTime() - startTime);
        System.out.println("What if the string is already in the JVM?");
        startTime = System.nanoTime();
        String s5 = new String("Goodbye");
        System.out.println(System.nanoTime() - startTime);
        System.out.println("What if the string is a reference to an existing string?");
        startTime = System.nanoTime();
        String s6 = s5;
        System.out.println(System.nanoTime() - startTime);
        System.out.println("Creating an empty string, then a non-empty string.");
        startTime = System.nanoTime();
        String s7 = new String();
        System.out.println(System.nanoTime() - startTime);
        startTime = System.nanoTime();
        String s8 = new String("Adios");
        System.out.println(System.nanoTime() - startTime);
        System.out.println("What if the string is already in the JVM?");
        startTime = System.nanoTime();
        String s9 = new String("Goodbye");
        System.out.println(System.nanoTime() - startTime);
        System.out.println("What if the string is a reference to an existing string?");
        startTime = System.nanoTime();
        String s10 = s5;
        System.out.println(System.nanoTime() - startTime);
    }
}