package se.jensen.eazy;

import org.junit.Assert;
import org.junit.Test;
import se.jensen.eazy.inteface.Multiply;

public class MultiplyTest {
    @Test
    public void testMultiplication() {
        Integer result = new Multiply().execute(10,5);
        Assert.assertEquals(Integer.valueOf(50),result);
    }
}
