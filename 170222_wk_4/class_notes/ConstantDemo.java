class Test
{
    final int MAX_PRICE = 160;
}
class ConstantDemo
{
    public static void main(String[] args)
    {
        Test myTest = new Test();
        System.out.println(myTest.MAX_PRICE);
        // myTest.MAX_PRICE = 160; won't compile
        // myTest.MAX_PRICE = 170; won't compile
        System.out.println(Integer.MAX_VALUE);
        // Integer.MAX_VALUE = 2147483647; won't compile
        // Integer.MAX_VALUE = Integer.MAX_VALUE; won't compile
    }
}