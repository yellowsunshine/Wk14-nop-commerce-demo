package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage extends Utility {

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']")
    WebElement computersText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Desktops']")
    WebElement desktopsLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Notebooks']")
    WebElement noteBooksLink;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[normalize-space()='Software']")
    WebElement softwareLink;

    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }


}
