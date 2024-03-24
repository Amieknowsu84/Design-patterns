package main.structural.bridge;

class RasterDraw implements DrawAPI {
    @Override
    public void draw() {
        System.out.println("Drawing in raster format");
    }
}
