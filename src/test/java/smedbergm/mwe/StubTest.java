package smedbergm.mwe;

import org.scalatestplus.testng.TestNGSuite;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class StubTest extends TestNGSuite {
    private int foo;

    @BeforeClass
    public void setUp() {
        foo = 17;
    }

    @Test
    public void succeeds() {
        Assert.assertEquals(foo, 17);
    }

    @Test
    public void fails() {
        Assert.assertEquals(foo, 31);
    }
}
