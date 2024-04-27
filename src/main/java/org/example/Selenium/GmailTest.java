package org.example.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailTest {

        @Test
        public void GmailTest1()
        {
            WebDriver driver = new ChromeDriver();
                    driver.get("https://mail.google.com/mail");
        }
        @Test
        public void GmailTest2()
        {
            WebDriver driver = new ChromeDriver();
            driver.get("https://mail.google.com/mail");
        }


    }

