class Duck
{
    int weight;  // declaring a field
    String style; // declaring a field
    /*Duck(String s) // style is a formal parameter
    {
        this.style = s; // this.style is a field
        System.out.println("I am the " + s + " duck.");
    }
    Duck(int weight)
    {
        this.weight = weight;
        System.out.println("I am the duck who weights " + weight + " kilograms.");
    }*/
    Duck()
    {
		System.out.println("Hello!!!");
	}
}
class TemplateDemo
{
    public static void main(String[] args)
    {
		/*
        Duck donald = new Duck("Fighting Sailor");
        Duck daffy = new Duck("Zanny");  // runtime argument is String
        Duck babyHuey = new Duck(200); // runtime arg is int*/
        //System.out.println("My style field value is " + donald.style);
        Duck myDuck = new Duck(); // default constructor
        System.out.println("My style field value is " + myDuck.style + " and my weight is " + myDuck.weight);
    }
}