package ex3;

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
	
	public void moveUp() {
		centreY = centreY-10;
	}
	
	public void moveDown() {
		centreY = centreY+10;
	}
	
	public void moveRight() {
		centreX = centreX+10;
	}
	
	public void moveLeft() {
		centreX = centreX-10;
	}

}
