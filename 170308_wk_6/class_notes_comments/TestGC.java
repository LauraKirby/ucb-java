class ObjectGenerator
{
    String str; // object to be garbage collected
    int id;

    ObjectGenerator(int i)
    {
        this.str = new String("abcdefghijklmnopqrstuvwxyz");
        this.id = i;
    }

    protected void finalize()
    {
        System.out.println("ObjectGenerator object " + id + " has been finalized.");
    }
}

class TestGC
{
    public static void main(String[] args)
    {
        Runtime rt = Runtime.getRuntime();
        System.out.println("Available Free Memory: " + rt.freeMemory());

        // create one hundred thousand objects
        for(int i=0; i<100000; i++ )
        {
            ObjectGenerator x = new ObjectGenerator(i);
            String myString = new String(i + " hello");
            System.out.println(myString);
        }

        // request from the runtime the amount of free memory
        System.out.println("Free Memory before call to gc(): " +
        rt.freeMemory());
        // request a finalize call prior to garbage collection
        System.runFinalization();
        // request a garbage collection
        System.gc();
        System.out.println(" Free Memory after call to gc(): " +
        rt.freeMemory());
    }
}