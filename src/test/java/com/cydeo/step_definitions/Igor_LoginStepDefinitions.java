package com.cydeo.step_definitions;

import com.cydeo.pages.Igor_LoginPage;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Igor_LoginStepDefinitions {

    Igor_LoginPage igorLoginPage = new Igor_LoginPage();


    @Given("Navigate to URL")
    public void navigate_to_url() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("Enter valid username in username field")
    public void enter_valid_username_in_username_field() {
        igorLoginPage.username.sendKeys("Employee212");
    }

    @When("Enter valid password in password field")
    public void enter_valid_password_in_password_field() {
        igorLoginPage.password.sendKeys("Employee123");
    }
    @When("Click on login button")
    public void click_on_login_button() {
        igorLoginPage.LoginBtn.click();

    }
    @Then("Verify the dashboard main page")
    public void verify_the_dashboard_main_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Files - Hectorware - QA";
        Assert.assertEquals(expectedTitle,actualTitle);


    }


}
