package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Assignment3_1
{
    WebDriver driver;

    @BeforeSuite
        public void setUp()
        {
            driver = new ChromeDriver();
        }

    @BeforeTest
    public void openURL()
    {
        driver.get("https://demo.guru99.com/test/login.html");
    }


    @Test
    public void loginTest() throws InterruptedException {
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("shreesha302@yahoo.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("12345");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        Thread.sleep(3000);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.quit();
    }
}
