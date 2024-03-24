package main.behavioral.command;

// Concrete Receiver
class TextEditor implements Editor {
    private final StringBuilder buffer = new StringBuilder();

    @Override
    public void type(String text) {
        buffer.append(text);
    }

    @Override
    public void copy() {
        // Simulate copying text to clipboard
        System.out.println("Copying text to clipboard: " + buffer);
    }

    @Override
    public void cut() {
        // Simulate cutting text from buffer
        System.out.println("Cutting text from buffer: " + buffer);
        buffer.setLength(0); // Clear buffer after cutting
    }

    @Override
    public void paste() {
        // Simulate pasting text from clipboard to buffer
        System.out.println("Pasting text from clipboard");
        // In a real application, paste would retrieve text from clipboard and append it to buffer
    }
}
