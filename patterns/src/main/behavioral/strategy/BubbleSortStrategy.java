package main.behavioral.strategy;

// Concrete Strategies
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        // Implement bubble sort algorithm
        System.out.println("Sorting using bubble sort");
    }
}
