/***************************************************************
 * Allison Belk                      												   *
 * calculates and returns the area/volume of a triangle, prism,*
 * circle, cylinder, and sphere									               *
 ***************************************************************/


//import variables
import java.text.DecimalFormat;

//establish the class
public class TestShapes{
	
	//main method
	public static void main (String [] args) {
		
		//round results to 2 decimal places
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		//calulate and output the areas/volumes
		Triangle testTriangle = new Triangle(10,11.5);
		Prism testPrism = new Prism(10, 11.5, 5);
		Circle testCircle = new Circle(13.75);
		Cylinder testCylinder = new Cylinder(13.75,6.75);
		System.out.println("Area of Triangle: "+fmt.format(testTriangle.getArea()));
		System.out.println("Volume of Prism: "+fmt.format(testPrism.getVolume()));
		System.out.println("Area of Circle: "+fmt.format(testCircle.getArea()));
		System.out.println("Volume of Cylinder: "+fmt.format(testCylinder.getVolume()));
	}
}