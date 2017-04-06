/* Demonstrate byte value when cast from int */
class Temperature
{
	final static double temperature = 98.6;
}

class CastDemoAsLoop
{
  public static void main(String[] args)
  {
	Temperature myTemperature = new Temperature();
	System.out.println(myTemperature.temperature);
	int intVersionOfTemperature = (int)myTemperature.temperature;
	System.out.println(intVersionOfTemperature);

    byte b;
    int i;
    /*for(i = 0; i < 258; i++)
    {
        if(i == 127)
        {
            System.out.println("The constant value of Byte.MAX_VALUE is " + Byte.MAX_VALUE);
        }
        b = (byte)i;
        System.out.println("Value of b: " + b +
        " but the value of i is " + i);
    } */
  }
}