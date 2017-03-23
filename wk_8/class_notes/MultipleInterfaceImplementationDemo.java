interface Taxable
{
    boolean isSalesTaxRequired = true;
    double calculatePriceWithTax(int price);
}
interface Shippable
{
    String deliveryServiceProvider = "U.S. Postal Service";
}
interface Returnable
{
    int timeLimit = 30; // days before returning item
}
class InventoryItem implements Taxable, Shippable, Returnable
{
    int itemID = 0; // increment this value
    public double calculatePriceWithTax(int price)
    {
        double tax = price * .1;
        return tax + price;
    }
}
class BoseRadio extends InventoryItem
{
    BoseRadio()
    {
        System.out.println("this.itemID++ " + this.itemID++);
    }
}
public class MultipleInterfaceImplementationDemo
{
   public static void main(String[] args)
   {
      System.out.println("An interface field is public, final, and static " + BoseRadio.isSalesTaxRequired);
      BoseRadio br1 = new BoseRadio();
      System.out.println("br1.itemID++ " + br1.itemID++);
      System.out.println("Are we required to collect sales tax when shipping this item? " + br1.isSalesTaxRequired);
      System.out.println("Total with tax is " + br1.calculatePriceWithTax(100));
   }
}