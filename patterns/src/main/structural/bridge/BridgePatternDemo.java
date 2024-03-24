package main.structural.bridge;

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
