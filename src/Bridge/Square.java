package Bridge;

public class Square extends Shape {

    public Square(Screen screen) {
        super(screen);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
        screen.fillShape();
    }
}
