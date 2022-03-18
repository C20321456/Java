package lab;
/*
 * calculatedArea is used to find the area of Rectangle using the width by the height
 * moveUp adds a -10 to the Y value
 * moveDown adds a +10 to the Y value
 * moveLeft adds a -10 to the X value
 * moveRight adds a +10 to the Y value
 * 
 * 
 */



public class Rectangle extends Shape implements Moveable{
	private double width;
	private double height;
	
	public Rectangle(double width, double height, double centreX, double centreY) {
		this.width = width;
		this.height = height;
		this.centreX = centreX;
		this.centreY = centreY;
		
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calculatedArea() {
		return height*width;
	}
	
	public void printNewPosition() {
		System.out.println("The new position X = "+ centreX +" Y= " +centreY);
		
	}
	
	public void moveUp(int incrementation) {
		centreY = centreY- incrementation;
	}
	
	public void moveDown(int incrementation) {
		centreY = centreY+ incrementation;
	}
	
	public void moveRight(int incrementation) {
		centreX = centreX+ incrementation;
	}
	
	public void moveLeft(int incrementation) {
		centreX = centreX- incrementation;
	}

	
}
