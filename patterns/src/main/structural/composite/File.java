package main.structural.composite;

public class File implements FileSystemComponent {
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("File: " + name);
    }
}
