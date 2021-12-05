package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage extends Utility {

    @FindBy(xpath = "//input[@id='Email']")
    WebElement emailText;

    @FindBy(xpath = "//input[@id='Password']")
    WebElement passwordText;

    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement logInButton;

    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welComeText;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyWelcomeMessage(){
        Reporter.log("verifying the welcome message : " + welComeText.toString() + "<br>");
    String expectedMessage = "Welcome, Please Sign In!";
    String actualMessage = pmGetTextFromElement(welComeText);
        Assert.assertEquals("Welcome, Please Sign In!",actualMessage,"wrong page");

    //pmVerifyElements(welComeText,"Welcome, Please Sign In!","wrong page");
}

    public void enterEmail(String email){
        Reporter.log("Entering the email : " + email.toString() + "<br>");
        pmSendTextToElement(emailText,email);
    }

    public void enterPassword(String password){
        Reporter.log("Entering the password : " + password.toString() + "<br>");
        pmSendTextToElement(passwordText,password);

    }

    public void clickOnLoginButton(){
        Reporter.log("Clicking the login button : " + logInButton.toString() + "<br>");
        pmClickOnElement(logInButton);
    }


}
