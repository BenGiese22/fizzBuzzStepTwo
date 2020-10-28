package fizzbuzz;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FizzBuzzTest {
    
    private final String FIZZ_BUZZ_STEP_TWO_EXPECTED = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz ";

    @Test
    public void testFizzBuzzStepTwo() {
        assertEquals(FIZZ_BUZZ_STEP_TWO_EXPECTED, FizzBuzz.fizzBuzzStepTwo());
    }
}