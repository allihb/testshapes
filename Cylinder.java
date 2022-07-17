/***************************************************************
 * Allison Belk                      												   *
 * calculates and returns the area/volume of a cylinder    	   *
 ***************************************************************/


//create class
class Cylinder extends Circle{
	
	//establish variables
	private double height;
	
	//constructor
	public Cylinder(double radius, double heightValue)
	{
		//gets the radius using the parent class
		super(radius);
		height = heightValue;
	}
	//calculates volume by getting area from the parent class and multiplying by the height
	double getVolume()
	{
		return getArea()*height;
	}
}