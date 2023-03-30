package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage_Marko {

    public ContactsPage_Marko() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//*[@filter='url(#invertMenuMain-contacts)']")
        public WebElement contactsButton;

    @FindBy(xpath = "//button[@id='new-contact-button']")
    public WebElement newContact;

    @FindBy(id = "contact-fullname")
    public WebElement newContact2;

    @FindBy(xpath = "//input[@inputmode='tel']")
    public WebElement telephone;

    @FindBy(xpath = "//input[@class='property__value']")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"contacts-list\"]/div[1]//div//*[contains(text(), 'Majstor Pero')]")
    public WebElement contactsList;

}
