package main.behavioral.strategy;

class MergeSortStrategy implements SortingStrategy {
    @Override
    public void sort(int[] data) {
        mergeSort(data, 0, data.length - 1);
        System.out.println("Sorting using merge sort");
    }

    private void mergeSort(int[] data, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort first and second halves
            mergeSort(data, left, mid);
            mergeSort(data, mid + 1, right);

            // Merge the sorted halves
            merge(data, left, mid, right);
        }
    }

    private void merge(int[] data, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create temporary arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data to temporary arrays L[] and R[]
        for (int i = 0; i < n1; ++i) {
            L[i] = data[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = data[mid + 1 + j];
        }

        // Merge the temporary arrays
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                data[k] = L[i];
                i++;
            } else {
                data[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            data[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            data[k] = R[j];
            j++;
            k++;
        }
    }
}
