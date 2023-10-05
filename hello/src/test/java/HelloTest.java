import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    @DisplayName("เรากำลังจะทดสอบเรื่องอะไร ....")
    void case01() {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat");
        assertEquals("Hello, somkiat", result);
    }

    @Test
    @DisplayName("เรากำลังจะทดสอบเรื่องอะไร ....")
    void case02() {
        Hello hello = new Hello();
        String result = hello.sayHi("somkiat2");
        assertEquals("Hello, somkiat2", result);
    }

    @Test
    @DisplayName("เพิ่ม req ใหม่เข้ามา ต้องได้ค่า New req")
    void case03() {
        Hello hello = new Hello();
        String result = hello.sayHi("x");
        assertEquals("New req", result);
    }
}