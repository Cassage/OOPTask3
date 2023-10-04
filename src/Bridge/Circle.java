package Bridge;

public class Circle extends Shape {

    public Circle(Screen screen) {
        super(screen);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        screen.fillShape();
    }
}
