public class AreaCalculator {

    public double areaOfRectangle(double length, double width) {
        return length * width;
    }

    public double areaOfSquare(double length) {
        return areaOfRectangle(length, length);
    }

    public double areaOfTriangle(double width, double height) {
        return width * height / 2;
    }

}
