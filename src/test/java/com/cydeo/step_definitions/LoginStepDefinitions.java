package com.cydeo.step_definitions;

import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();


    @Given("user navigates to the URL")
    public void user_navigates_to_the_url() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));

    }
    @When("user enters valid username")
    public void user_enters_valid_username() {
    loginPage.username.sendKeys("Employee1");


    }
    @When("user enters valid password")
    public void user_enters_valid_password() {
        loginPage.password.sendKeys("Employee123");

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
    loginPage.LoginButton.click();
    }
    @Then("any user should verify the home page")
    public void any_user_should_verify_the_home_page() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle ="Files - Hectorware - QA";

        Assert.assertEquals(expectedTitle,actualTitle);
        System.out.println(actualTitle);
    }
}
