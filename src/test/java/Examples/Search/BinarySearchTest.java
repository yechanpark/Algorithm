package Examples.Search;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    public void init() {
        this.binarySearch = new BinarySearch();
    }

    @Test
    public void binarySearch1Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 0;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch2Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 2;
        assertEquals(0, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch3Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 5;
        assertEquals(1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch4Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 8;
        assertEquals(2, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch5Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 12;
        assertEquals(3, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch6Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 16;
        assertEquals(4, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch7Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 23;
        assertEquals(5, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch8Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 38;
        assertEquals(6, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch9Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 56;
        assertEquals(7, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch10Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 72;
        assertEquals(8, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch11Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 91;
        assertEquals(9, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch12Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 92;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch13Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 3;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch14Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 9;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch15Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 11;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch16Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 13;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch17Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 20;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch18Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = 30;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch19Test() {
        int[] A = { 2, 5, 8, 12, 16, 23, 38, 56, 72, 91 };
        int target = -1;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch20Test() {
        int[] A = { 1, 2 };
        int target = 3;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch21Test() {
        int[] A = { 1, 2 };
        int target = 0;
        assertEquals(-1, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch22Test() {
        int[] A = { 1, 2 };
        int target = 1;
        assertEquals(0, binarySearch.search(A, target));
    }

    @Test
    public void binarySearch23Test() {
        int[] A = { 1, 2 };
        int target = 2;
        assertEquals(1, binarySearch.search(A, target));
    }

}

