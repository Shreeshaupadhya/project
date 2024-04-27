package org.example.Selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrameTest
{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");


        //frame with index
        //driver.switchTo().frame(0);

        //frame with id/name
        //driver.switchTo().frame("mce_0_ifr");

        //frame with webElement
        WebElement frameEle=driver.findElement(By.id("mce_0_ifr"));
        driver.switchTo().frame(frameEle);

        WebElement ele=driver.findElement(By.xpath("//p[text()='Your content goes here.']"));

        ele.clear();
        ele.sendKeys("Hello All!");
        Thread.sleep(3000);
        driver.quit();
    }

}
