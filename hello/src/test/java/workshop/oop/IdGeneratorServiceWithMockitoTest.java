package workshop.oop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
class IdGeneratorServiceWithMockitoTest {

    @Mock
    private Random random;

    @InjectMocks
    IdGeneratorService service;

    @Test
    @DisplayName("ทำการ generate id = Hello 6")
    void case01() {
        // Initial dependency
        when(random.nextInt(anyInt())).thenReturn(6);
//        IdGeneratorService service = new IdGeneratorService();
//        service.setRandom(random);
        String actual = service.process();
        assertEquals("Hello 6", actual);
    }

    @Test
    @DisplayName("ทำการ generate id = Hello 10")
    void case02() {
        // Initial dependency
        when(random.nextInt(10)).thenReturn(10);
//        IdGeneratorService service = new IdGeneratorService();
//        service.setRandom(random);
        String actual = service.process();
        assertEquals("Hello 10", actual);
    }
}