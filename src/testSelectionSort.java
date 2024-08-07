import static org.junit.Assert.*;
import org.junit.Test;

public class testSelectionSort {
    @Test
    public void test() {
        testPositive();
        testNegative();
        testMixed();
        testDuplicates();
    }

    public testSelectionSort() {
    }

    @Test
    public void testPositive() {
        int[] arr = {8, 9, 7, 10, 2};
        int[] Sortedarr = {2, 7, 8, 9, 10};
        assertArrayEquals(Sortedarr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testNegative() {
        int[] arr = {-8, -9, -7, -10, -2};
        int[] Sortedarr = {-10, -9, -8, -7, -2};
        assertArrayEquals(Sortedarr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testMixed() {
        int[] arr = {-8, 9, 7, 0, -2};
        int[] Sortedarr = {-8, -2, 0, 7, 9};
        assertArrayEquals(Sortedarr, new SelectionSort().basicSelectionSort(arr));
    }

    @Test
    public void testDuplicates() {
        int[] arr = {8, 8, 7, 7, 2};
        int[] Sortedarr = {2, 7, 7, 8, 8};
        assertArrayEquals(Sortedarr, new SelectionSort().basicSelectionSort(arr));
    }
}
