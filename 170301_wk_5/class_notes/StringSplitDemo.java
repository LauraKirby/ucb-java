class StringSplitDemo
{
    public static void main(String[] args)
    {
        String employee = "Curie,Marie,Polonium,,53,6.5,,,10.75,8.5";
        // regular expression to match on comma
        String delims = "[,]";
        String[] tokens = employee.split(delims);
        for(String x : tokens)
        {
           System.out.println(x.toLowerCase());
        }
        // split on blank space
        String famousMan = "Mohandas Karamchand    Gandhi Esquire";
        // regex for 1 or more blank spaces
        String delims2 = "[ ]+";
        String[] tokens2 = famousMan.split(delims2);
        // print each string in the array
        for(int i = 0; i < tokens2.length; i++)
        {
            System.out.println(tokens2[i]);
        }
        // print the characters in last name
        for(int i = 0; i <  tokens2[2].length(); i++)
        {
            System.out.println(tokens2[2].charAt(i));
        }
    }
}