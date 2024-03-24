package main.behavioral.iterator;

// Aggregate interface
interface Aggregate<T> {
    Iterator<T> createIterator();
}
