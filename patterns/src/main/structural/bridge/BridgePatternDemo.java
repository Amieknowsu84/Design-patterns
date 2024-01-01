package main.structural.bridge;

// Abstraction
abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}

// Concrete Abstraction
class Circle extends Shape {
    private int radius;

    public Circle(int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle with radius " + radius);
        drawAPI.draw();
    }
}

class Square extends Shape {
    private int side;

    public Square(int side, DrawAPI drawAPI) {
        super(drawAPI);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Square with side " + side);
        drawAPI.draw();
    }
}

// Implementor
interface DrawAPI {
    void draw();
}

// Concrete Implementors
class VectorDraw implements DrawAPI {
    @Override
    public void draw() {
        System.out.println("Drawing in vector format");
    }
}

class RasterDraw implements DrawAPI {
    @Override
    public void draw() {
        System.out.println("Drawing in raster format");
    }
}

// Client Code
public class BridgePatternDemo {
    public static void main(String[] args) {
        DrawAPI vectorDraw = new VectorDraw();
        DrawAPI rasterDraw = new RasterDraw();

        Shape circle = new Circle(5, vectorDraw);
        Shape square = new Square(4, rasterDraw);

        circle.draw();
        square.draw();
    }
}
