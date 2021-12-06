package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessFully(){
        homePage.clickOnLogInLink();
        loginPage.verifyWelcomeMessage();
    }

    @Test
    public void verifyTheErrorMessageWithInValidCredentials(){
        homePage.clickOnLogInLink();
        loginPage.enterEmail("prime@gmail.com");
        loginPage.enterPassword("prime123");
        loginPage.clickOnLoginButton();
        loginPage.verifyErrorMessage();
    }

    @Test
    public void verifyThatUserShouldLogInSuccessFullyWithValidCredentials(){
        homePage.clickOnLogInLink();
        loginPage.enterEmail("tiapatel@gmail.com");
        loginPage.enterPassword("TiaPatel0512");
        loginPage.clickOnLoginButton();
        loginPage.verifyLogOutOption();
    }

    @Test
    public void VerifyThatUserShouldLogOutSuccessFully(){
        verifyThatUserShouldLogInSuccessFullyWithValidCredentials();
        //homePage.clickOnLogInLink();
        //loginPage.enterEmail("tiapatel@gmail.com");
        //loginPage.enterPassword("TiaPatel0512");
        //loginPage.clickOnLoginButton();
        loginPage.clickOnLogOutButton();
        loginPage.verifyLoginOption();
    }










}
