package com.measurement;

public enum  UnitType {
    FEET(1 * 12.0);

    private final double conversionUnit;

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
