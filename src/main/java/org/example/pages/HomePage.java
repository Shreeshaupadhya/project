package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase
{


        @FindBy(name="firstname")
        WebElement name;

        // Set Lastname
        @FindBy(name="lastname")
        WebElement lastname;

        // Select Gender
        @FindBy(id="sex-0")
        WebElement gender;

        // Select Experience
        @FindBy(id="exp-4")
        WebElement experience;

        // Enter Date
        @FindBy(id="datepicker")
        WebElement date;

        // Select Profession
        @FindBy(id="profession-1")
        WebElement profession;

        // Select Automation Tool
        @FindBy(id="tool-2")
        WebElement automation;

        // Select Continent
        @FindBy(id="continents")
        WebElement dropdown;


        // Select Command
        @FindBy(id="selenium_commands")
        WebElement dropdown1;



        // Click Submit
        @FindBy(id="submit")
        WebElement submit;

        public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage HomePageSubmit()
        {
            //WebDriver driver = new ChromeDriver();
            //driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
            // Set Chrome window size
            //driver.manage().window().setSize(new Dimension(1552, 840));

            name.click();
            name.sendKeys("Test");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollBy(0,250)");

            lastname.click();
            lastname.sendKeys("best");
            js.executeScript("window.scrollBy(0,350)");
            gender.click();

            experience.click();

            date.click();
            date.sendKeys("16-10-2021");

            profession.click();

            automation.click();

            dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

            dropdown1.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

            submit.click();

            return new HomePage();


        }
    }



