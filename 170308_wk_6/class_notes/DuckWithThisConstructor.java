class Duck
{
    boolean canFloat = true;
    boolean canPaddleInWater;
    boolean canDive;
    boolean canQuack;
    boolean hasCrest;
    boolean canRun;
    Duck()
    {
        canPaddleInWater = true;
        canDive = true;
        canQuack = true;
    }
    Duck(String style)
    {
        this();
        if(style.equals("Crested")) hasCrest = true;
        if(style.equals("Java Runner")) canRun = true;
        System.out.println("I am the " + style + " duck.");
    }
}
class DuckWithThisConstructor
{
    public static void main(String[] args)
    {
        Duck myCrested = new Duck("Crested");
        System.out.println("Can the Crested Duck run? " + myCrested.canRun);
        Duck myJavaDuck = new Duck("Java Runner");
        System.out.println("Can the Java Runner duck run? " + myJavaDuck.canRun);
    }
}