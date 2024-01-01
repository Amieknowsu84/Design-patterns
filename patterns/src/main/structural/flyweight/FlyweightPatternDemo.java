package main.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight interface
interface Font {
    void setFont(String name, int size);
    void render(String text);
}

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

// Flyweight Factory
class FontFactory {
    private Map<String, Font> fonts = new HashMap<>();

    public Font getFont(String key) {
        Font font = fonts.get(key);

        if (font == null) {
            font = new ConcreteFont();
            fonts.put(key, font);
        }

        return font;
    }
}

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

