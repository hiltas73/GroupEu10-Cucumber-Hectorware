package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginHalimPage {

    public LoginHalimPage() {
        PageFactory.initElements(Driver.getDriver(),this);    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement LoginButton;

    public void login (String username, String password){

        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.LoginButton.click();

    }

}
