package basic.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    private Calc calc;

    @BeforeEach
    void init() {
        calc = new Calc();
    }

    @AfterEach
    void clean() {
        System.out.println("test passed");
    }

    @Test
    void shouldPerformSum() {
        int result = calc.perform(2, 4, Operator.SUM);

        assertEquals(6, result);
    }

    @Test
    void shouldPerformMult() {
        int result = calc.perform(2, 4, Operator.MULTIPLY);

        assertEquals(8, result);
    }

    @Test
    void shouldThrowExceptionWithNullOperator() {
        assertThrows(IllegalArgumentException.class, () -> calc.perform(2, 4, null));
    }
}
