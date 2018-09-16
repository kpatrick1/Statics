package us.kpatrick.test;

import org.junit.Assert;
import us.kpatrick.Person;

public class PersonTest {
    Person p;

    @org.junit.Before
    public void setUp() throws Exception {
        p = new Person("Kevin","Patrick",32);
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void isAwake() {
        Assert.assertTrue(p.isAwake());
    }

    @org.junit.Test
    public void testtoString() {
        Assert.assertEquals("Kevin Patrick is 32 year(s) old!", p.toString());

    }
}