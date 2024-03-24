package main.behavioral.strategy;

// Concrete Strategies
class BubbleSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        bubbleSort(data);
        System.out.println("Sorting using bubble sort");
    }

    private void bubbleSort(int[] data) {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    // Swap data[j] and data[j + 1]
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }
}
