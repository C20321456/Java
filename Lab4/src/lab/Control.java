package lab;

import java.util.Scanner;

/*
 * the control prints out the new coordinates of circle, and rectangle positions
 */

public class Control {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		//Circle constructor, double radius, double centreX, double centreY 
		Circle C1= new Circle(5,20,30);
		System.out.println(C1.calculatedArea());
		//this line prints out the information for Circle
		System.out.println("-----Position for Circle-----");
		System.out.println("The Radius for Circle: " + C1.getRadius());
		System.out.println("The area for Circle: " + C1.calculatedArea());
		
		
		C1.printNewPosition();
		
		System.out.println("Enter in a int value for moving up:");
		int incrementation_value = sc.nextInt();
		C1.moveUp(incrementation_value);
		
		System.out.println("Enter in a int value for moving Right:");
		int incrementation_value1 = sc.nextInt();
		C1.moveRight(incrementation_value1);
		
		C1.printNewPosition();
		
		
		//Rectangle constructor, double width, double height, double centreX, double centreY
		Rectangle R1= new Rectangle(5,20,40,50);
		//This line prints out the information that Rectangle contains
		System.out.println("\n-----Positions for Rectangle------\n ");
		System.out.println("The height for Rectangle: " + R1.getHeight());
		System.out.println("The width for Rectangle: " + R1.getWidth());
		System.out.println("The area for Rectangle: " + R1.calculatedArea());
		
		R1.printNewPosition();
		

		System.out.println("Enter in a int value for moving up: ");
		int incrementation_value11 = sc.nextInt();
		R1.moveUp(incrementation_value11);
		
		System.out.println("Enter in a int value for moving Right: ");
		int incrementation_value111 = sc.nextInt();
		R1.moveRight(incrementation_value111);
		
		R1.printNewPosition();
	
		
		System.out.println("\n\nThis is the instance of each classes: \n");
		
		System.out.println(C1 instanceof lab.Circle);
		System.out.println(C1 instanceof lab.Shape);
		System.out.println(C1 instanceof lab.Moveable);
		
		System.out.println(R1 instanceof lab.Rectangle);
		System.out.println(R1 instanceof lab.Shape);
		System.out.println(R1 instanceof lab.Moveable);
	}
}
