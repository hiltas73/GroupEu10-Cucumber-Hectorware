package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Igor_LoginPage {

    public Igor_LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//*[@id=\"user\"]")
    public WebElement username;

    @FindBy (xpath = "//*[@id=\"password\"]")
    public WebElement password;

    @FindBy (xpath = "//*[@id=\"submit-form\"]")
    public WebElement LoginBtn;



}
