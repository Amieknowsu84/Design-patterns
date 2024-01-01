package main.structural.adapter;

// Existing Third-Party Library (Adaptee)
public class ThirdPartyShapeLibrary {

    void drawRectangle(int x, int y, int width, int height) {
        System.out.println("Drawing a rectangle at (" + x + "," + y + ") with width " + width + " and height " + height);
    }

}
