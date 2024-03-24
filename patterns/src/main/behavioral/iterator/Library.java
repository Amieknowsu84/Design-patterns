package main.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

// Concrete Aggregate
class Library implements Aggregate<String> {
    private final List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(String book) {
        books.add(book);
    }

    @Override
    public Iterator<String> createIterator() {
        return new BookIterator(books);
    }
}
