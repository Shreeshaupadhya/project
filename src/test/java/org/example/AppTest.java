package org.example;

import junit.framework.Assert;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        System.out.println("Hello World");
        System.out.println("Hi");
        return (Test) new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        Assert.assertTrue( true );
    }
}
