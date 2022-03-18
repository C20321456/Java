package lab;
/*
* moveUp adds a -10 to the Y value
* moveDown adds a +10 to the Y value
* moveLeft adds a -10 to the X value
* moveRight adds a +10 to the Y value
*/

public interface Moveable {
	public void moveUp(int incrementation);
	public void moveDown(int incrementation);
	public void moveLeft(int incrementation);
	public void moveRight(int incrementation);

}
