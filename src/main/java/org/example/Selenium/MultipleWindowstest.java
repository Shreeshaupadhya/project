package org.example.Selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultipleWindowstest
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.flipkart.com/account/login?signup=true");

        String parentId = driver.getWindowHandle();
        System.out.println(parentId);

        driver.findElement(By.linkText("Terms of Use")).click();
        driver.findElement(By.linkText("Privacy Policy")).click();


        Set <String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for (String childId:allWindows)
        {
            if (!parentId.equals (childId))
            {
                driver.switchTo().window(childId);
                Thread.sleep(3000);
            }

            }
        driver.switchTo().window(parentId);

            Thread.sleep(3000);

    }

}


