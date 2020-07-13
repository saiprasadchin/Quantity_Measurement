package com.measurement;

import java.util.HashMap;

public class QuantityMeasurement {

    public double returnUnit(UnitType type, Double unit) {
        return unit * type.conversionUnit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this )
            return true;
        if (this.getClass() == obj.getClass())
            return true;
        return super.equals(obj);
    }

}
