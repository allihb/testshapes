
/***************************************************************
 * Allison Belk                      												   *
 * calculates and returns the area/volume of a prism      	   *
 ***************************************************************/

//Prism class. Extends Triangle since a prism is a 3d triangle
class Prism extends Triangle{
	private double length;
	
	
	//constructor
	Prism(double base, double height, double lengthValue)
	{
		//get the base and height from the Triangle parent class
		super(base,height);
		length = lengthValue;
	}
	//calculate volume by getting the area then multiplying by the length
	public double getVolume()
	{
		return(getArea()*length);
	}
}