package computer;

import java.util.Scanner;

public class Folder extends DesktopItem implements Group{
	//an int where the size determines the size of the folder
	private int size;
	
	//string that will show what file is in the folder
	private String folder_elements;
	
	//this is a Folder constructor
	public Folder(int new_size, String new_name, String new_folder_contents) {
		this.size = new_size;
		this.name = new_name;
		this.folder_elements = new_folder_contents;
	}
	
	public int getSize() {
		return size;
	}
	
	//This displays the files and the size of the folder
	public void open() {
		System.out.println("Checking folder: \n" + folder_elements+"\n");
		System.out.println("The size of the folder is: "+ size + "\n\n");
	}
	
	//is is taken from the group interface. you enter a name for the file and
	//it adds to the folder then increases then size by 1
	public String add(String item) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter name for file, so it will be added to the folder: ");
		String stringFilename1 = sc.next();
		
		//this adds the new item to the folder
		folder_elements = folder_elements + stringFilename1;
		
		//increases the folder size by 1
		size += 1;
		
		sc.close();
		return item;
	}
}
