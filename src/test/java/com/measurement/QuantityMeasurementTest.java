package com.measurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityMeasurementTest {

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        double inch1 = quantityMeasurement.returnUnit(12.0, 0.0);
        double inch2 = quantityMeasurement.returnUnit(12.0, 0.0);
        Assert.assertEquals(inch1,inch2,0.0);
    }
}
