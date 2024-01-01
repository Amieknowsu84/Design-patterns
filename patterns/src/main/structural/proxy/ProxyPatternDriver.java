package main.structural.proxy;

public class ProxyPatternDriver {

    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Image1 will be loaded and displayed when needed
        image1.display();

        // Image2 will be loaded and displayed when needed
        image2.display();

        // Image1 will be displayed again without reloading
        image1.display();
    }

}
