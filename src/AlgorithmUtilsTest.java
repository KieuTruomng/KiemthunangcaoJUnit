import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmUtilsTest {

    @Test
    void testFindMax() {
        // Trường hợp đầu vào không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.findMax(null));
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.findMax(new int[]{}));

        // Trường hợp cơ bản
        assertEquals(5, AlgorithmUtils.findMax(new int[]{5}));
        assertEquals(10, AlgorithmUtils.findMax(new int[]{1, -1, 10, 2}));
        assertEquals(7, AlgorithmUtils.findMax(new int[]{7, 7, 7}));

        // Trường hợp biên bổ sung
        assertEquals(-1, AlgorithmUtils.findMax(new int[]{-5, -10, -1})); // Toàn số âm
        assertEquals(Integer.MAX_VALUE, AlgorithmUtils.findMax(new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE})); // Giá trị lớn nhất/nhỏ nhất
    }

    @Test
    void testFibonacci() {
        // Trường hợp đầu vào không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.fibonacci(-1));

        // Trường hợp cơ bản
        assertEquals(0, AlgorithmUtils.fibonacci(0));
        assertEquals(1, AlgorithmUtils.fibonacci(1));
        assertEquals(1, AlgorithmUtils.fibonacci(2));
        assertEquals(6765, AlgorithmUtils.fibonacci(20)); // Giá trị lớn để kiểm tra hiệu suất

        // Trường hợp biên bổ sung
        assertEquals(832040, AlgorithmUtils.fibonacci(30)); // Giá trị lớn hơn một chút
    }

    @Test
    void testIsPalindrome() {
        // Trường hợp đầu vào không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.isPalindrome(null));

        // Trường hợp cơ bản
        assertTrue(AlgorithmUtils.isPalindrome(""));
        assertTrue(AlgorithmUtils.isPalindrome("a"));
        assertTrue(AlgorithmUtils.isPalindrome("madam"));
        assertFalse(AlgorithmUtils.isPalindrome("hello"));

        // Trường hợp biên bổ sung
        assertTrue(AlgorithmUtils.isPalindrome("abba")); // Chuỗi dài với độ dài chẵn
        assertTrue(AlgorithmUtils.isPalindrome("Aba")); // Không phân biệt hoa thường
        assertTrue(AlgorithmUtils.isPalindrome("A man a plan a canal Panama".replaceAll("\\s+", "").toLowerCase())); // Chuỗi có ký tự đặc biệt/khoảng trắng
    }

    @Test
    void testQuickSort() {
        // Trường hợp đầu vào không hợp lệ
        assertThrows(IllegalArgumentException.class, () -> AlgorithmUtils.quickSort(null, 0, 0));

        // Trường hợp cơ bản
        int[] arr = {};
        AlgorithmUtils
        int[]{}, arr);

        arr = new int[]{5};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{5}, arr);

        arr = new int[]{3, -1, 4, 1, 0};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{-1, 0, 1, 3, 4}, arr);

        arr = new int[]{7, 7, 7};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{7, 7, 7}, arr);

        // Trường hợp biên bổ sung
        arr = new int[]{Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}, arr); // Giá trị lớn nhất và nhỏ nhất

        arr = new int[]{1, 2, 3, 4, 5};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr); // Mảng đã được sắp xếp tăng dần

        arr = new int[]{5, 4, 3, 2, 1};
        AlgorithmUtils.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr); // Mảng đã được sắp xếp giảm dần
    }
}
