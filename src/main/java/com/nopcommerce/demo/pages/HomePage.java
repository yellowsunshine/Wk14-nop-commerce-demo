package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//li")
    WebElement allMenu;

    @FindBy(xpath = "//a[normalize-space()='Log in']")
    WebElement loginLink;

    @FindBy(xpath = "//a[normalize-space()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//img[@alt='nopCommerce demo store']")
    WebElement nopcommerceLogo;

    @FindBy(xpath = "")
    WebElement myAccountLink;

    @FindBy(xpath = "")
    WebElement logOutLink;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnLogInLink(){
        pmClickOnElement(loginLink);
    }
}
