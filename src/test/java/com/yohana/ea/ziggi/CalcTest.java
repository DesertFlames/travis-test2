package com.yohana.ea.ziggi;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Yohana
 *         Date: 1/3/14
 */
public class CalcTest {
    @Test
    public void testName() throws Exception {
        Calc calc = new Calc();
        calc.setI(1);
        calc.setJ(2);


        Assert.assertEquals(calc.calc(),4);

    }
}
