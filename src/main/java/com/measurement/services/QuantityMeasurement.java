package com.measurement.services;

import com.measurement.exception.QuantityMeasurementException;
import com.measurement.enums.UnitType;


import static com.measurement.enums.UnitType.CELSIUS;

public class QuantityMeasurement implements IQuantityMeasurement {

    @Override
    public double returnUnit(UnitType type, Double unit) {
        try {
            return unit * type.conversionUnit;
        } catch (NullPointerException e){
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
    }

    @Override
    public double returnTemperature(UnitType type, Double unit) {
        try {
            Double fahrenheit = unit;
            if (type.equals(CELSIUS)) {
                fahrenheit = (unit * (9.0 / 5)) + 32;
            }
            return fahrenheit;
        } catch (NullPointerException e){
            throw new QuantityMeasurementException("Null value", QuantityMeasurementException.ExceptionType.NULL_VALUE);
        }
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

    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (this.getClass() == object.getClass())
            return true;
        return super.equals(object);
    }
}
