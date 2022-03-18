package lb2;

public class employee {
				String name;
				int age;
				String designation;
				int salary;

				employee(String name, int age, String designation, int salary){
					this.name = name;
					this.age = age;
					this.designation = designation;
					this.salary = salary;
				}
				void empAge(int new_age) {
					age = new_age;
				}

				void setter_setEmpdesignation(String new_design) {
					designation = new_design;
				}

				void getter_getEmpdesignation() {
					System.out.println("Designation" + designation);

				}

				void setter_empSalary(int new_salary) {
					salary = new_salary;
				}
				
				void getter_printemp() {
					System.out.println("name=" + name);
					System.out.println("Designation=" + designation);
					System.out.println("Age=" + age);
					System.out.println("Salary=" + salary);
				}

				public void main(String[] args) {
					int age_val = 28;
					String designation_str = "Banking";
					int salary_val = 25000;
					setter_empSalary(age_val);
					setter_setEmpdesignation(designation_str);
					setter_empSalary(salary_val);
				}
}
