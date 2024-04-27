package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTest1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.get("https://www.saucedemo.com/v1/index.html");

        WebElement name = driver.findElement(By.xpath(".//input[@id='user-name']"));
        name.sendKeys("standard_user");
        WebElement password =driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List <WebElement> inventory_Items = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
        int sizeofInventoryItems = inventory_Items.size();
        for (int i=0; i<sizeofInventoryItems;i++)
        {
            System.out.println(inventory_Items.get(i).getText());
        }


        WebElement element = driver.findElement(By.className("inventory_item_name"));
        element.click();
        Thread.sleep(5000);
        driver.navigate().back();
        Thread.sleep(5000);
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(5000);

        driver.findElement(By.xpath(".//*[@id='menu_button_container']/div/div[3]/div/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("logout_sidebar_link")).click();

        driver.navigate().to("https://demoqa.com/");
        Thread.sleep(5000);
        driver.quit();

    }
}
