package Bridge;

public class Triangle extends Shape {

    public Triangle(Screen screen) {
        super(screen);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        screen.fillShape();
    }
}
