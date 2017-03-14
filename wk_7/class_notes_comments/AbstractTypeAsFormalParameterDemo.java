abstract class Healer
{
    abstract void giveTreatment();
    void billPatient()
    {
        System.out.println("Pay me");
    }
}
class AcupunctureDoctor extends Healer
{
    void giveTreatment()
    {
        System.out.println("needles and pins");
    }
}
class Psychiatrist extends Healer
{
    void giveTreatment()
    {
        System.out.println("talk and listen, and maybe swallow pills");
    }
}
class HealerReward
{
    static String getReward(Healer h)
    {
        return "Bravo, Healer!";
    }
}
class AbstractTypeAsFormalParameterDemo
{
   public static void main(String[] args)
   {
       AcupunctureDoctor ad = new AcupunctureDoctor();
       System.out.println(HealerReward.getReward(ad));
       if(ad instanceof Healer) System.out.println("ad is a healer");
       if(ad instanceof AcupunctureDoctor) System.out.println("ad is an AcupunctureDoctor");
       if(ad instanceof Object) System.out.println("ad is an Object");
   }
}