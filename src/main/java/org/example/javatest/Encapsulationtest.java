package org.example.javatest;

public class Encapsulationtest
{

        public static void main(String[] args)
        {
            //registration
            Encapsulationtest1 user1=new Encapsulationtest1();

            user1.setUsername("Pankaj");
            user1.setPassword("pankaj123");
            user1.doLogin(user1.getUsername(),user1.getPassword());



        }

    }


