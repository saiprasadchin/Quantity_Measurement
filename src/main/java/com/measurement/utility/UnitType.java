package com.measurement.utility;

public enum  UnitType {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0), CENTIMETER(1 / 2.5);

    public double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
