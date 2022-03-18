package com.files.oo;

public class Control {

	public static void main(String[] args) {
		
		FileProcessor fileProcessor = new FileProcessor("Example.txt");
		fileProcessor.openFile();
		String line = fileProcessor.readLines();
		
	}

}
