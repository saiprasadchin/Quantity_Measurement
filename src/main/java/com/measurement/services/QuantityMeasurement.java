package com.measurement.services;

import com.measurement.utility.UnitType;

public class QuantityMeasurement  {

    public double returnUnit(UnitType type, Double unit) {
        return unit * type.conversionUnit;
    }

    public double addition(double inch1, double inch12) {
        return 0;
    }
}
