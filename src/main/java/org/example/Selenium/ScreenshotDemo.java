package org.example.Selenium;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemo {
    public static void main (String[] args) throws IOException
    {





            WebDriver driver = new ChromeDriver();
            driver.get("https://www.facebook.com");

            TakesScreenshot ts = (TakesScreenshot) driver;
            File temp = ts.getScreenshotAs(OutputType.FILE);
            File dest = new File("C:\\facebook.png");

            FileHandler.copy(temp, dest);

            System.out.println("Done!");



    }
}