package lb2;

public class Account {
	private String name;
	private String depositHistory;
	private Double balance;
	/////////////////////////////
	
	public Account(String name, double balance) {
		
		this.setName(name);
		if(balance > 0) {
			this.balance = balance;}
		else
			System.out .print("You entered wrong balance");
	}
	
	public void depositMoney(double newDeposite) {
		balance = balance + newDeposite;
		//balance+=newDeposite
	}
	
	
	public void depositMoney(double newDeposite, String reason) {
		balance = balance + newDeposite;
		//balance+=newDeposite
		depositHistory = depositHistory + "\n" + reason;
		
	}
	
	public double getBalance() {
		return balance;
	}
	
public static void main(String args[]) {
	
	Account A1= new Account("John", 90);
	double d= A1.getBalance();
	A1.sethistory(" top 10");
	System.out.println(d);
	A1.depositMoney(120, "salary");
	double dd=A1.getBalance();
	System.out.println(dd);
	String s= A1.gethis();
	
	System.out.println(s);
}

public void sethistory(String jhist) {
	
	depositHistory = "This is VIP account" + jhist;
}

public String gethis() {
	
	return depositHistory;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
