package org.example.Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.List;


public class Assignment3_3 {
//    public static void main(String[] args) throws InterruptedException {
//        Assignment3_3 a3 = new Assignment3_3();
//        a3.initial();
//    }
WebDriver driver;

   @BeforeSuite
    public void initial() throws InterruptedException {
        String baseUrl = "https://demoqa.com/";


        System.out.println("launching Chrome browser");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);



    }

    @Test(groups = {"Smoke"})
    public void first() throws InterruptedException {
        //Thread.sleep(20000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        driver.findElement(By.xpath("//h5[normalize-space()='Forms']")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[normalize-space()='Practice Form']")).click();

    }

    @Test(groups = {"Regression"})
    public void third() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[1]/div[2]/input")).sendKeys("Shrees");
        driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("upa");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"userEmail\"]")).sendKeys("xyz@gmail.com");
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div[2]/form/div[3]/div[2]/div[2]/label")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id=\"userNumber\"]")).sendKeys("9233332222");
        Thread.sleep(1000);

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollBy(0,200)");


        WebElement ele = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        ele.sendKeys("English");
        Thread.sleep(1000);
        WebElement ele1 = driver.findElement(By.id("react-select-2-option-0"));
        ele1.click();

        Thread.sleep(5000);



            WebElement checklist1 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label"));
            checklist1.click();
            WebElement checklist2 = driver.findElement(By.xpath("//*[@id=\"hobbiesWrapper\"]/div[2]/div[3]/label"));
            checklist2.click();
            driver.findElement(By.xpath("//button[@id=\"submit\"]")).click();
            System.out.println("Regression test");


//    @AfterMethod
//    public void close(){
//        System.out.println("Close the application");
//        driver.quit();
//
//    }

    }

}