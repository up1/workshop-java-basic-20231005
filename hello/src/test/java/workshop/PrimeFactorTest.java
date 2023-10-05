package workshop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {

    @Test
    @DisplayName("Input 2 => 2")
    void case01() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(2);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 4 => 2,2")
    void case02() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(4);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 8 => 2,2,2")
    void case03() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(8);
        assertEquals(expected, actualResult);
    }

    @Test
    @DisplayName("Input 16 => 2,2,2,2")
    void case04() {
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(2);
        expected.add(2);
        expected.add(2);
        PrimeFactor p = new PrimeFactor();
        List<Integer> actualResult = p.process(16);
        assertEquals(expected, actualResult);
    }
}