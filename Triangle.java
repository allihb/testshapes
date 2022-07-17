/***************************************************************
 * Allison Belk                      												   *
 * calculates and returns the area/volume of a triangle        *
 ***************************************************************/

//creating the triangle class
class Triangle{
	
	//establish variables
	protected double base;
	protected double height;
	
	//constructor
	public Triangle(double base, double height){
		this.base = base;
		this.height = height;
	}
	
	//returns the area from the base and height parameters
	public double getArea()
	{
		return .5*base*height;
	}
}