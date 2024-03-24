package main.behavioral.iterator;

import java.util.List;
import java.util.NoSuchElementException;

// Concrete Iterator
class BookIterator implements Iterator<String> {
    private final List<String> books;
    private int position;

    public BookIterator(List<String> books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return books.get(position++);
    }
}
