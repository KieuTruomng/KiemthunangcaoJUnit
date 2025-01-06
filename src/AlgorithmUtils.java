import java.util.*;

public class AlgorithmUtils {

    // 1. Thuật toán tìm phần tử lớn nhất trong mảng
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) throw new IllegalArgumentException("Array must not be null or empty");
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    // 2. Tìm số Fibonacci thứ n
    public static int fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // 3. Kiểm tra xem một chuỗi có phải là palindrome hay không
    public static boolean isPalindrome(String str) {
        if (str == null) throw new IllegalArgumentException("String must not be null");
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    // 4. Sắp xếp mảng theo thuật toán QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (arr == null) throw new IllegalArgumentException("Array must not be null");
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}
