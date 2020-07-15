package com.measurement.utility;

public enum  UnitType {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0),
    CENTIMETER(1 / 2.5), GALLON(1 * 3.785), LITRE(1.0);

    public double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
