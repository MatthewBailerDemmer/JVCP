package chapter10;

public class ThreeDimensionalShape extends Shape {

    private int depth;
    private int volume;
    private int nSides;

    public ThreeDimensionalShape(int width, int height, int depth, int nSides) {
        super(width, height);
        this.setDepth(depth);
        this.setNSides(nSides);
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        if(depth < 0)
            throw new IllegalArgumentException(
                    "Depth must be >= 0");
        this.depth = depth;
    }

    public int getNSides() {
        return nSides;
    }

    public void setNSides(int nSides) {
        if(nSides < 0)
            throw new IllegalArgumentException(
                    "Number of Sides must be >= 0");
        this.nSides = nSides;
    }

    @Override
    public int getArea() {
        return getWidth() * getHeight() * this.getNSides() ;
    }

    public int getVolume() {
        return getWidth() * getHeight() * getDepth();
    }

    @Override
    public String toString() {
        return String.format("Three Dimensional Shape %n Width: %d   Height: %d  Depth: %d   ",getWidth(),
                getHeight(), getDepth());
    }

}
