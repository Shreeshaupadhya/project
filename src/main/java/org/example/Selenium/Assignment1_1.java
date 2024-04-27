package org.example.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.opera.OperaDriver;

public class Assignment1_1
{




public static void main(String[] args) throws InterruptedException

    {
        Assignment1_1 a1 = new Assignment1_1();
        a1.verifyamazonPage();
        a1.verifyfacebookPage();
        a1.verifyPagetitle();
        a1.firefoxBrowser();
        a1.ieBrowser();
//        a1.safariBrowser();
//        a1.operaBrowser();
        a1.navigationTest();

    }

public void verifyamazonPage()
{
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.amazon.in/");

    String text1 = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span")).getText();

    String expectedtext = "Account & Lists";

    if(expectedtext.equalsIgnoreCase(text1))
        System.out.println("The expected heading is same as actual heading --- "+text1);
    else
        System.out.println("The expected heading doesn't match the actual heading --- "+text1);
driver.quit();
}

public void verifyfacebookPage()
{
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");

    String text2 = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2")).getText();

    String expectedtext1 = "Facebook helps you connect and share with the people in your life.";

    if(expectedtext1.equalsIgnoreCase(text2))
        System.out.println("The expected heading is same as actual heading --- "+text2);
    else
        System.out.println("The expected heading doesn't match the actual heading --- "+text2);
    driver.quit();

}

    public void verifyPagetitle()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.guru99.com/");
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title is -"+ actualTitle);
        String expectedTitle = "Meet Guru99 – Free Training Tutorials & Video for IT Courses";
        //assertEquals(expectedTitle,actualTitle);
        System.out.println("-------------------");
        if(actualTitle.equalsIgnoreCase(expectedTitle))
            System.out.println("Title is Matched");
        else
            System.out.println("Title didn't match");
        driver.quit();
    }

    public void firefoxBrowser()
    {
        WebDriver driver =new FirefoxDriver();
        driver.get("https://www.guru99.com/");
        driver.quit();
    }

//    public void safariBrowser()
//    {
//        WebDriver driver =new SafariDriver();
//        driver.get("https://www.guru99.com/");
//        driver.quit();
//    }
//
//    public void operaBrowser()
//    {
//        Object WebDriverManager = null;
//        WebDriverManager.operadriver().setup();
//        System.setProperty("webdriver.opera.driver", "C:\Users\shree\AppData\Local\Programs\Opera\opera.exe");
//        WebDriver driver =new OperaDriver();
//        driver.get("https://www.guru99.com/");
//        driver.quit();
//    }

    public void ieBrowser()
    {

        WebDriver driver =new EdgeDriver();
        driver.get("https://www.guru99.com/");
        driver.quit();
    }


    public void navigationTest()
    {

        WebDriver driver =new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.amazon.in/");
             //*[@id="nav-cart-count-container"]/span[2]
        driver.findElement(By.xpath("//*[@id='nav-cart-count-container']/span[2]")).click();
        driver.navigate().back();
        driver.navigate().forward();
        driver.quit();
    }
}