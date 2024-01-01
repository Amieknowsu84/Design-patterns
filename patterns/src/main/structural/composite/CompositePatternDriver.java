package main.structural.composite;

public class CompositePatternDriver {
    public static void main(String[] args) {
        // Create a directory structure
        Directory root = new Directory("Root");
        Directory documents = new Directory("Documents");
        Directory pictures = new Directory("Pictures");
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");
        File picture1 = new File("picture1.jpg");
        File picture2 = new File("picture2.jpg");

        root.addComponent(documents);
        root.addComponent(pictures);
        documents.addComponent(file1);
        documents.addComponent(file2);
        pictures.addComponent(picture1);
        pictures.addComponent(picture2);

        // Print the entire directory structure
        root.print();
    }
}

