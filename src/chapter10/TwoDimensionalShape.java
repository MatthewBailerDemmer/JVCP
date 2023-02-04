package chapter10;

public class TwoDimensionalShape extends Shape {
	
	private int area;
	
	public TwoDimensionalShape(int width, int height) {
		super(width, height);
	}
	
	@Override
	public int getArea() {
		return getWidth() * getHeight();
	}
	
	public String toString() {
		return String.format("Two Dimensional shape with: %n Width: %d   Height: %d   ",getWidth(),
				getHeight());
	}
}
