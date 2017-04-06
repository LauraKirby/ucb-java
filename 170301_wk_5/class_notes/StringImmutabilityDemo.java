class StringImmutabilityDemo
{
    public static void main(String[] args)
    {
      String h1 = "Jimi Hendrix";
      String h2 = "Jimi";
      System.out.println("\"Jimi Hendrix\" assigned to h1 and \"Jimi\" assigned to h2");
      boolean myTest1 = (h1 == h2);
      System.out.println("Are h1 and h2 the same physical object? " + myTest1);
      System.out.println("Do the two Strings have the exact same set of characters? In other words, is it true that h1.equals(h2) ? " + h1.equals(h2));
      System.out.println("Does the JVM use the same hasCode to identify these two strings? h1.hashCode(): " + h1.hashCode() + " h2.hashCode(): " + h2.hashCode());
      // equivalent characters!
      h2 = h2 + " Hendrix";
      System.out.println("\nh2 is now h2 + \" Hendrix\": " + h2);
      boolean myTest2 = (h1 == h2);
      System.out.println("Are h1 and h2 the same physical object if we test with ==? " + myTest2);
      System.out.println("Do the two Strings have the exact same set of characters? In other words, is it true that h1.equals(h2) ? " + h1.equals(h2)); // equivalent characters
      System.out.println("h1.hashCode(): " + h1.hashCode() + " h2.hashCode(): " + h2.hashCode());
      System.out.println("We conclude that the JVM knows these two strings do not have the same history, but given their equivalent content, the JVM is optimized to store the content in a single place in memory.");
      // create a new string with the same history as h1
      h2 = "Jimi Hendrix"; // new String yet centralized!
      System.out.print("\n\"Jimi Hendrix\" remains assigned to h1 and \"Jimi Hendrix\" assigned to a new String named h2");
      boolean myTest3 = (h1 == h2);
      System.out.println("\nAre h1 and h2 the same physical object? " + myTest3);
      System.out.println("h1.equals(h2) " + h1.equals(h2));
      System.out.println("h1.hashCode(): " + h1.hashCode() + " h2.hashCode(): " + h2.hashCode());
    }
}