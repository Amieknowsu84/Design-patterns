package main.structural.adapter;

// Adapter class to adapt the ThirdPartyShapeLibrary to ShapeDrawer
class ShapeLibraryAdapter implements ShapeDrawer {
    private ThirdPartyShapeLibrary thirdPartyLibrary;

    public ShapeLibraryAdapter(ThirdPartyShapeLibrary thirdPartyLibrary) {
        this.thirdPartyLibrary = thirdPartyLibrary;
    }

    public void drawShape(int x, int y, int width, int height) {
        // Adapt the call to the third-party library's method
        thirdPartyLibrary.drawRectangle(x, y, width, height);
    }
}
