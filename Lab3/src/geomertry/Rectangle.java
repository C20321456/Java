package geomertry;

public class Rectangle extends Shape {
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
		double a=width*height;
		return a;	
	}
	
	public static void main(String [] args)
    {
        Rectangle r1 = new Rectangle(5,10);
        System.out.print("Height= ");
        System.out.println(r1.getHeight());
        System.out.print("Width= ");
        System.out.println(r1.getWidth());
        System.out.print("Area= ");
        System.out.println(r1.area());
    }
}
