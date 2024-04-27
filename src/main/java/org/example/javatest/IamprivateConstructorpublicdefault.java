package org.example.javatest;

public class IamprivateConstructorpublicdefault {

    public void test1()
    {
        System.out.println("i am a public method");
        test2();
    }

    private void test2()
    {
        System.out.println("i am a private method");
    }

    void test3()
    {
        System.out.println("i am a default method");

    }

    IamprivateConstructorpublicdefault()
    {
        System.out.println("i am constructor");
    }
}
