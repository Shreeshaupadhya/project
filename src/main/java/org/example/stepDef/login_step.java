package org.example.stepDef;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_step
{
    WebDriver driver = null;
    
    @Given("open the browser")
    public void open_the_browser()
    {
        driver = new ChromeDriver();
    }
    @Then("go to the saucedemo.com")
    public void go_to_the_saucedemo_com() {
      driver.get("https://www.saucedemo.com/");
    }
    @When("username is <standard_user>")
    public void username_is_standard_user() {
        WebElement ele1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
        ele1.sendKeys("standard_user");
    }
    @When("password is <secret_sauce>")
    public void password_is_secret_sauce() {
        WebElement ele2 = driver.findElement(By.xpath(".//input[@id='password']"));
        ele2.sendKeys("secret_sauce");
    }

    @When("enter {string} and {string} in sauce website login page")
    public void enter_and_in_sauce_website_login_page(String string, String string2) {
        WebElement ele1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
        ele1.sendKeys(string);
        WebElement ele2 = driver.findElement(By.xpath(".//input[@id='password']"));
        ele2.sendKeys(string2);
    }

    @When("^enter (.*) and (.*) in sauce website login page$")
    public void enter_standard_user_and_secret_sauce_in_sauce_website_login_page(String u, String p) {
        WebElement ele1 = driver.findElement(By.xpath(".//input[@id='user-name']"));
        ele1.sendKeys(u);
        WebElement ele2 = driver.findElement(By.xpath(".//input[@id='password']"));
        ele2.sendKeys(p);
    }

    @Then("click on login  button")
    public void click_on_login_button() {
        WebElement ele3 = driver.findElement(By.xpath(".//input[@id='login-button']"));
        ele3.click();




}

    @Then("close the webdriver instance")
    public void closeTheWebdriverInstance() {
        driver.quit();

    }
    }
