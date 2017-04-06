interface Science
{
    int BOILING_POINT = 100;
}
class FieldExperiment implements Science
{
    // write code to do something
}
class ScienceLab implements Science
{
    // write code to do something
}
class InterfaceArrayDemo
{
    public static void main(String[] args)
    {
        Science[] myScienceArray = {new FieldExperiment(), new ScienceLab()};
        //Science[] myScienceArray = new Science[2];
        //myScienceArray[0] = new FieldExperiment();
        //myScienceArray[1] = new ScienceLab();
        System.out.println(myScienceArray[0]);
        if (myScienceArray[1] instanceof Science)
        {
            System.out.println(myScienceArray[1].getClass() + " is also a Science object.");
        }
    }
}