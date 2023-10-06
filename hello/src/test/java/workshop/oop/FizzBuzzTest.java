package workshop.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    public void newCase() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("SCB", fizzBuzz.say(7));
    }

    @Test
    public void case01() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.say(1));
    }

    @Test
    public void case02() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.say(2));
    }

    @Test
    public void case03() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.say(3));
        assertEquals("Fizz", fizzBuzz.say(6));
    }

    @Test
    public void case04() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.say(5));
        assertEquals("Buzz", fizzBuzz.say(10));
    }

    @Test
    public void case05() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.say(15));
    }
}