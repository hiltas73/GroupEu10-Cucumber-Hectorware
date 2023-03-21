package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HectorwarePage_Kreso {

    public HectorwarePage_Kreso() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='settings']")
    public WebElement avatarButton;

    @FindBy(xpath = "//a[@class='user-status-menu-item__toggle']")
    public WebElement setStatusButton;

    @FindBy(xpath = "//input[@id='user']")
    public WebElement userNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='submit-form']")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[@class='set-status-modal__header'])[1]")
    public WebElement onlineStatus;



}
