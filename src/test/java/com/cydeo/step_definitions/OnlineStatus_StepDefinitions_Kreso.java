package com.cydeo.step_definitions;

import com.cydeo.pages.HectorwarePage_Kreso;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class OnlineStatus_StepDefinitions_Kreso {
    LoginPage loginPage=new LoginPage();
    HectorwarePage_Kreso hectorwarePageKreso = new HectorwarePage_Kreso();

    @Given("user is already at the home page of Hectorware app")
    public void user_is_already_at_the_home_page_of_hectorware_app() throws InterruptedException {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
     //   Thread.sleep(3000);
        loginPage.username.sendKeys("Employee1");
     //   Thread.sleep(2000);
        loginPage.password.sendKeys("Employee123");
     //   Thread.sleep(2000);
        loginPage.LoginButton.click();
    }
    @When("user clicks on avatar button")
    public void user_clicks_on_avatar_button() throws InterruptedException {
      //  Thread.sleep(5000);
        hectorwarePageKreso.avatarButton.click();


    }
    @When("user clicks Set status button")
    public void user_clicks_in_dropdown_set_status_button() throws InterruptedException {
      //  Thread.sleep(3000);
        hectorwarePageKreso.setStatusButton.click();

    }
    @Then("user should see online status")
    public void user_should_see_online_status() throws InterruptedException {
      // Thread.sleep(3000);
      String actualOnlineStatus = hectorwarePageKreso.onlineStatus.getText();
      String expectedOnlineStatus = "Online status";

        Assert.assertEquals(expectedOnlineStatus, actualOnlineStatus);


    }
}
