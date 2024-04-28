package org.example.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class ProjectBase1
{
    public static WebDriver driver;



    public static void Inititialization()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

    }


//    public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
//    {
//        TakesScreenshot ts = (TakesScreenshot)driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
//        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
//        FileUtils.copyFile(source, file);
//        return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
//
//
//    }
}
