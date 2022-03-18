package work;

//using Scanner Class reading entire File
//without using loop

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor{

	public String FileName;
	File user;
	
	public FileProcessor(String new_fileName) {
		this.FileName = new_fileName;
	}
	
	public void openFile() throws FileNotFoundException{
		File user = new File(FileName);
	}
	
	public boolean compare(String passedRoles) {
		boolean roleMatched = false;
		String currentLine = "";
		
		Scanner sc = new Scanner(FileName);
		
		while(sc.hasNextLine()) {
			currentLine = sc.nextLine();
			
			if(currentLine.equals(passedRoles)) {
				System.out.println("Roles Matched");
				
				roleMatched = true;
			}
			
		}
		
		sc.close();
		
		System.out.println(roleMatched);
		return roleMatched;
	}
	
	public String getFileName() {
		return FileName;
	}

	public void setFileName(String fileName) {
		this.FileName = fileName;
	}
	
}
