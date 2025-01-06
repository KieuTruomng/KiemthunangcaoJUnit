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
