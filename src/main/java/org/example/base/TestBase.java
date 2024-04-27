package org.example.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase
{
    public static WebDriver driver;



    public static void Inititialization()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    }



}

