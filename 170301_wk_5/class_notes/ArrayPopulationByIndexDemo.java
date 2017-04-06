/*
  The syntax of array population after memory allocation is
  type[] identifier = {item1, item2, item3};
*/
class ArrayPopulationByIndexDemo
{
    public static void main(String[] args)
    {
        String[] group = new String[4];
        group[0] = "John";
        //group[1] = "Paul";
        group[2] = "George";
        // group[3] = "Ringo";
        for(int i = 0; i < group.length; i++)
        {
            if(group[i] == null) continue;
            System.out.println(group[i] + " has " + group[i].length() + " letters");
        }
        for(String s : group)
        {
            if(s == null) continue;
            System.out.println(s + " has " + s.length() + " letters");
        }
    }
}