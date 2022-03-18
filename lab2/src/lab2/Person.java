package lab2;

public class Person {
	private String firstName;
	private String surName;
	private int age;
	private String address;
	
	
	public Person(String firstName, String surName) {
		
		this.firstName = firstName;
		this.surName = surName;
		
	}
	
	public Person(String new_firstName, String new_surName, int new_age, String new_address) {
		
		if(new_age <= 0) {
			System.out.println("age is invalid");
		}
		else {
			this.age = new_age;
        	this.firstName = new_firstName;
        	this.surName = new_surName;
        	this.address = new_address;
		}
	}
	
	 public String toString()
	    {
	        String string_attributes = firstName + " " + surName + "\n" + age + "\n" + address;
	        return string_attributes;
	    }
	

	public static void main(String args[]) {
		
		Person P1 = new Person("Carl", "Hoston", 26, "south bound street");
		System.out.println(P1.toString());
	}
}