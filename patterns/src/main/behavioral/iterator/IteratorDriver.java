package main.behavioral.iterator;

public class IteratorDriver {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Book 1");
        library.addBook("Book 2");
        library.addBook("Book 3");

        Iterator<String> iterator = library.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

