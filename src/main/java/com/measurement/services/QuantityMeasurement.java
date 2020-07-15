package com.measurement.services;

import com.measurement.exception.QuantityMeasurementException;
import com.measurement.utility.UnitType;

import static com.measurement.utility.UnitType.CELSIUS;

public class QuantityMeasurement  {

    public double returnUnit(UnitType type, Double unit) {
        try {
            return unit * type.conversionUnit;
        }catch (NullPointerException e){
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    public Double returnTemperature(UnitType type, Double unit) {
        Double fahrenheit = unit;
        if (type.equals(CELSIUS)) {
            fahrenheit = (unit * (9.0 / 5)) + 32;
        }
        return fahrenheit;
    }

    /**
     *
     * @param firstValue
     * @param secondValue
     * @return total value of the addition
     */
    public double addition(double firstValue, double secondValue) {
        return firstValue + secondValue;
    }
}
