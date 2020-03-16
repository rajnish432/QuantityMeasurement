package com.quantitymeasurement;

public class UnitConverter {
    public enum Converter {
        FEET_TO_INCHES(1*12), INCH_TO_FEET(1/12.0), FEET_TO_YARD(0.33)
        ,YARD_TO_INCHES(36),INCHES_TO_YARD(1/36.0),YARD_TO_FEET(3)
        ,INCH_TO_CENTIMETER(2.5),CENTIMETER_TO_INCH(1/2.5),NULL(1)
        ,GALLONS_TO_LITRES(3.78),LITRES_TO_ML(1000),ML_TO_LITRES(1/1000.0)
        ,KG_TO_GRAMS(1000),TONNE_TO_KG(1000),GRAMS_TO_KG(1/1000.0);

        public final double convertUnit;

         Converter(double convertUnit) {
            this.convertUnit=convertUnit;
        }
    }
}

