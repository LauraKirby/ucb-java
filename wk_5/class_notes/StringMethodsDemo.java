class StringMethodsDemo
{
    public static void main(String[] args)
    {
        String[] animals = new String[4];
        animals[0] = "elephant is big";
        animals[1] = "";
        animals[2] = "seahorse";
        animals[3] = "     The armadillo has arms    ";
        for(int i = 0; i < animals.length; i++)
        {
            if(animals[i].contains("ll"))
            {
                String fixedString = animals[i].trim();
                System.out.println(fixedString + ".");
            }
            if(animals[i].isEmpty())
            {
                animals[i] = "snail";
                System.out.println(animals[i]);
            }
            if(animals[i].endsWith("big"))
            {
                animals[i] = animals[i].join("*","elephant","big","big");  // this method is new to Java 1.8
                System.out.println(animals[i]);
            }
        }
    }
}