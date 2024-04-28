package org.example;

import io.cucumber.java.sl.In;
import org.example.base.ProjectBase1;
import org.example.pages.HomePage;
import org.example.pages.ProjectLoginPage1;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.example.base.TestBase.Inititialization;

public class ProjectLoginTest1 extends ProjectBase1
{
    ProjectLoginPage1 projectLoginPage;

    @BeforeSuite
    public void setUp(){
        Inititialization();
        projectLoginPage = new ProjectLoginPage1();
    }

    //Register - Test Case 1
//    @Test(priority = 0)
//    public void siteRegister() throws InterruptedException {
//        projectLoginPage.RegisterUser();
//    }

    //Signout - Test Case 2
//    @Test(priority = 1)
//    public void signOut() throws InterruptedException{
//        projectLoginPage.SignOut();
//    }

    //Forgot Password - Test Case 3
//    @Test(priority = 2)
//    public void forgotPassword() throws InterruptedException {
//        projectLoginPage.ForgotPass();
//    }


    //Login - Test Case 4
//    @Test(priority = 3)
//    public void siteLogin() throws InterruptedException {
//        projectLoginPage.LoginUser();
//    }

    //Select Men products - Test Case 5
//    @Test(priority = 4)
//    public void selectMenproduct() throws InterruptedException
//    {
//        projectLoginPage.SelectMenproducts();
//    }
//
//    //Delete Cart
//    @Test(priority = 5)
//    public void deleteCartitem() throws InterruptedException
//    {
//        projectLoginPage.DeleteCartitem();
//    }
//
//    //Add to Cart - Test Case 6
//    @Test(priority = 6)
//    public void AddtoProduct() throws InterruptedException
//    {
//        projectLoginPage.AddtoCart();
//    }
//
//    //Verify Cart - Test Case 7
//    @Test(priority = 7)
//    public void CartPage() throws InterruptedException
//    {
//        projectLoginPage.CartPage();
//    }
//
//    //Test Case 8
//    @Test(priority = 8)
//    public void ProceedCheckout() throws InterruptedException
//    {
//        projectLoginPage.ProceedCheckout();
//    }
//
//    //Test Case 9
//    @Test(priority = 9)
//    public void ShippingAddress()throws InterruptedException
//    {
//        projectLoginPage.ShippingAddress();
//    }
//
//    //Test Case 10
//    @Test(priority = 10)
//    public void PlaceOrder() throws InterruptedException
//    {
//        projectLoginPage.PlaceOrder();
//    }
//
//    @Test(priority = 11)
//    public void ContinueShopping() throws InterruptedException
//    {
//        projectLoginPage.ContinueShopping();
//    }

    @Test(priority = 12)
    public void SigninGettitle() throws InterruptedException
    {
        projectLoginPage.SigninGettitle();
    }

    //Quit Browser - Test Case
//    @Test(priority = 11)
//    public void closeBrowser() throws InterruptedException{
//        projectLoginPage.CloseBrowser();
//    }
}
