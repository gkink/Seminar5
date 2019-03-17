package seminar5.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() throws Exception {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void oneReturnsOne() {
        assertEquals("1", fizzBuzz.evaluate(1));
    }

    @Test
    public void twoReturnsTwo() {
        assertEquals("2", fizzBuzz.evaluate(2));
    }

    @Test
    public void threeReturnsFizz(){
        assertEquals("fizz", fizzBuzz.evaluate(3));
    }

    @Test
    public void fiveReturnsBuzz(){
        assertEquals("buzz", fizzBuzz.evaluate(5));
    }

    @Test
    public void sixReturnsFizz(){
        assertEquals("fizz", fizzBuzz.evaluate(6));
    }

    @Test
    public void tenReturnsBuzz(){
        assertEquals("buzz", fizzBuzz.evaluate(10));
    }

    @Test
    public void fifteenReturnsFizzBuzz(){
        assertEquals("FizzBuzz", fizzBuzz.evaluate(15));
    }
}