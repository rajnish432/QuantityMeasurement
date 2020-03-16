import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.UnitConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.quantitymeasurement.UnitConverter.Converter.*;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;
    double a[];

    @Before
    public void setUp() throws Exception {
        quantityMeasurement = new QuantityMeasurement();
    }

    @Test
    public void givenZeroFeet_whenCompared_ShouldReturnEqual() {
        Integer feet1 = 0;
        Integer feet2 = 0;
        boolean nullCheck = quantityMeasurement.unitCompare(feet1, feet2);
        Assert.assertTrue(nullCheck);
    }

    @Test
    public void givenFeetValue_WhenCompared_ShouldReturnInches() {
        Integer feet = null;
        boolean nullCheck = quantityMeasurement.equals(feet);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenFeetObject_WhenComparedWithReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenFeetObject_WhenComparedWithClass_ShouldReturnTrue() {
        QuantityMeasurement classObject = new QuantityMeasurement();
        Class quantityMeasurement = classObject.getClass();
        boolean classEquals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, classEquals);
    }

    @Test
    public void givenFeetObject_WhenCheckWithEquals_ShouldReturnTrue() {
        String name = "Avatar";
        boolean equalityCheck = quantityMeasurement.equals(name);
        Assert.assertEquals(true, equalityCheck);
    }

    @Test
    public void GivenZeroInch_WhenCompared_ShouldReturnEqual() {
        Integer inch1 = 0;
        Integer inch2 = 0;
        boolean inchValue = quantityMeasurement.unitCompare(inch1, inch2);
        Assert.assertEquals(true, inchValue);
    }

    @Test
    public void givenInchObject_WhenNUll_ShouldReturnTrue() {
        Integer inches = null;
        boolean nullCheck = quantityMeasurement.equals(inches);
        Assert.assertEquals(true, nullCheck);
    }

    @Test
    public void givenInchObject_WhenComparedWithReference_ShouldReturnTrue() {
        QuantityMeasurement quantityMeasurement = new QuantityMeasurement();
        QuantityMeasurement quantityMeasurement1 = new QuantityMeasurement();
        Assert.assertEquals(quantityMeasurement, quantityMeasurement1);
    }

    @Test
    public void givenInchObject_WhenComparedWithClass_ShouldReturnTrue() {
        QuantityMeasurement classObject = new QuantityMeasurement();
        Class quantityMeasurement = classObject.getClass();
        boolean classEquals = quantityMeasurement.equals(quantityMeasurement);
        Assert.assertEquals(true, classEquals);
    }

    @Test
    public void givenInchObject_WhenCheckWithEquals_ShouldReturnTrue() {
        String name = "Rajnish";
        boolean equalityCheck = quantityMeasurement.equals(name);
        Assert.assertEquals(true, equalityCheck);
    }

    @Test
    public void givenFeetandInches_WhenCompared_ShouldReturnEqual() {
        Integer feet=0;
        Integer inch=0;
        boolean valueCheck = quantityMeasurement.unitCompare(feet, inch);
        Assert.assertEquals(true,valueCheck);
    }

    @Test
    public void givenFeet_WhenCompared_ShouldReturnNotEqual() {
        double a[]={1.0};
        double feetToInches = quantityMeasurement.globalConverter(a, FEET_TO_INCHES);
        Assert.assertNotEquals(1.0,feetToInches);
    }

    @Test
    public void givenInches_WhenCompared_ShouldReturnNotEqual() {
        double a[]={1.0};
        double inchesToFeet = quantityMeasurement.globalConverter(a, UnitConverter.Converter.INCH_TO_FEET);
        Assert.assertNotEquals(1.0,inchesToFeet);
    }

    @Test
    public void givenFeet_WhenCompared_ShouldReturnInches() {
        double a[]={1.0};
        double feetToInches = quantityMeasurement.globalConverter(a, FEET_TO_INCHES);
        Assert.assertEquals(12,feetToInches,0.0);
    }

    @Test
    public void givenInches_WhenCompared_ShouldReturnFeet() {
        double a[]={12.0};
        double inchesToFeet = quantityMeasurement.globalConverter(a, UnitConverter.Converter.INCH_TO_FEET);
        Assert.assertEquals(1,inchesToFeet,0.0);
    }

    @Test
    public void givenFeet_WhenConverted_ShouldReturn_Yard() {
        double a[]={3.0};
        double feetToYard = Math.ceil(quantityMeasurement.globalConverter(a, UnitConverter.Converter.FEET_TO_YARD));
        Assert.assertEquals(1,feetToYard,00);
    }

    @Test
    public void givenOneFeet_WhenComparedWithOneInch_ShouldReturnNotEqual() {
        double a[]={1.0};
        double oneFeetToOneYard = quantityMeasurement.globalConverter(a, UnitConverter.Converter.FEET_TO_YARD);
        Assert.assertNotEquals(1.0,oneFeetToOneYard);
    }

    @Test
    public void givenOneInch_WhenComparedWithOneYard_ShouldReturnNotEqual() {
        double a[]={1.0};
        double inchToYard = quantityMeasurement.globalConverter(a, UnitConverter.Converter.INCHES_TO_YARD);
        Assert.assertNotEquals(1,inchToYard);
    }

    @Test
    public void givenYard_WhenConverted_ShouldReturn_Inch() {
        double a[]={1.0};
        double yardToInches = quantityMeasurement.globalConverter(a, UnitConverter.Converter.YARD_TO_INCHES);
        Assert.assertEquals(36,yardToInches,00);
    }

    @Test
    public void givenInch_WhenConverted_ShouldReturn_Yard() {
        double a[]={36.0};
        double inchToYard = quantityMeasurement.globalConverter(a, UnitConverter.Converter.INCHES_TO_YARD);
        Assert.assertEquals(1,inchToYard,00);
    }

    @Test
    public void givenYard_WhenConverted_ShouldReturn_Feet() {
        double a[]={1.0};
        double yardToFeet = quantityMeasurement.globalConverter(a, UnitConverter.Converter.YARD_TO_FEET);
        Assert.assertEquals(3,yardToFeet,00);
    }

    @Test
    public void givenInch_WhenConverted_ShouldReturn_Centimeter() {
        double a[]={2.0};
        double inchToCm = quantityMeasurement.globalConverter(a, UnitConverter.Converter.INCH_TO_CENTIMETER);
        Assert.assertEquals(5,inchToCm,00);
    }

    @Test
    public void givenToSeparateUnits_WhenConverted_ShouldReturn_Inches() {
        double a[]={2,2};
        double additionOfUnits = quantityMeasurement.globalConverter(a, NULL, NULL);
        Assert.assertEquals(4,additionOfUnits,00);
    }

    @Test
    public void givenToSeparateUnitsAsFtAndInch_WhenConverted_ShouldReturn_Inches() {
        double a[]={1,2};
        double additionOfUnits = quantityMeasurement.globalConverter(a,FEET_TO_INCHES, NULL);
        Assert.assertEquals(14,additionOfUnits,00);

    }

    @Test
    public void givenToSeparateUnitsAsFtAndFt_WhenConverted_ShouldReturn_Inches() {
        double a[]={1,1};
        double additionOfUnits = quantityMeasurement.globalConverter(a,FEET_TO_INCHES,FEET_TO_INCHES);
        Assert.assertEquals(24,additionOfUnits,00);
    }

    @Test
    public void givenToSeparateUnitsAsInchAndCm_WhenConverted_ShouldReturn_Inches() {
        double a[]={2,2.5};
        double additionOfUnits = quantityMeasurement.globalConverter(a,NULL,CENTIMETER_TO_INCH);
        Assert.assertEquals(3,additionOfUnits,00);
    }

    @Test
    public void givenGallon_WhenConverted_ShouldReturn_Litres() {
        double a[] = {1};
        double gallonToLitres = quantityMeasurement.globalConverter(a, GALLONS_TO_LITRES);
        Assert.assertEquals(3.78, gallonToLitres, 00);
    }

    @Test
    public void givenLitre_WhenConverted_ShouldReturn_Ml() {
        double a[] = {1};
        double litreToMl = quantityMeasurement.globalConverter(a,LITRES_TO_ML);
        Assert.assertEquals(1000, litreToMl, 00);
    }

    @Test
    public void givenToSeparateUnitsAsGallonsAndLitres_WhenConverted_ShouldReturn_Litres() {
        double a[] = {1,3.78};
        double additionOfUnits = quantityMeasurement.globalConverter(a,GALLONS_TO_LITRES,NULL);
        Assert.assertEquals(7.56, additionOfUnits, 00);
    }

    @Test
    public void givenToSeparateUnitsAsLitreAndMl_WhenConverted_ShouldReturn_Litres() {
        double a[] = {1,1000};
        double additionOfUnits = quantityMeasurement.globalConverter(a,NULL,ML_TO_LITRES);
        Assert.assertEquals(2.0, additionOfUnits, 00);
    }

    @Test
    public void givenKiloGram_WhenConverted_ShouldReturn_Ml() {
        double a[] = {1};
        double kgToGrams = quantityMeasurement.globalConverter(a,KG_TO_GRAMS);
        Assert.assertEquals(1000, kgToGrams, 00);
    }

    @Test
    public void givenTonne_WhenConverted_ShouldReturn_Kg() {
        double a[] = {1};
        double tonneToKg = quantityMeasurement.globalConverter(a,TONNE_TO_KG);
        Assert.assertEquals(1000, tonneToKg, 00);
    }

    @Test
    public void givenToSeparateUnitsAsTonneAndGram_WhenConverted_ShouldReturn_Kilogram() {
        double a[] = {1,1000};
        double additionOfUnits = quantityMeasurement.globalConverter(a,TONNE_TO_KG,GRAMS_TO_KG);
        Assert.assertEquals(1001, additionOfUnits, 00);
    }
}