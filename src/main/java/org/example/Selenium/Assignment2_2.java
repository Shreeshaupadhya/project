package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;

public class Assignment2_2
{
    public static void main(String[] args) throws InterruptedException

    {
        Assignment2_2 a1 = new Assignment2_2();
        a1.switchAlert();
        a1.switchFrame();
        a1.switchWindow();

    }

    public void switchAlert() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/delete_customer.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        driver.quit();
    }

    public void switchFrame() throws InterruptedException {
        WebDriver driver =new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");
        driver.findElement(By.xpath("//img[contains(@src,'Jmeter720.png')]")).click();
        Thread.sleep(3000);
        driver.quit();
    }

    public void switchWindow() throws InterruptedException {
    WebDriver driver = new ChromeDriver();
    driver.get("https://demo.guru99.com/popup.php");

    String parentID=driver.getWindowHandle();
    System.out.println(parentID);

    driver.findElement(By.xpath("/html/body/p/a")).click();

    Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows);

        for(String childId:allWindows)
        {
            if(!parentID.equals(childId))//parent id is not equal with child id
            {
                //switching to child window
                driver.switchTo().window(childId);
                //email
                driver.findElement(By.name("emailid")).sendKeys("test@gmail.com");
                driver.findElement(By.name("btnLogin")).click();
            }

        }
        Thread.sleep(3000);
        //come back to parent
        driver.switchTo().window(parentID);
        Thread.sleep(3000);
        driver.quit();
    }
}
