package lab;
/*
* calculatedArea is used to find the area of Circle using the Pi times the radius squared
* moveUp adds a -10 to the Y value
* moveDown adds a +10 to the Y value
* moveLeft adds a -10 to the X value
* moveRight adds a +10 to the Y value
*/

public class Circle extends Shape implements Moveable{
	private final static double pi=3.141529;
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public Circle(double radius, double centreX, double centreY ) {
		this.centreX= centreX;
		this.centreY= centreY;
		this.radius =  radius;
	}
	
	public double calculatedArea() {
		return pi*radius*radius;
	}
	
	public void printNewPosition() {
		System.out.println("The new position X = "+ centreX +" Y= " +centreY);
		
	}
	
	public void moveUp(int incrementation) {
		centreY = centreY-  incrementation;
	}
	
	public void moveDown(int incrementation) {
		centreY = centreY+  incrementation;
	}
	
	public void moveRight(int incrementation) {
		centreX = centreX+ incrementation;
	}
	
	public void moveLeft(int incrementation) {
		centreX = centreX- incrementation;
	}

}