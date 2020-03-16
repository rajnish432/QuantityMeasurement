import com.quantitymeasurement.QuantityMeasurement;
import com.quantitymeasurement.UnitConverter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuantityMeasurementTest {

    QuantityMeasurement quantityMeasurement;

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
        double feetToInches = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.FEET_TO_INCHES);
        Assert.assertNotEquals(1.0,feetToInches);
    }

    @Test
    public void givenInches_WhenCompared_ShouldReturnNotEqual() {
        double inchesToFeet = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.INCH_TO_FEET);
        Assert.assertNotEquals(1.0,inchesToFeet);
    }

    @Test
    public void givenFeet_WhenCompared_ShouldReturnInches() {
        double feetToInches = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.FEET_TO_INCHES);
        Assert.assertEquals(12,feetToInches,0.0);
    }

    @Test
    public void givenInches_WhenCompared_ShouldReturnFeet() {
        double inchesToFeet = quantityMeasurement.globalConverter(12.0, UnitConverter.Converter.INCH_TO_FEET);
        Assert.assertEquals(1,inchesToFeet,0.0);
    }

    @Test
    public void givenFeet_WhenConverted_ShouldReturn_Yard() {
        double feetToYard = Math.ceil(quantityMeasurement.globalConverter(3.0, UnitConverter.Converter.FEET_TO_YARD));
        Assert.assertEquals(1,feetToYard,00);
    }

    @Test
    public void givenOneFeet_WhenComparedWithOneInch_ShouldReturnNotEqual() {
        double oneFeetToOneYard = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.FEET_TO_YARD);
        Assert.assertNotEquals(1.0,oneFeetToOneYard);
    }

    @Test
    public void givenOneInch_WhenComparedWithOneYard_ShouldReturnNotEqual() {
        double inchToYard = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.INCHES_TO_YARD);
        Assert.assertNotEquals(1,inchToYard);
    }

    @Test
    public void givenYard_WhenConverted_ShouldReturn_Inch() {
        double yardToInches = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.YARD_TO_INCHES);
        Assert.assertEquals(36,yardToInches,00);
    }

    @Test
    public void givenInch_WhenConverted_ShouldReturn_Yard() {
        double inchToYard = quantityMeasurement.globalConverter(36.0, UnitConverter.Converter.INCHES_TO_YARD);
        Assert.assertEquals(1,inchToYard,00);
    }

    @Test
    public void givenYard_WhenConverted_ShouldReturn_Feet() {
        double yardToFeet = quantityMeasurement.globalConverter(1.0, UnitConverter.Converter.YARD_TO_FEET);
        Assert.assertEquals(3,yardToFeet,00);
    }

    @Test
    public void givenInch_WhenConverted_ShouldReturn_Centimeter() {
        double inchToCm = quantityMeasurement.globalConverter(2.0, UnitConverter.Converter.INCH_TO_CENTIMETER);
        Assert.assertEquals(5,inchToCm,00);
    }
}