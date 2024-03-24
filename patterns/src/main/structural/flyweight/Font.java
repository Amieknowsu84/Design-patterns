package main.structural.flyweight;

// Flyweight interface
interface Font {
    void setFont(String name, int size);

    void render(String text);
}
