import java.util.*;
//this is my first class I get some values from users
//

/*this is a lined out comment
 * we can set is using so
 * 
 */
public class Ex3 {
	private float a;
	private float b;

	public static void main(String[] args) {
		Ex3 e=new Ex3();
		
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);	
	System.out.print("Enter your first number=");
	e.a=sc.nextInt();
	System.out.print("Enter your second number=");
	e.b=sc.nextInt();
	float z=e.a+e.b;
	System.out.print("the total ="+z);

	}

}
