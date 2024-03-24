package main.structural.flyweight;

// Concrete Flyweight
class ConcreteFont implements Font {
    private String name;
    private int size;

    public void setFont(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void render(String text) {
        System.out.println("Rendering text '" + text + "' in font " + name + " with size " + size);
    }
}
