package com.measurement;

public class QuantityMeasurement {

    public double returnUnit(UnitType type, double unit) {
        return unit * type.conversionUnit;
    }
}
