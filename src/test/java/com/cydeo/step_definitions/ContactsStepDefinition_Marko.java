package com.cydeo.step_definitions;

import com.cydeo.pages.ContactsPage_Marko;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.FindBy;

public class ContactsStepDefinition_Marko {

    ContactsPage_Marko contactPage = new ContactsPage_Marko();

    @When("user click on contacts button")
    public void user_click_on_contacts_button() {
        contactPage.contactsButton.click();

    }

    @When("user click on button New contact")
    public void user_click_on_button_new_contact() {
        contactPage.newContact.click();
    }

    @When("user click on new contact on the right side of the interface")
    public void user_click_on_new_contact_on_the_right_side_of_the_interface() {
        contactPage.newContact2.click();
    }

    @When("user put the first and last name in the box")
    public void user_put_the_first_and_last_name_in_the_box() {
        contactPage.newContact2.sendKeys("Majstor Stevo");
        BrowserUtils.sleep(15);
    }

    @When("user enter digit number in phone empty box")
    public void user_enter_digit_number_in_phone_empty_box() {
        contactPage.telephone.sendKeys("+385997323546");

    }

    @When("user enter email address in empty box")
    public void user_enter_email_address_in_empty_box() {
        contactPage.email.sendKeys("majstor.stevo@gmail.com");

    }

    @And("verify that name of the contact")
    public void verifyThatNameOfTheContact() throws InterruptedException {
        BrowserUtils.sleep(15);
        String actualText = contactPage.contactsList.getText();
        String expectedText = "Majstor Pero";
        Assert.assertEquals(actualText, expectedText);
    }
}
