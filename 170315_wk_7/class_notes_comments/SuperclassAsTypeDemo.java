class Surgeon {}
class HeartSurgeon extends Surgeon {}
class SuperclassAsTypeDemo
{
    public static void main(String[] args)
    {
        Surgeon[] myArrayOfSurgeons = new Surgeon[55];
        HeartSurgeon franciscoRomero1801 = new HeartSurgeon();
        myArrayOfSurgeons[0] = franciscoRomero1801;
        System.out.println(myArrayOfSurgeons[0].getClass());
 
        Object[] myObjectArray = new Object[3];
        String myString = new String();
        myObjectArray[0] = myString;
        System.out.println(myObjectArray[0].getClass());
    }
}