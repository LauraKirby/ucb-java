public class ThreeDimensionalArrayColumnsDemo
{
    public static void main(String[] args)
    {
        String[][][] space = new String[3][3][3];
		space[0][0][0] = "NAME";
		space[0][1][0] = "HEIGHT";
        space[0][0][1] = "LOCATION";

        space[1][0][0] = "Everest";
        space[1][1][0] = "29,029";
        space[1][0][1] = "Nepal";

        space[2][0][0] = "Shasta";
        space[2][1][0] = "14,180";
        space[2][0][1] = "California";

        System.out.println("Column 1 is " + space[0][0][0]  + ", Column 2 is " + space[0][1][0] + ", Column 3 is " + space[0][0][1]);

        System.out.println("Mount " + space[1][0][0]  + " is " + space[1][1][0] + " feet tall and in " + space[1][0][1]);

        System.out.println("Mount " + space[2][0][0]  + " is  " + space[2][1][0] + " feet tall and in " + space[2][0][1]);
    }
}
/*
Column 1 is NAME, Column 2 is HEIGHT, Column 3 is LOCATION
Mount Everest is 29,029 feet tall and in Nepal
Mount Shasta is  14,180 feet tall and in California
*/