
public class Ex2 {
	int a=4;
	int b=5;
	public void add( ) {
		System.out .print(a+b);
	}
	public static void main(String args[]) {
		Ex2 z=new Ex2();
		z.a=5;
		z.b=7;
		Ex2 w=new Ex2();
		w.a=78;
		z.b=99;
		System.out.print("The First sum=");
		z.add();
		System.out.print("\nThe second sum=");
		
		w.add();
	}
}
