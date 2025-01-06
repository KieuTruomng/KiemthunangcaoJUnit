# Kiểm thử AlgorithmUtils với JUnit

Repository này chứa ví dụ về kiểm thử các thuật toán thông dụng bằng JUnit. Các thuật toán bao gồm tìm phần tử lớn nhất trong mảng, tính số Fibonacci, kiểm tra chuỗi palindrome, và sắp xếp mảng bằng thuật toán QuickSort.

## Mục lục
- [Giới thiệu thuật toán](#giới-thiệu-thuật-toán)
- [Yêu cầu](#yêu-cầu)
- [Hướng dẫn cài đặt](#hướng-dẫn-cài-đặt)
- [Các trường hợp kiểm thử](#các-trường-hợp-kiểm-thử)
- [Chạy kiểm thử](#chạy-kiểm-thử)

## Giới thiệu thuật toán
Lớp `AlgorithmUtils` cung cấp các phương thức sau:

1. **Tìm phần tử lớn nhất**
   ```java
   public static int findMax(int[] arr)
   ```
   Tìm phần tử lớn nhất trong một mảng số nguyên.

2. **Dãy Fibonacci**
   ```java
   public static int fibonacci(int n)
   ```
   Tính số Fibonacci thứ `n`.

3. **Kiểm tra Palindrome**
   ```java
   public static boolean isPalindrome(String str)
   ```
   Kiểm tra xem một chuỗi có phải là palindrome hay không.

4. **Thuật toán QuickSort**
   ```java
   public static void quickSort(int[] arr, int low, int high)
   ```
   Sắp xếp mảng số nguyên bằng thuật toán QuickSort.

## Yêu cầu
- Bộ phát triển Java (JDK) 11 hoặc mới hơn
- [JUnit 5](https://junit.org/junit5/)
- Một IDE hoặc công cụ build như IntelliJ IDEA, Eclipse, Maven/Gradle

## Hướng dẫn cài đặt
1. Clone repository:
   ```bash
   git clone https://github.com/your-repo/algorithm-utils-junit.git
   cd algorithm-utils-junit
   ```
2. Mở dự án trong IDE bạn sử dụng.
3. Đảm bảo JUnit 5 đã được thêm vào dependencies của dự án.
   Nếu sử dụng Maven, thêm đoạn sau vào `pom.xml`:
   ```xml
   <dependency>
       <groupId>org.junit.jupiter</groupId>
       <artifactId>junit-jupiter</artifactId>
       <version>5.9.2</version>
       <scope>test</scope>
   </dependency>
   ```

## Các trường hợp kiểm thử
Các trường hợp kiểm thử đã được triển khai trong `AlgorithmUtilsTest`:

### **1. `findMax`**
- Xử lý mảng null hoặc rỗng (ném ngoại lệ).
- Kiểm thử với mảng chỉ có một phần tử.
- Kiểm thử với giá trị dương, âm, và 0.
- Kiểm thử với các giá trị trùng lặp.

### **2. `fibonacci`**
- Xử lý đầu vào âm (ném ngoại lệ).
- Kiểm thử các giá trị biên (ví dụ: `n = 0`, `n = 1`).
- Kiểm thử tính toán đệ quy với giá trị lớn.

### **3. `isPalindrome`**
- Xử lý chuỗi null (ném ngoại lệ).
- Kiểm thử với chuỗi rỗng và chuỗi một ký tự.
- Kiểm thử với chuỗi palindrome và không phải palindrome.
- Kiểm thử phân biệt chữ hoa, chữ thường.

### **4. `quickSort`**
- Xử lý mảng null (ném ngoại lệ).
- Kiểm thử với mảng đã sắp xếp.
- Kiểm thử với các giá trị trùng lặp.
- Kiểm thử với số dương, âm, và 0.

## Chạy kiểm thử
### 1. Mở terminal trong thư mục dự án.
### 2. Chạy các kiểm thử bằng công cụ build của bạn:

   **Với Maven:**
   ```bash
   mvn test
   ```

   **Với Gradle:**
   ```bash
   ./gradlew test
   ```

   **Từ IDE:**
   - Nhấp chuột phải vào lớp `AlgorithmUtilsTest` và chọn "Run Tests".

3. Kết quả sẽ hiển thị trên console hoặc báo cáo kiểm thử.

## Đóng góp
Hãy gửi các vấn đề hoặc pull request nếu bạn muốn cải thiện hoặc thêm tính năng mới.

## Giấy phép
Dự án này được cấp phép theo MIT License. Xem tệp `LICENSE` để biết thêm chi tiết.

## Mô tả code
### 1. **AlgorithmUtils.java**
```java
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
```
### 2. **AlgorithmUtilsTest.java**

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmUtilsTest {

    @Test
    void testFindMax() {
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.findMax(new int[]{}));
        assertEquals(5, AlgorithmUtils.findMax(new int[]{5}));
        assertEquals(10, AlgorithmUtils.findMax(new int[]{1, -1, 10, 2}));
        assertEquals(7, AlgorithmUtils.findMax(new int[]{7, 7, 7}));
    }

    @Test
    void testFibonacci() {
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.fibonacci(-1));
        assertEquals(0, AlgorithmUtils.fibonacci(0));
        assertEquals(1, AlgorithmUtils.fibonacci(1));
        assertEquals(1, AlgorithmUtils.fibonacci(2));
        assertEquals(6765, AlgorithmUtils.fibonacci(20)); // Giá trị lớn để kiểm tra hiệu suất
    }

    @Test
    void testIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.isPalindrome(null));
        assertTrue(AlgorithmUtils.isPalindrome(""));
        assertTrue(AlgorithmUtils.isPalindrome("a"));
        assertTrue(AlgorithmUtils.isPalindrome("madam"));
        assertFalse(AlgorithmUtils.isPalindrome("hello"));
    }

    @Test
    void testQuickSort() {
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.quickSort(null, 0, 0));
        int[] arr = {};
        AlgorithmUtils.quickSort(arr, 0, 0);
        assertArrayEquals(new int[]{}, arr);

        arr = new int[]{5};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{5}, arr);

        arr = new int[]{3, -1, 4, 1, 0};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-1, 0, 1, 3, 4}, arr);

        arr = new int[]{7, 7, 7};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{7, 7, 7}, arr);
    }
}
```
## Hình ảnh kết quả
![image](https://github.com/user-attachments/assets/923d3247-e9e9-4450-a854-b9b897954541)
## Link chia sẻ ChatGPT
https://chatgpt.com/share/677b57ee-a32c-8003-a142-0daf8de1289f


