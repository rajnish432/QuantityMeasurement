package com.quantitymeasurement;

public class UnitConverter {
    public enum Converter {
        INCHES(1*12),FEET(1/12.0);

        public final double convertUnit;

         Converter(double convertUnit) {
            this.convertUnit=convertUnit;
        }
    }
}

