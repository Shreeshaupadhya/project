package org.example.javatest;

public class Encapsulationtest1
{
    //data
    public String username;
    private String password;

    //public method
    public String getUsername()
    {
        return username;
    }
    public void setUsername(String username)
    {
        this.username = username;
    }
    public String getPassword()
    {
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    //Logic
    public void doLogin(String un,String psw)

    {
        System.out.println("Your login with Username "+un+" & Password "+psw);
    }

}
