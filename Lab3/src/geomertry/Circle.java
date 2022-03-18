package geomertry;

public class Circle extends Shape {
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
	
	public static void main(String [] args) {
		Circle c1 = new Circle(5);
		System.out.print("Radius= ");
		System.out.println(c1.getradius());
		System.out.print("Area= ");
		System.out.println(c1.area());
	}
}
