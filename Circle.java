
/***************************************************************
 * Allison Belk																							   *
 * calculates and returns the area/volume of a circle    		   *
 ***************************************************************/

//creating the class
class Circle{
	
	//establish variables
protected double radius;

//constructor
public Circle(double radius) {
	this.radius = radius;
}

//returns area of the circle
double getArea()
{
	return Math.PI*Math.pow(radius,2);
}
}