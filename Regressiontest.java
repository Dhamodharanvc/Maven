package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class RegressionTest {

    @Test
    public void testAddition() {
        SampleApp app = new SampleApp();
        assertEquals(5, app.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        SampleApp app = new SampleApp();
        assertEquals(2, app.subtract(5, 3));
    }
}
