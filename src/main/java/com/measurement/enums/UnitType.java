package com.measurement.enums;

public enum  UnitType {
    FEET(1 * 12.0), INCH(1.0), YARD(1 * 36.0),
    CENTIMETER(1 / 2.5), GALLON(1 * 3.785), LITRE(1.0),
    MILLILITRE(1.0 / 1000),KILOGRAM(1.0), GRAM(1 / 1000.0),
    TONNE(1 * 1000.0), FAHRENHEIT, CELSIUS;

    public double conversionUnit;

    UnitType(){

    }

    UnitType(double conversionUnit) {
        this.conversionUnit = conversionUnit;
    }
}
