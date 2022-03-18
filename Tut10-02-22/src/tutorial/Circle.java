package tutorial;

public class Circle {
	private static double pi=3.141592; //constant
	private double radius;
	/////
	
	public double getradius() {
		return radius;
	}
	
	public Circle(double radius) {
		this.radius = radius;
		
	}
	
	public double area() {
		double d=pi*radius*radius;
		return d;
	}
}
