package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    RegisterPage registerPage;

    @BeforeMethod
    public void inIt(){
        homePage = new HomePage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
    }

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessFully(){
        homePage.clickOnRegisterLink();
        registerPage.gettextRegistertext();
        registerPage.verifyRegisterText();

    }

    @Test
    public void verifyThatFirstNameLastNameEmailAndPasswordAndConfirmPasswordFieldsAreMandatory(){

    //Click on Register Link
        homePage.clickOnRegisterLink();
    //Click on "REGISTER" button
        registerPage.clickOnRegisterButton();
    //Verify the error message "First name is required."
        registerPage.verifyTheErrorMessageFirstNameIsRequired();
    //Verify the error message "Last name is required."
        registerPage.verifyTheErrorMessageLastNameIsRequired();
    //Verify the error message "Email is required."
        registerPage.verifyTheErrorMessageEmailIsRequired();
    //Verify the error message "Password is required."
        registerPage.verifyTheErrorMessagePasswordIsRequired();
    //Verify the error message "Password is required."
        registerPage.verifyTheErrorMessageForConfirmPasswordIsRequired();
    }

    @Test
    public void VerifyThatUserShouldCreateAccountSuccessfully() {
        homePage.clickOnRegisterLink();
        registerPage.selectGender("Female");
        registerPage.enterFirstName("Prime");
        registerPage.enterLastName("Testing");
        registerPage.selectBirthDay("2");
        registerPage.selectBirthMonth("4");
        registerPage.selectBirthYear("1983");
        registerPage.enterEmail("prime@gmail.com");
        registerPage.enterPassword("Prime123");
        registerPage.enterConfirmPassword("Prime123");
        registerPage.clickOnRegisterButton();
        registerPage.verifyRegistrationComplete("Register");

    }



}
