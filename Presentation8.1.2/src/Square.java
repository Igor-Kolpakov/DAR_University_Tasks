public class Square extends Figure {
    double side;

    public Square(int side) {
        this.side = side;
    }

    public double findPerimeter() {
        return 4 * side;
    }

    public double findArea() {
        return side * side;
    }
}
