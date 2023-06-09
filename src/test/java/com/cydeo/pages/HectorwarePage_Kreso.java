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

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[1]")
    public WebElement onlineButton;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[2]")
    public WebElement awayButton;

    @FindBy(xpath = "//button[@class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement xButton;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[3]")
    public WebElement doNotDisturbButton;

    @FindBy(xpath = "(//div[@class='user-status-online-select'])[4]")
    public WebElement invisibleButton;




}
