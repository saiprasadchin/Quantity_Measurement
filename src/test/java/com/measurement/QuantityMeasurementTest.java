package com.measurement;

import com.measurement.services.QuantityMeasurement;
import com.measurement.utility.UnitType;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {
    private static QuantityMeasurement quantityMeasurement;
    private double inch1, inch2 ,inch3;

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
    public void givenReferenceForFeet_IfEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenType_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheck_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 3.2);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 3.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }
    //INCH
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
    public void givenNullValueForInch_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnit(UnitType.INCH, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void givenReferenceForInch_IfEqual_ShouldReturnTrue() {
        Assert.assertTrue(quantityMeasurement.equals(quantityMeasurement));
    }

    @Test
    public void givenTypeForInch_IfEqual_ShouldReturnTrue() {
        QuantityMeasurement quantity1 = new QuantityMeasurement();
        QuantityMeasurement quantity2 = new QuantityMeasurement();
        Assert.assertEquals(quantity1, quantity2);
    }

    @Test
    public void givenValueCheckForInch_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 4.2);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1InchAnd1Feet_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given12InchAnd1Feet_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 12.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }
    //YARD
    @Test
    public void given3FeetAnd1Yard_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 3.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1InchAnd1Yard_WhenNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1YardAnd36Inch_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 36.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given36InchAnd1Yard_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 36.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given1YardAnd3Feet_WhenEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.YARD, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.FEET, 3.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }
    //CENTIMETER
    @Test
    public void given0CentimeterAnd0Centimeter_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.CENTIMETER, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.CENTIMETER, 0.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given0CentimeterAnd1Inch_IfNotEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.CENTIMETER, 0.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2, 0.0);
    }

    @Test
    public void givenNullValueForCentimeter_IfEqual_ShouldReturnFalse() {
        try {
            quantityMeasurement.returnUnit(UnitType.CENTIMETER, null);
        } catch (NullPointerException e) {
            Assert.assertEquals(null, e.getMessage());
        }
    }

    @Test
    public void given2InchAnd5Centimeter_IfEqual_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 2.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.CENTIMETER, 5.0);
        Assert.assertEquals(inch1, inch2, 0.0);
    }

    @Test
    public void given2InchAnd2Inch_WhenEqualTo4Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.INCH, 2.0);
        inch2 = quantityMeasurement.addition(inch1, inch1);
        Assert.assertEquals(4.0, inch2, 0.0);
    }

    @Test
    public void given1FeetAnd2Inch_WhenEqualTo14Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.returnUnit(UnitType.INCH, 2.0);
        inch3 = quantityMeasurement.addition(inch1, inch2);
        Assert.assertEquals(14.0, inch3, 0.0);
    }
    @Test
    public void given1FeetAnd1Feet_WhenEqualTo24Inch_ShouldReturnTrue() {
        inch1 = quantityMeasurement.returnUnit(UnitType.FEET, 1.0);
        inch2 = quantityMeasurement.addition(inch1, inch1);
        Assert.assertEquals(24.0, inch2, 0.0);
    }
}
