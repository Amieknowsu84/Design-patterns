package main.behavioral.strategy;

import java.util.Arrays;

public class Driver {
    public static void main(String[] args) {
        // Create strategies
        SortingStrategy bubbleSort = new BubbleSortStrategy();
        SortingStrategy mergeSort = new MergeSortStrategy();
        SortingStrategy quickSort = new QuickSortStrategy();

        // Create context with a default strategy
        SortingContext context = new SortingContext(bubbleSort);

        // Perform sorting using the default strategy (bubble sort)
        int[] data = {5, 2, 7, 1, 3};
        context.performSort(data);

        // Change strategy dynamically to merge sort
        context.setStrategy(mergeSort);
        context.performSort(data);

        // Change strategy dynamically to quick sort
        context.setStrategy(quickSort);
        context.performSort(data);

        Arrays.stream(data).forEach(System.out::println);
    }
}

