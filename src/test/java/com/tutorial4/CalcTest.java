package com.tutorial4;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    void testAddition() {
        Calc c = new Calc();
        assertEquals(4, c.add(2,2));
    }
    @Test
    void testSubtraction() {
        Calc c = new Calc();
        assertEquals(0, c.subtract(2,2));
    }
}
