package com.cydeo.step_definitions;

import com.cydeo.pages.Karolina_StatusPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Karolina_OnlineStatus_StepDefinitions {
    Karolina_StatusPage statusPage = new Karolina_StatusPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @When("user clicks on User Profile icon")
    public void user_clicks_on_user_profile_icon() {
        statusPage.userProfileButton.click();
    }
    @When("user clicks on Set status")
    public void user_clicks_on_set_status() {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.elementToBeClickable(statusPage.setStatus));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        statusPage.setStatus.click();
    }
    @Then("user should see following status options are displayed")
    public void user_should_see_following_status_options_are_displayed(List<String> expectedStatusOptions) {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfAllElements(statusPage.allOnlineStatuses));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        List<String> actualStatusOptions = new ArrayList<>();
        for (WebElement onlineStatus : statusPage.allOnlineStatuses) {
            //to get the text of the outer element only
            actualStatusOptions.add(onlineStatus.getText().split("\n")[0]);
        }
        Assert.assertEquals(expectedStatusOptions, actualStatusOptions);
    }
    @When("user clicks on {string} status from the displayed options")
    public void user_clicks_on_status_from_the_displayed_options(String statusOption) {
        statusPage.selectStatusOption(statusOption);
        statusPage.xButton.click();
        statusPage.userProfileButton.click();
    }
    @Then("online status should be set to {string}")
    public void online_status_should_be_set_to(String expectedOnlineStatus) {
        String actualOnlineStatus = statusPage.setStatus.getText();
        Assert.assertEquals(expectedOnlineStatus, actualOnlineStatus);
    }
}
