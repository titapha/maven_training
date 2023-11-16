package fr.lernejo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {

    @Test
    void testAddOperation() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.ADD, 5, 3);
        Assertions.assertEquals(8, result, "5 + 3 should equal 8");
    }

    @Test
    void testMultOperation() {
        Sample sample = new Sample();
        int result = sample.op(Sample.Operation.MULT, 5, 3);
        Assertions.assertEquals(15, result, "5 * 3 should equal 15");
    }

    @Test
    void testFactForZero() {
        Sample sample = new Sample();
        int result = sample.fact(0);
        Assertions.assertEquals(1, result, "fact(0) should equal 1");
    }

    @Test
    void testFactForPositive() {
        Sample sample = new Sample();
        int result = sample.fact(5);
        Assertions.assertEquals(120, result, "fact(5) should equal 120");
    }

    @Test
    void testFactForNegative() {
        Sample sample = new Sample();
        Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(-1), "fact of negative number should throw IllegalArgumentException");
    }
}
