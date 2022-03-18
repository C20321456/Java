package ex3;

public class Control {
	
	public static void main(String[] args) {
		Circle C1= new Circle(5,20,30);
		System.out.println(C1.calculatedArea());
		C1.printNewPosition();
		C1.moveRight();
		C1.moveUp();
		C1.printNewPosition();
		C1.moveRight();
		C1.moveUp();
		C1.printNewPosition();
		System.out.println(C1 instanceof ex3.Circle);
		System.out.println(C1 instanceof ex3.Shape);
		System.out.println(C1 instanceof ex3.Moveable);
	}

}
