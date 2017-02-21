/* Demonstrate that each object has its own copy of field values */
class Singer
{
  final String hairColor = "purple"; // instance variable
  Singer(String hairColor) // formal parameter gets the value "blonde"
  {
	  // assign the value of the formal param to field
      //this.hairColor = hairColor; // this object
      this.hairColor = "purple";
  }
}
class InstanceVariableDemo
{
  public static void main(String[] args)
  {
	// "blonde" is a _runtime______ _arg______ to the _constructor____
    Singer debbieHarryOfBlondie = new Singer("blonde");
    Singer elvisPresley = new Singer("black");
    System.out.println("People thought the singer of Blondie was a " + debbieHarryOfBlondie.hairColor + " and people thought Elvis had " + elvisPresley.hairColor + " hair.");
    //elvisPresley.hairColor = "red";
    //System.out.println(elvisPresley.hairColor);
  }
}