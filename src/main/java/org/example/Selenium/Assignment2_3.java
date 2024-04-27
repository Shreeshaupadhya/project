package org.example.Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class Assignment2_3
{

    public static void main(String[] args) throws IOException {
        Assignment2_3 a1 = new Assignment2_3();
        a1.dragDrop();
    }
    public void dragDrop() throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement From=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

        Actions act=new Actions(driver);

        act.dragAndDropBy(From,167, 167).build().perform();

        TakesScreenshot ts=(TakesScreenshot) driver;
        File temp=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./"+"\\Screenshots\\screen.png");

        FileHandler.copy(temp, dest);

        System.out.println("Done!");

    }
}
