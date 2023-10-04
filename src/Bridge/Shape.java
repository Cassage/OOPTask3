package Bridge;

public abstract class Shape {
    protected Screen screen;

    public Shape(Screen screen) {
        this.screen = screen;
    }

    public abstract void draw();
}


