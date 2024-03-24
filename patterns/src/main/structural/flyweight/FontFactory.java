package main.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

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
