package org.example.javatest;

public class Assignment3{
//class level variable
    String s = "language";
    int n=3;

    public static int  staticcount=1;
    public int  count=0;



    public static void main (String[]   args)
    {
        //method level variable
        //local variable in main method, we can access with main method
        int n=3;
    String p = "programming";

    for (int i=1; i<=n ; i++)
    {
        // local variable inside loop, outside loop we cant access
        String k = "programming";
        System.out.println("Java is fun " + k);
    }
        System.out.println("-----------------------");

        for (int j=1; j<=n; j++)
    {
        System.out.println("Java is nice " + p);
    }


    }

    public void method1()
    {
        for (int a=1; a<=n; a++)
        {
            System.out.println("Java is good programming " +s);
        }



    }
    public int hammer()
    {
        int noOfHammer = 5;
        System.out.println("number of hammer is" +noOfHammer);
        return(noOfHammer);
    }

    }


