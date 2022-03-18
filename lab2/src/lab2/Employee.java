package lab2;

public class Employee {
	private String name;
	private int age;
	private String designation;
	private double salary;
	
	public Employee(String new_name) {
		this.name = new_name;
	}
	
	public Employee(String new_name, int new_age, String new_designation, double new_salary) {
		if(new_age <= 0) {
			System.out.println("age is invalid");;
		}
		else {
			this.age = new_age;
        	this.name = new_name;
        	this.designation = new_designation;
        	this.salary = new_salary;
        	
		}
	}
	
	public void Employ_age(int set_age) {
		this.age = set_age;
	}
	
	public int getEmploy_age() {
		return age;
	}
	
	public void Employ_designation(String Set_designation) {
		this.designation = Set_designation;
		
	}

	public String getEmploy_designation() {
		return designation;
	}
	
	public void Employ_salary(double set_salary) {
		this.salary = set_salary;
	}
	
	public double getEmploy_salary() {
		return salary;
	}
	
	public String getName() {
		return name;
	}
	
	public void printEmployee()
	{
		System.out.println(getName());
		System.out.println(getEmploy_age());
		System.out.println(getEmploy_designation());
		System.out.println(getEmploy_salary());
		
	}
	
	
	public static void main(String [] args)
	{
		Employee E1 = new Employee("Josh",35,"Accountant",719000.00);
		E1.printEmployee(); 
	
	}
}
