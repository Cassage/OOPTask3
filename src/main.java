import Bridge.*;

public class main {
    public static void main(String[] args) {
        Plotter plotter = new Plotter();
        Monitor monitor = new Monitor();
        Printer printer = new Printer();

        Circle circle = new Circle(monitor);
        circle.draw();

        Square square = new Square(printer);
        square.draw();

        Triangle triangle = new Triangle(plotter);
        triangle.draw();
    }
}
