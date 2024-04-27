package org.example.Selenium;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindow {

        public static void main(String[] args) throws InterruptedException {

            WebDriver driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            //homepage

String parentId=driver.getWindowHandle();
            System.out.println(parentId);

            //click on Orangehrm link
            driver.findElement(By.linkText("OrangeHRM, Inc")).click();
            //child page

            Set<String> allWindows=driver.getWindowHandles();
            System.out.println(allWindows);

            for(String childId:allWindows)
            {
                if(!parentId.equals(childId))//parent id is not equal with child id
                {
                    //switching to child window
                    driver.switchTo().window(childId);
                    //email
                    driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
                    Thread.sleep(3000);

                }
            }

            //come back to parent
            driver.switchTo().window(parentId);
            driver.findElement(By.name("username")).sendKeys("Admin");
            Thread.sleep(3000);
            driver.quit();


        }

    }

