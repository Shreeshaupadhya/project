package org.example.Selenium;

import groovyjarjarpicocli.CommandLine;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.path.json.JsonPath.*;
import io.restassured.response.Response;

public class RestAssure
{

    @Test
    public void test1()
    {
    Response response = get("https://reqres.in/api/users");
        System.out.println(response.getStatusCode());
        System.out.println(response.getTime());
    }
}
