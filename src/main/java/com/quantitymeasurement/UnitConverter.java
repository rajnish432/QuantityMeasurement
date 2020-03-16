package com.quantitymeasurement;

public class UnitConverter {
    public enum Converter {
        FEET_TO_INCHES(1*12), INCH_TO_FEET(1/12.0), FEET_TO_YARD(0.33)
        ,YARD_TO_INCHES(36),INCHES_TO_YARD(1/36.0),YARD_TO_FEET(3)
        ,INCH_TO_CENTIMETER(2.5),INCH_TO_INCH(1),CENTIMETER_TO_INCH(1/2.5);

        public final double convertUnit;

         Converter(double convertUnit) {
            this.convertUnit=convertUnit;
        }
    }
}

