package org.example.Selenium;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.CTWorksheet;
import org.testng.annotations.*;

import java.io.File;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import static java.sql.Types.NUMERIC;
import static org.mozilla.javascript.Token.STRING;

public class Assignment3_2 {

    @DataProvider(name = "Logindata")
    public Object[][] testData() {

        Object[][] data = {{"Amit","test123"},{"Admin","admin123"},{"Pooja","test123"}};

        return data;
    }


    @Test(dataProvider = "Logindata")
    public void Logindata(String uname, String pwd) {
        System.out.println(uname);
        System.out.println(pwd);

    }


        WebDriver driver;

        @BeforeMethod
        public void setUp ()
        {
            driver = new ChromeDriver();
        }


        @Test(dataProvider = "Logindata")
        public void loginTest (String uname, String pwd) throws InterruptedException {
        System.out.println("UserName: " + uname + " : " + "password: " + pwd);

        driver.get("https://demo.guru99.com/test/login.html");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pwd);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        Thread.sleep(3000);
        driver.quit();
    }

        @AfterMethod
        public void closeBrowser1 ()
        {
            driver.quit();

        }

}



