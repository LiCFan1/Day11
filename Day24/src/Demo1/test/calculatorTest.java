package Demo1.test;

import Demo1.calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class calculatorTest {

    @Before
    public void init() {
        System.out.println("---init---");
    }

    @After
    public void close() {
        System.out.println("---close---");
    }

    @Test
    public void testAdd() {
        calculator c = new calculator();
        Assert.assertEquals(3, c.add(1, 2));
    }

    @Test
    public void testDiv() {
        calculator c = new calculator();
        Assert.assertEquals(-1, c.div(1, 2));
    }
}
