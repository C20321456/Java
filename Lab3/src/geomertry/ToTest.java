package geomertry;

import java.util.Scanner;

public class ToTest {
	
	public static void main(String args[]) {
		int x, y;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("which shape do you wanna know the area of?\n");
		System.out.print("Circle? Rectangle?\n");
		
		String userinput = input.nextLine();
		
		if(userinput.equals("Circle")) {
			System.out.print("Enter in the Radius: ");
			
		}
	}

}
