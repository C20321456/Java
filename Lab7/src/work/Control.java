package work;

public class Control {

	public static void main(String[] args) {
		//we set the roles and the salary for each of the jobs and we give
		//them a salary and we print them out 
		
		Job Engineer = new Job("Engineer", 3000.00);
		Job Lawyer = new Job("Lawyer", 7000.00);
		Job Doctor = new Job("Doctor", 5000.00);
		Job Carpenter = new Job("Carpenter", 3000.00);
		Job Nurse = new Job("Nurse", 6000.00);
		
		//we the print out the roles and salary line by line
		System.out.print(Engineer.getRole());
		System.out.println(Engineer.getSalary());
		
		System.out.print(Lawyer.getRole());
		System.out.println(Lawyer.getSalary());
		
		System.out.print(Doctor.getRole());
		System.out.println(Doctor.getSalary());
		
		System.out.print(Carpenter.getRole());
		System.out.println(Carpenter.getSalary());
		
		System.out.print(Nurse.getRole());
		System.out.println(Nurse.getSalary());
		
	}

}
