public class Square {
    private double width;
    private static int numberOfObjects = 0;

    public Square() {
        this.width = 1;
        numberOfObjects++;
    }

    public Square(double width) {
        this.width = width;
        numberOfObjects++;
    }

    public double getWidth() {
        return this.width;
    }

    public double getArea() {
        return this.width * this.width;
    }

    public double getPerimeter() {
        return 4 * this.width;
    }

    public static int getNumberOfObjects(){
        return numberOfObjects;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * this.width;
    }
}
