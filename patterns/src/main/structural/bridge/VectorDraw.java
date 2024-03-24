package main.structural.bridge;

// Concrete Implementors
class VectorDraw implements DrawAPI {
    @Override
    public void draw() {
        System.out.println("Drawing in vector format");
    }
}
