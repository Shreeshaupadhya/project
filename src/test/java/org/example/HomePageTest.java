package org.example;

import org.example.pages.HomePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.example.base.TestBase.Inititialization;
import static org.example.base.TestBase.driver;

public class HomePageTest
{
   
        HomePage homePage;

    @BeforeMethod
    public void setUp(){
        Inititialization();
        homePage = new HomePage();
    }
    
    @Test
    public void homePageform() throws InterruptedException {
        homePage.HomePageSubmit();

    }
    
}
