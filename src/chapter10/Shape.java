package chapter10;

public abstract class Shape {
	
	private int height;
	private int width;
	
	public Shape(int width, int height) {
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if(height < 0)
			throw new IllegalArgumentException(
					"Height must be >= 0");
		
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if(width < 0)
			throw new IllegalArgumentException(
					"Width must be >= 0");
		
		
		
		this.width = width;
	}

	public abstract int getArea();
}
