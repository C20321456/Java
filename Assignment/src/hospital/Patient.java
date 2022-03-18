package hospital;

//Assignment 1
//Name: Mykolas Kubilius
//Date: 08/02/2022
//Description this is a Java code that is made to represent a patient in a hospital
//6 attributes in total
//2 Constructors in total
//toString() is used to convert the attributes into a string data type, as some data types have an int value


//a class with the 6 attributes
public class Patient {
	private String firstname;
	private String surname;
	private int age;
	private String address;
	private int patient_ID;
	private String illness;
	
	//Constructor 1, patient name
	public Patient(String firstname, String surname) {
		
		this.firstname = firstname;
		this.surname = surname;
	}

	//Constructor 2, patient's other information
	public Patient(String firstname, String surname,int age, String address, int patient_ID, String illness) {
		
		if(age <= 0) {
			System.out.println("The age must be above 0");
		}
		else {
			this.firstname = firstname;
			this.surname = surname;
			this.age = age;
			this.address = address;
			this.patient_ID = patient_ID;
			this.illness = illness;
		}
	}
		
	// toString() takes the attributes in the class and converts into a string data type, regardless of previous data type
	public String toString() {
		String string_attributes = "Name: " + firstname + " " + surname + "\n" + "Age: " + age + "\nPaient Address: " + address + "\nID: " + patient_ID + "\nCase: " + illness;
		return string_attributes;
	}
	
	//This is the main body of the code, we add the patients details and print them out.
	public static void main(String args[]) {
		Patient patientDetails = new Patient("Jessi", "Blake", 48, "Hillton ally", 33987, "Covid-19");
		System.out.println(patientDetails.toString());
		System.out.println(patientDetails);
	}
}
