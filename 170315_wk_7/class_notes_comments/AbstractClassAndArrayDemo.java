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
class AbstractClassAndArrayDemo
{
 public static void main(String[] args)
 {
 // Illegal to create an array of an abstract class
 // Healer[] myHealerArray = new Healer[3];
 Healer[] myHealerArray = { new AcupunctureDoctor(), new Psychiatrist() };
 System.out.println(myHealerArray[0].toString());
 }
}