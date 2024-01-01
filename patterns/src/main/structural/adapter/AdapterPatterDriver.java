package main.structural.adapter;

public class AdapterPatterDriver {
    // Client Code
    public static void main(String[] args) {
        // Using the new ShapeDrawer interface with the adapted ThirdPartyShapeLibrary
        ShapeDrawer shapeDrawer = new ShapeLibraryAdapter(new ThirdPartyShapeLibrary());
        shapeDrawer.drawShape(10, 20, 30, 40);
    }
}
