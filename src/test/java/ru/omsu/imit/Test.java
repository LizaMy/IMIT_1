package ru.omsu.imit;

import org.junit.Assert;

import java.util.Arrays;

public class Test {
    @org.junit.Test
    public void testPolynom() throws Exception {
        Polynom polynom = new Polynom(new double[]{1, -2, -3});
        Assert.assertTrue(Arrays.equals(polynom.solve(), new double[]{3, -1}));
    }

    @org.junit.Test(expected = ValueDoesntMatchException.class)
    public void testValueDoesntMatchException() throws Exception {
        Polynom polynom = new Polynom(new double[]{2, 3, 5});
        polynom.solve();
    }
}
