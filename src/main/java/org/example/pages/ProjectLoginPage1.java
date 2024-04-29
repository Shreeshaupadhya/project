package org.example.pages;

import io.cucumber.java.be.I;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import static org.example.base.ProjectBase1.driver;

public class ProjectLoginPage1 {

    //createaccountlink
    @FindBy(linkText = "Create an Account")
    WebElement createaccountlink;

    //Resgister
    @FindBy(id = "firstname")
    WebElement firstname;

    @FindBy(id = "lastname")
    WebElement lastname;

    @FindBy(id = "email_address")
    WebElement emailaddress;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement confirmpassword;

    @FindBy(xpath = "//button[@class='action submit primary']")
    WebElement createaccountbutton;

    //signinlink
    @FindBy(linkText = "Sign In")
    WebElement signinlink;

    //Login
    @FindBy(id = "email")
    WebElement loginemail;

    @FindBy(id = "pass")
    WebElement loginpassword;

    @FindBy(id="send2")
    WebElement signinbutton;

    @FindBy(xpath = "//button[@class='action login primary']")
    WebElement loginbutton;

    //Logout
    @FindBy(xpath = "//button[@class='action switch']")
    WebElement selectarrowforlogout;
    @FindBy(linkText = "Sign Out")
    WebElement signout;


    //select men option
    @FindBy(linkText = "Men")
    WebElement menoption;
    @FindBy(linkText = "Tops")
            // "//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']/following-sibling::span[text()='Tops']")
    WebElement topsoption;
    @FindBy(linkText = "Jackets")
    WebElement jacket;

    //Forgotpassword
    @FindBy(linkText = "Forgot Your Password?")
    WebElement forgotpassword;
    @FindBy(id="email_address")
    WebElement forgotemail;
    @FindBy(xpath="//button[@class='action submit primary']")
    WebElement resetpass;

    //Search
    @FindBy(id = "search")
    WebElement searchbox;


    //productimage
    @FindBy(xpath = "//img[@class='product-image-photo']")
    WebElement productimage;

    //select size
    @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
    WebElement productsize;
    @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
    WebElement prooductcolor;


    //Addtocart
    @FindBy(id = "product-addtocart-button")
    WebElement addtocart;

    //cartpage
    @FindBy(xpath = "//a[@class='action showcart']")
    WebElement carticon;

    //proceed checkout
    @FindBy(id="top-cart-btn-checkout")
    WebElement proceedtocheckout;

    //add new address
    @FindBy(xpath = "//button[@class='action action-show-popup']")
    WebElement addnewaddress;
    //shipping address
    @FindBy(xpath = "//input[@name='firstname']")
    WebElement shippingfirstname;
    @FindBy(xpath = "//input[@name='lastname']")
    WebElement shippinglastname;
    @FindBy(xpath = "//input[@name='company']")
    WebElement shiipingcompany;
    @FindBy(xpath = "//input[@name='street[0]']")
    WebElement shippingstreet1;
    @FindBy(xpath = "//input[@name='street[1]']")
    WebElement shippingstreet2;
    @FindBy(xpath = "//input[@name='street[2]']")
    WebElement shippingstreet3;
    @FindBy(xpath = "//input[@name='city']")
    WebElement shoppingcity;
    @FindBy(xpath = "//select[@name='region_id']")
    WebElement shoppingstate;

    @FindBy(xpath = "//input[@name='region']")
    WebElement stateenter;
    @FindBy(xpath = "//input[@name='postcode']")
    WebElement shoppingzipcode;
    @FindBy(xpath = "//select[@name='country_id']")
    WebElement shoppingcountry;
    @FindBy(xpath = "//input[@name='telephone']")
    WebElement shoppingphonenumber;
    @FindBy(xpath = "//input[@class='radio']")
    WebElement shoppingmethods;

    @FindBy(xpath = "//button[@class='action primary action-save-address']")
    WebElement saveaddress;
    @FindBy(xpath = "//button[@class='button action continue primary']")
    WebElement shoppingnextbutton;

    @FindBy(xpath = "//button[@class='action primary checkout']")
    WebElement placeorderbutton;

    @FindBy(xpath = "//a[@class='action primary continue']")
    WebElement continueshopping;

    @FindBy(xpath = "//a[@class='action delete']")
    WebElement deletecartitem;

    @FindBy(xpath = "//span[@class='base']")
    WebElement signintitle;

    @FindBy(xpath = "//div[@class='mage-error']")
    WebElement invalidemailerr;

    //addwishlist
    @FindBy(xpath = "//a[@class='action towishlist']")
    WebElement addtowishlist;


    public ProjectLoginPage1() {
        PageFactory.initElements(driver, this);
    }

    public ProjectLoginPage1 RegisterUser() throws InterruptedException {
        createaccountlink.click();
        firstname.sendKeys("Test");
        lastname.sendKeys("abc");
        emailaddress.sendKeys("shreesha302@yahoo.com");
        password.sendKeys("Admin123*");
        confirmpassword.sendKeys("Admin123*");
        createaccountbutton.click();
        Thread.sleep(3000);
        return new ProjectLoginPage1();
    }
    public ProjectLoginPage1 SignOut() throws InterruptedException {
        selectarrowforlogout.click();
        signout.click();
        Thread.sleep(3000);
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 ForgotPass() throws InterruptedException
    {
        Thread.sleep(4000);
        signinlink.click();
        forgotpassword.click();
        forgotemail.sendKeys("shreesha302@yahoo.com");
        resetpass.click();
        return new ProjectLoginPage1();

    }

    public ProjectLoginPage1 LoginUser() throws InterruptedException {
        signinlink.click();
        loginemail.sendKeys("shreesha302@yahoo.com");
        loginpassword.sendKeys("Admin123*");
        signinbutton.click();
        Thread.sleep(3000);
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 SelectMenproducts() throws InterruptedException
    {
        Actions action = new Actions(driver);
        action.moveToElement(menoption).perform();
        action.moveToElement(topsoption).perform();
        action.moveToElement(jacket).click().build().perform();
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 DeleteCartitem() throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Actions action = new Actions(driver);
        action.moveToElement(productimage).click().build().perform();

        //product detail page
        js.executeScript("window.scrollBy(0,300)");
        productsize.click();
        prooductcolor.click();
        addtocart.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,10)");
        carticon.click();
        Thread.sleep(2000);
        deletecartitem.click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 AddtoCart() throws InterruptedException
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Actions action = new Actions(driver);
        action.moveToElement(productimage).click().build().perform();

        //product detail page
        js.executeScript("window.scrollBy(0,300)");
        productsize.click();
        prooductcolor.click();
        addtocart.click();
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,10)");
        return new ProjectLoginPage1();
    }

    public  ProjectLoginPage1 CartPage() throws InterruptedException
    {
        carticon.click();
        Thread.sleep(3000);
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 ProceedCheckout() throws InterruptedException
    {
        proceedtocheckout.click();
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 ShippingAddress() throws InterruptedException
    {

//            JavascriptExecutor js = (JavascriptExecutor) driver;
//            js.executeScript("window.scrollBy(0,300)");
//            addnewaddress.click();
//            shippingfirstname.clear();
//            shippingfirstname.sendKeys("firstname");
//            shippinglastname.clear();
//            shippinglastname.sendKeys("lastname");
//            shiipingcompany.sendKeys("Company");
//            shippingstreet1.sendKeys("streename1");
//            shippingstreet2.sendKeys("streetname2");
//            shippingstreet3.sendKeys("streetname3");
//            shoppingcity.sendKeys("city");
//            stateenter.sendKeys("state");
//
//
////        Select dropdown = new Select(shoppingstate);
////        dropdown.selectByValue("2");
//
//            shoppingzipcode.sendKeys("444333");
//
//            Select dropdown1 = new Select(shoppingcountry);
//            dropdown1.selectByIndex(2);
//
//            shoppingphonenumber.sendKeys("09723847378");
//
//            saveaddress.click();
//            Thread.sleep(2000);
//            shoppingnextbutton.click();



            Thread.sleep(2000);
            shippingfirstname.clear();
            shippingfirstname.sendKeys("firstname");
            shippinglastname.clear();
            shippinglastname.sendKeys("lastname");
            shiipingcompany.sendKeys("Company");
            shippingstreet1.sendKeys("streename1");
            shippingstreet2.sendKeys("streetname2");
            shippingstreet3.sendKeys("streetname3");
            shoppingcity.sendKeys("city");
            //stateenter.sendKeys("state");


            Select dropdown = new Select(shoppingstate);
            dropdown.selectByValue("2");

            shoppingzipcode.sendKeys("444333");

            Select dropdown1 = new Select(shoppingcountry);
            dropdown1.selectByIndex(2);

            shoppingphonenumber.sendKeys("09723847378");
            //shoppingmethods.click();

            Thread.sleep(3000);
            shoppingnextbutton.click();
            Thread.sleep(2000);

        return new ProjectLoginPage1();

    }

    public  ProjectLoginPage1 PlaceOrder() throws InterruptedException
    {
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        placeorderbutton.click();
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 ContinueShopping() throws InterruptedException
    {
        Thread.sleep(2000);
        continueshopping.click();
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 SigninGettitle() throws InterruptedException
    {
        signinlink.click();
        Thread.sleep(2000);
        String exp_title="Customer Login";
        String actual_title=signintitle.getText();
        Assert.assertEquals(actual_title, exp_title);
        return new ProjectLoginPage1();
    }

    public ProjectLoginPage1 InvalidEmailerror() throws InterruptedException
    {
        signinlink.click();
        loginemail.sendKeys("dddd");
        loginpassword.sendKeys("Admin123*");
        loginbutton.click();
        Thread.sleep(2000);
        String exp_err="Please enter a valid email address (Ex: johndoe@domain.com).";
        String actual_err=invalidemailerr.getText();
        Assert.assertEquals(actual_err, exp_err);
        return new ProjectLoginPage1();
    }
    public ProjectLoginPage1 CloseBrowser() throws InterruptedException {
        driver.quit();
        return new ProjectLoginPage1();

    }

}