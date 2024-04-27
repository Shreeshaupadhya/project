package org.example.Selenium;

import io.cucumber.java.eo.Se;
import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;



public class Assignment1_2
{

    public static void main(String[] args) throws InterruptedException {
        Assignment1_2 a1 = new Assignment1_2();
        a1.selectionTest();
        a1.dropdownSelect();
    }
    public void selectionTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");

        WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
        radio1.click();
        System.out.println("Radio button option 1 selected");
        Thread.sleep(3000);

        WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
        radio2.click();
        System.out.println("Radio button option 2 selected");
        Thread.sleep(3000);

        WebElement chk1 = driver.findElement(By.id("vfb-6-0"));
        chk1.click();
        Thread.sleep(3000);

        if (chk1.isSelected()) {
            System.out.println("Checkbox is selected");
        }
            else
            {
                System.out.println("Checkbox is not selected");
            }


        WebElement chk2 = driver.findElement(By.id("vfb-6-1"));
        chk2.click();
        if (chk2.isSelected()) {
            System.out.println("Checkbox is selected");
        }
        else
        {
            System.out.println("Checkbox is not selected");
        }
        Thread.sleep(3000);

        driver.quit();


    }


    public void dropdownSelect() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

        Select dropCountry = new Select(driver.findElement(By.name("country")));
        dropCountry.selectByVisibleText("KUWAIT");
        System.out.println("Selected country Kuwait");
        Thread.sleep(3000);
        driver.quit();
    }
}
