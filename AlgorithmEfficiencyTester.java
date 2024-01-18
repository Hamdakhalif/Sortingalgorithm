import java.util.Arrays;

public class AlgorithmEfficiencyTester {

    // Bubble Sort Algorithm
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Measure algorithm efficiency
    public static long measureEfficiency(int[] array, Runnable algorithm) {
        long startTime = System.nanoTime();
        algorithm.run();
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        // Generate a random array
        int[] array = {5, 2, 9, 1, 5, 6};

        // Display the original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Measure and display the efficiency of Bubble Sort
        long bubbleSortTime = measureEfficiency(array.clone(), () -> bubbleSort(array));
        System.out.println("Sorted Array: " + Arrays.toString(array));
        System.out.println("Bubble Sort Efficiency: " + bubbleSortTime + " nanoseconds");
    }
}
