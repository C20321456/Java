 class person {
		String name;
		String address;
		String city;
	
	public	person(String name, String address, String city) {
			this.name = name;
			this.address = address;
			this.city = address;
	}
	public String tostring() {
		return "name: " + name + "\naddress: " + address + "\ncity: " + city;
		
	}
	
	public static void main(String[] args) {
		person p1 = new person("John", "6th boevill", "Cork");
		
		System.out.println(p1.tostring());

	}
}