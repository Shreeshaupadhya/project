package org.example.Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class KeysAction
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriver.Timeouts timeouts = driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com/");
        WebElement username = driver.findElement(By.id("user-name"));
        username.sendKeys("abcdefghi");
        username.sendKeys(Keys.BACK_SPACE);
        Thread.sleep(3000);
        username.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
        Thread.sleep(3000);
        username.sendKeys("Test123");
        Thread.sleep(3000);
        username.sendKeys(Keys.ARROW_LEFT);
        Thread.sleep(3000);
        username.sendKeys(Keys.BACK_SPACE);
        username.sendKeys("4");
        Thread.sleep(3000);
        username.sendKeys(Keys.TAB);
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("1234555666777");


    }
}
