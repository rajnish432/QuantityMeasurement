package com.quantitymeasurement;

public class QuantityMeasurement {

    public double convertFeetToInch(Double unit, UnitConverter.Converter type) {
        return unit*type.convertUnit;
    }

    @Override
    public boolean equals(Object unit) {
        if (unit==null)
            return true;
        if (unit==this)
            return true;
        if (unit.equals(this.getClass()))
            return true;
        if (unit.equals(unit))
            return true;
        return false;
    }

    public boolean unitCompare(Object unit1, Object unit2) {
        if (unit1.equals(unit2))
            return true;
        return false;
    }
}

