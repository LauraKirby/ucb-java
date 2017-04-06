class SodaPop
{
    int size = 10;
    SodaPop(String syrupType, String diluent)
    {
        System.out.println("constructing this sodapop object with concentrated syrup from headquarters and local liquid, namely, " + syrupType + " and " + diluent);
    }
    SodaPop getSodaPop()
    {
        System.out.println("The size is " + this.size);
        return this;
    }
    /* return type not relevant for unique signature
    boolean getSodaPop()
    {
        return true;
    } */
}
class ObjectReturnForSodaPopDemo
{
    public static void main(String[] args)
    {
        SodaPop drUlcer = new SodaPop("molasses", "muddyWater");
        System.out.println(drUlcer.getSodaPop());
        System.out.println(drUlcer.getSodaPop().getClass());
    }
}