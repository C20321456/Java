package ex1;

public class Pizza implements Food {
	private String size;
	private String Type;
	
	
	
	public void setType(String type) {
		this.Type = type;
	}
	
	public double calculatePrice() {
		double price=0;
		if (size=="small") {
			price= 100.00;
		}
		
		if (size=="Large") {
			price= 200.00;
		}
		return price;
	}
	
	public void setSize(String size) {
		this.size = size;
	}
	
	
	

}
