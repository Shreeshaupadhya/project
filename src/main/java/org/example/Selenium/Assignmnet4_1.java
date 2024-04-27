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

public class Assignmnet4_1 {

    WebDriver driver;

    @DataProvider(name = "Logindata")
    public Object[][] getData()
    {
        Object [][]arr=ExcelUtil.getSheetData("Login");
 		return arr;
    }



    @Test(dataProvider = "Logindata")
    public void Logindata(String uname, String pwd) {
        System.out.println(uname);
        System.out.println(pwd);

    }

    @Test(dataProvider = "Logindata")
    public void loginTest (String uname, String pwd) throws InterruptedException {
        System.out.println("UserName: " + uname + " : " + "password: " + pwd);
        driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/login.html");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys(uname);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys(pwd);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        Thread.sleep(3000);
        driver.quit();
    }

}





