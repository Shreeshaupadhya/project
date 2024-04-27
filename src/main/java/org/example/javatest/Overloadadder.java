package org.example.javatest;

public class Overloadadder {
    public void add()
    {
        System.out.println(1+2);
    }

    public void add(int a)
    {
        System.out.println(a);
    }

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }
}
