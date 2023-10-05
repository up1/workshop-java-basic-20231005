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
}