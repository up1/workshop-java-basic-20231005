package workshop.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorServiceTest {

    @Test
    @DisplayName("ทำการ generate id = Hello 6")
    void case01() {
        // Initial dependency
        Random random = new Random(){
            @Override
            public int nextInt(int bound) {
                return 6;
            }
        }; // Real
        IdGeneratorService service = new IdGeneratorService();
        service.setRandom(random);
        String actual = service.process();
        assertEquals("Hello 6", actual);
    }
}