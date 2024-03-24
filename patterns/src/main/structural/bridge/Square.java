package main.structural.bridge;

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
