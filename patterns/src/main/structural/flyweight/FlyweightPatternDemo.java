package main.structural.flyweight;

// Client
public class FlyweightPatternDemo {
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        String[] textToRender = {"Hello, World!", "Design Patterns", "Flyweight"};

        for (String text : textToRender) {
            Font font = fontFactory.getFont("Arial-12"); // Key represents the font
            font.setFont("Arial", 12);
            font.render(text);
        }

        // Reuse the same font for a different text
        Font font = fontFactory.getFont("TimesNewRoman-16");
        font.setFont("Times New Roman", 16);
        font.render("Another Text");
    }
}

