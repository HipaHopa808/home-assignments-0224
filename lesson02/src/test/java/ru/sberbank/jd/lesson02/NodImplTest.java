package ru.sberbank.jd.lesson02;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NodImplTest {
    private NodImpl testObj;

    @Before
    public void setUp() {
        testObj = new NodImpl();
    }
    @Test
    public void testCalculateAllZero() {
        ArithmeticException thrown = Assert.assertThrows(
                ArithmeticException.class,
                () -> testObj.calculate(0,0)
        );
        Assert.assertEquals(thrown.getMessage(),"На ноль делить нельзя!");
    }
    @Test
    public void testCalculateOneZero() {
        Assert.assertEquals(30,testObj.calculate(30,0));
        Assert.assertEquals(21,testObj.calculate(0,21));

    }
    @Test
    public void testCalculatePositive() {
        Assert.assertEquals(30,testObj.calculate(30,60));
        Assert.assertEquals(30,testObj.calculate(60,30));

    }
    @Test
    public void testCalculateNegative() {
        Assert.assertEquals(30,testObj.calculate(-30,-60));
        Assert.assertEquals(30,testObj.calculate(60,-30));
        Assert.assertEquals(30,testObj.calculate(30,-60));

    }
    }
