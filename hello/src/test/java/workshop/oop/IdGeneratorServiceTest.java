package workshop.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class MockRandom extends Random {
    private final int number;

    public MockRandom(int number) {
        this.number = number;
    }
    @Override
    public int nextInt(int bound) {
        return this.number;
    }
}

class IdGeneratorServiceTest {

    @Test
    @DisplayName("ทำการ generate id = Hello 6")
    void case01() {
        // Initial dependency
        Random random = new MockRandom(6); // Mock
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random);
        String actual = service.process();
        assertEquals("Hello 6", actual);
    }

    @Test
    @DisplayName("ทำการ generate id = Hello 10")
    void case02() {
        // Initial dependency
        Random random = new MockRandom(10); // Mock
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random);
        String actual = service.process();
        assertEquals("Hello 10", actual);
    }
}