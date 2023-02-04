package chapter10;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ThreeDimensionalShape cube = new ThreeDimensionalShape(4,4,4,6);
			TwoDimensionalShape square = new TwoDimensionalShape(4,4);
			
			Shape[] shapes = new Shape[2];
			shapes[0] = square;
			shapes[1] = cube;
			int counter = 0;
			
			for(Shape currentShape : shapes) {
				counter++;
				if(currentShape instanceof TwoDimensionalShape) {
					TwoDimensionalShape currentShape1 = 
							(TwoDimensionalShape) currentShape;
					System.out.printf("Shape %d is a %s%n Area: %d%n",
							counter, currentShape1.toString(), currentShape1.getArea());
				}
				if(currentShape instanceof ThreeDimensionalShape) {
					ThreeDimensionalShape currentShape1 = 
							(ThreeDimensionalShape) currentShape;
					System.out.printf("Shape %d is a %s%n Area: %d  Volume: %d%n",
							counter, currentShape1.toString(), currentShape1.getArea(),
							currentShape1.getVolume());
				}
			}
	}

}
