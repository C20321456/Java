package com.files.oo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileProcessor {

	// attributes
	String fileName;
	File myFile;
	
	// constructor
	public FileProcessor(String fileName) {
		this.fileName = fileName;
	}
	
	// other methods/behaviours
	public void openFile() {
		myFile = new File(fileName);
				
	}
	
	public String readLine() {
		
		String line = "";
		try {
			Scanner myScanner = new Scanner(myFile);
			line = myScanner.nextLine();
		
		} catch (FileNotFoundException errorObject) {
			e.printStackTrace();
			System.out.println("Error found" + e.getMessage());
		}
		
		return line;
	}

	public String readLines() {
		return fileName;
		
	}
	
	// getter and setters

}
