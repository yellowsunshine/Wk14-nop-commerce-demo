package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage extends Utility {

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement buildYourOwnComputerText;

    @FindBy(xpath = "//select[@id='product_attribute_1']")
    WebElement processorDropDown;

    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement ramDropDown;

    @FindBy(xpath = "//input[@id='product_attribute_3_6']")
    WebElement hddRadios320;

    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement hddRadios400;

    @FindBy(xpath = "//label[normalize-space()='Vista Home")
    WebElement osRadioVistaHome;

    @FindBy(xpath = "//label[normalize-space()='Vista Premium")
    WebElement osRadioVistaPremium;

    @FindBy(xpath = "//input[@id='product_attribute_5_10']")
    WebElement softwareCheckBoxesOffice;

    @FindBy(xpath = "//input[@id='product_attribute_5_11']")
    WebElement softwareCheckBoxesReader;

    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement softwareCheckBoxesCommander;

    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton;

    @FindBy(xpath = "//p[@class='content']")
    WebElement productAddedMessage;

    public BuildYourOwnComputerPage() {
        PageFactory.initElements(driver, this);
    }
}
