package tutorial;

public class Rectangle {
	private double width;
	private double height;
	/////
	
	public Rectangle(double width1, double height1) {
		this.width=width1;
		this.height=height1;
		
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double area() {
		//return width*height;
		
		double a=width*height;
		return a;
		
		
	}
}
