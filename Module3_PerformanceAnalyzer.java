
import java.util.Random;

public class Module3_PerformanceAnalyzer {

    // ===== Binary Search =====
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // ===== Bubble Sort =====
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // ===== Main Method =====
    public static void main(String[] args) {

        int[] sizes = {100, 500, 1000};
        Random random = new Random();

        System.out.println("Algorithm Performance Analysis");
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-12s %-20s %-20s\n",
                "Input Size", "Binary Search (ns)", "Bubble Sort (ns)");
        System.out.println("-----------------------------------------------------");

        for (int size : sizes) {

            int[] arr = new int[size];

            
            for (int i = 0; i < size; i++) {
                arr[i] = i;
            }

            
            long startSearch = System.nanoTime();
            binarySearch(arr, size - 1);
            long endSearch = System.nanoTime();
            long searchTime = endSearch - startSearch;

            
            for (int i = 0; i < size; i++) {
                arr[i] = random.nextInt(1000);
            }

            
            long startSort = System.nanoTime();
            bubbleSort(arr);
            long endSort = System.nanoTime();
            long sortTime = endSort - startSort;

            
            System.out.printf("%-12d %-20d %-20d\n",
                    size, searchTime, sortTime);
        }

        System.out.println("-----------------------------------------------------");
        System.out.println("Binary Search Time Complexity: O(log n)");
        System.out.println("Bubble Sort Time Complexity: O(n^2)");
    }
}


