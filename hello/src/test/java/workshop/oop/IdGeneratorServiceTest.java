package workshop.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IdGeneratorServiceTest {

    @Test
    @DisplayName("ทำการ generate id = Hello 6")
    void case01() {
        IdGeneratorService service = new IdGeneratorService();
        String actual = service.process();
        assertEquals("Hello 6", actual);
    }
}