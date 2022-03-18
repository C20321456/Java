package computer;

import java.util.Scanner;

public abstract class DesktopItem {
	protected String name;
	
	
	public String GetName() {
		return name;
	}
	
	public abstract void open();
	
	public String rename(String present_name) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a new name for the file or Folder: ");
		
		String stringVal1 = sc.next();
		
		present_name = stringVal1;
		
		sc.close();
		
		return present_name;
	}

}





