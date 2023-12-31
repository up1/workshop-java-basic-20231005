package workshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    @DisplayName("Input 2 => 2")
    void case01() {
        List<Integer> expected = generateData(2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(2);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 4 => 2,2")
    void case02() {
        List<Integer> expected = generateData(2, 2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(4);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 8 => 2,2,2")
    void case03() {
        List<Integer> expected = generateData(2, 2, 2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(8);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 16 => 2,2,2,2")
    void case04() {
        List<Integer> expected = generateData(2, 2, 2, 2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(16);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 32 => 2,2,2,2,2")
    void case05() {
        List<Integer> expected = generateData(2, 2, 2, 2, 2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(32);
        assertEquals(expected, actualResult);
    }

    private List<Integer> generateData(int ... datas) {
        List<Integer> list = new ArrayList<>();
        for (int data : datas) {
            list.add(data);
        }
        return list;
    }
}