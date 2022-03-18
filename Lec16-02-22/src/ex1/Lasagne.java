package ex1;

public class Lasagne implements Food{
	private String Type;

	
	public void setType(String type) {
		this.Type = type;
	}
	
	public double calculatePrice() {
		return 60.00;
	}
		
}
