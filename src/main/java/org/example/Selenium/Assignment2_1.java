package org.example.Selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Assignment2_1
{
    public static void main(String[] args) throws InterruptedException {
      Assignment2_1 a1 = new Assignment2_1();
      a1.loginTest();
      a1.tableContent();

    }
        public void tableContent()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/web-table-element.php");
//*[@id="leftcontainer"]/table/thead/tr/th[1]
        List < WebElement> col= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th\n"));
        System.out.println("No.of columns are "+col.size());


        List < WebElement> row= driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]"));
        System.out.println("No.of rows are "+row.size());

        WebElement tableRow = driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
        //String rowtext = tableRow.getText();
        //System.out.println("First row of table : "+rowtext);

        for (int i =1;i<row.size();i++) {
            WebElement companyname = tableRow.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr["+ (i+1)+"]/td"));
            String valueIneed = companyname.getText();
            System.out.println("Company name is : " + valueIneed);
        }
        driver.quit();
    }


    public void loginTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/login.html");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("shreesha302@yahoo.com");
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys("abcd");
        System.out.println("Login success");
        Thread.sleep(3000);
    driver.quit();
    }
}
