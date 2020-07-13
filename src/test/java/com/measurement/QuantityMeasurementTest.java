package com.measurement;

import com.measurement.services.QuantityMeasurement;
import com.measurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;
    private double inch1, inch2;

    @Before
    public void setUp() {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void given0FeetAnd0Feet_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        Assert.assertEquals(inch1, inch2,0.0);
    }

    @Test
    public void given0FeetAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(inch1, inch2,0.0);
    }

    @Test
    public void givenNullValueForFeet_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnit(UnitType.FEET, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenValueCheck_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 2.2);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 2.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd0Inch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0InchAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 12.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }
}
