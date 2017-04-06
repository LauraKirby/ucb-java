class ReplaceDemo
{
    public static void main(String[] args)
    {
        String[] people = new String[4];
        people[0] = "Mr. Smith";
        people[1] = "Mrs. Jones";
        people[2] = "Dr. Miller";
        people[3] = "Miss Taylor";
        for(int i = 0; i < people.length; i++)
        {
            if (people[i].startsWith("Mrs."))
            {
                System.out.println(people[i] + " is " + people[i].hashCode());
                people[i] = people[i].replace("Mrs.", "Ms");
                System.out.println("A new String object at the same index is " + people[i] + ", which is " + people[i].hashCode());
            }
            System.out.println(people[i] + " is " + people[i].hashCode());
        }
    }
}