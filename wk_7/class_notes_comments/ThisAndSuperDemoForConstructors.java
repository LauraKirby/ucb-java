// The call to the superclass constructor can have arguments
class BasicCake extends java.lang.Object
{
    boolean isBasic = true;
    BasicCake()
    {
        System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic);
    }
    BasicCake(String anyString)
    {
        System.out.println("This superclass constructor has a String parameter");
    }
}
class FrostedCake extends BasicCake
{
    boolean isBasic = false;
    String typeOfIcing;
    FrostedCake()
    {
        super(); // valid signature // go to
        // ^ call contructor for super class, which will -->
        // complete that business logic for my new object
        System.out.println("batter has been mixed and baked and isBasic is set to " + this.isBasic + " but in the superclass, the value of isBasic remains " + super.isBasic);
    }
    FrostedCake(boolean hasStringInput)
    {
        // also a valid signature
        super("These are a few of my favorite Strings");
    }
    String setTypeOfIcing(String s)
    {
        return typeOfIcing = s;
    }
}
class ThisAndSuperDemoForConstructors
{
    public static void main(String[] args)
    {
        FrostedCake fc = new FrostedCake(); // go to line 18
        System.out.println("The icing is " + fc.setTypeOfIcing("chocolate"));
        FrostedCake fc2 = new FrostedCake(2 + 2 == 4);
    }
}

// extends BasicCake will create the fields and methods on the subclass object
// 'super()'  the constructor

// 3 members of a class: field, constructor, methods

// overriding is a horrible example. should give a practical example.
// prof gave: how new person of power in US dresses different than previous person in power in a different region

// building software for a dounut factory
// most of our program will be handling

