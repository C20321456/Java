package computer;

import java.util.Scanner;

public class TextFile extends DesktopItem{
	private String contents;
	
	public TextFile(String new_name, String new_elements) {
		this.name = new_name;
		this.contents = new_elements;
		
	}
	
	//takes the contents of the current value and adds input into it
	public String add(String present_elements) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter text into the file: ");
		
		String stringVal1 = sc.next();
		
		//takes the input and adds it into the current elements
		present_elements = present_elements + stringVal1;
		
		sc.close();
		
		return present_elements;
	}
	
	//displays the contents inside of the folder when the folder is opened
	public void open() {
		System.out.println("File is being opened: \n" + contents + "\n");
	}
}
