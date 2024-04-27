package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadiocheckboxTest
{
    public static void main(String[] args)
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        driver.findElement(By.xpath(".//input[@id='exp-0']")).click();


        boolean flag = driver.findElement(By.xpath(".//input[@id='profession-0']")).isSelected();
        System.out.println("is checkbox selected"  +flag);
    }
}
