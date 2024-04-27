package org.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation
{
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://www.flipkart.com/");
    Thread.sleep(5000);

    //WebDriver driver1 = new ChromeDriver();
    driver.get("https://www.myntra.com/");
    Thread.sleep(5000);

    driver.get("https://www.amazon.com/");
    Thread.sleep(5000);

    driver.get("https://www.meesho.com/");
    Thread.sleep(5000);

    driver.get("https://www.firstcry.com/");
    Thread.sleep(5000);

//    driver.navigate().to("https://www.myntra.com/");
//    Thread.sleep(5000);
//    driver.navigate().to("https://www.amazon.com/");
//    Thread.sleep(5000);
//    driver.navigate().to("https://www.meesho.com/");


        driver.quit();
//        driver1.quit();
//        driver2.quit();
//        driver3.quit();
//        driver4.quit();


}
}