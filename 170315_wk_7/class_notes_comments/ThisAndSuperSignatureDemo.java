class Surgeon
{
    boolean isWealthy = true;
    Surgeon()
    {
        this(false); // go to Line 8
    }
    Surgeon(boolean b)
    {
        this(); // recursive constructor not allowed
        isWealthy = b;
    }
}
class HeartSurgeon extends Surgeon
{
    HeartSurgeon()
    {
        super(true);
    }
    HeartSurgeon(boolean b)
    {
        this();
        this.isWealthy = b;
    }
}
class ThisAndSuperSignatureDemo
{
    public static void main(String[] args)
    {
        HeartSurgeon hs1 = new HeartSurgeon();
        System.out.println(hs1.isWealthy);
        HeartSurgeon hs2 = new HeartSurgeon(false);
        System.out.println(hs2.isWealthy);
    }
}