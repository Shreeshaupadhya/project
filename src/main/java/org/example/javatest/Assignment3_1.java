package org.example.javatest;

public class Assignment3_1 {
    public static void  main(String[] args) {
        Assignment3 a1 = new Assignment3();
        int yellowhammer = a1.hammer();
        a1.method1();
        System.out.println(a1.count);
        System.out.println(Assignment3.staticcount);
        System.out.println("hammer is "+yellowhammer);

    }
}
