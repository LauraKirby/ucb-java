class Apple
{
    String color = "red"; // field governs all apples
    int weight = 50; // field
    boolean isEdible = true;

    void setColor(String c) // parameterize method // green
    {
        this.color = c; // field is change to green
    }
    void setWeight(int w)
    {
        this.weight = w;
    }
    void setEdible(boolean b)
    {
        this.isEdible = b;
    }
}
class ReferenceTest
{
    public static void main(String[] args)
    {
        Apple a1 = new Apple(); // construct first apple
        System.out.println(a1.color); // red
        System.out.println(a1.weight); // 50
        System.out.println(a1.isEdible); // true

        Apple a2 = new Apple();
        a2.setColor("green");
        a2.setWeight(100);
        a2.setEdible(false);
        System.out.println(a2.color);
        System.out.println(a2.weight);
        System.out.println(a2.isEdible);

        a1 = a2;
        System.out.println("a1 now points to the same place in memory that a2 does.");
        System.out.println(a1.color);
        System.out.println(a1.weight);
        System.out.println(a1.isEdible);
        System.out.println("If I change a1 to the color yellow, does it affect a2?");
        a1.setColor("yellow");
        System.out.println(a2.color);
    }
}