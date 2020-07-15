package com.measurement.services;

import com.measurement.exception.QuantityMeasurementException;
import com.measurement.utility.UnitType;

public class QuantityMeasurement  {

    public double returnUnit(UnitType type, Double unit) {
        try {
            return unit * type.conversionUnit;
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
