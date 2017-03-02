/*
  The syntax of an array initializer is
  type[] identifier = {item1, item2, item3};
*/
class ForEachOnStringArrayDemo
{
    public static void main(String[] args)
    {
        String[] group = {"John", "Paul", "George", "Ringo"};
        for(String s : group)
        {
            System.out.println(s + " has " + s.length() + " letters");
        }
    }
}