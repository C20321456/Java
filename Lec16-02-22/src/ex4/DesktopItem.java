package ex4;

public class DesktopItem {
	private String name;
	private int size;
	
	public DesktopItem(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void open() {
		System.out.print("The item "+ name + "is opened");
	}
	
	public void reName(String newName) {
		name=newName;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}
