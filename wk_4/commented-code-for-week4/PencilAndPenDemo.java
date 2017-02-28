// default values for Java
// review professor notes about string comparision
// might be fun to watch: first James Bond movie or maxwell smart
// reference lecture should take place after book discusses references

class Pencil
{
	// declare a field of type String
	String color;  // an instance variable, data, attribute
    // define a constructor that takes a formal parameter
	Pencil(String color)  // external color is set to "yellow"
	{
		myColor = this.color; // color gets the value "yellow"
		myColor = color;
	}
    // define a method that is parameterless
	String write()
	{
		int myFavoriteNumber; // local variable
		//return "The external color of this pencil is " + externalColor;
		// concatenate 2 strings into a new string
	    return ("The external color of this pencil is " + color);
	}
}

class Pen
{
	String color; // field

	Pen(String inkColor) // formal param. gets runtime arg value
	{
		color = inkColor; // assign the value of the formal param
		                  // to the field
	}

	String write()
	{
		return "The color of this pen's ink is " + color;
	}
}

class PencilAndPenDemo
{
	// define the main method with a formal parameter
	//  	args is a formal parameter in a method definition
	public static void main(String[] args)
	{
		// creating an object by calling a parameterized constructor
		// here in runtime, we pass a runtime argument of type String
		// type id assignment operator
		// allocates memory in the JVM for a new object
		// constructor call
		Pencil myYellowPencil = new Pencil("yellow");
		// execution returns to the caller
		Pen myBlueInkPen = new Pen("blue"); // go to line 21
		Pen myGreenInkPen = new Pen("green"); // go to line 21
		// call a method of the class ON the object
		// by using the ___ operator
		System.out.println(myYellowPencil.write());
		System.out.println(myBlueInkPen.write());
		System.out.println(myGreenInkPen.write());
	}
}