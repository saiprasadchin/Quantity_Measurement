package com.measurement.services;

import com.measurement.enums.UnitType;

public interface IQuantityMeasurement {
     double returnUnit(UnitType type, Double unit);
     double returnTemperature(UnitType type, Double unit);
     double addition(double firstValue, double secondValue);
}
