package work;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Job{
	
	//attributes
	private String role;
	private Double salary;
	
	//constructor
	public Job(String new_role, Double new_salary) {
		this.setSalary(new_salary);
	}
	
	FileProcessor rolesFile = new FileProcessor("roles.txt");
	
	//getters
	public String getRole() {
		return role;
	}

	//setters
	public void setRole(String role) throws FileNotFoundException {
		
		rolesFile.openFile();
		
		if(rolesFile.compare(this.role) == true)
		{
			this.role = role;
			System.out.println("matched Role.");
		}
		
		//Else, the role isn't accepted because it can't find the role
		else
		{
			System.out.println("role isnt in the file.");
		}
	}
	

	//Salary getters
	public Double getSalary() {
		return salary;
	}

	//Salary setters
	public void setSalary(Double salary) {
		this.salary = salary;
	}

	
	
	

}
