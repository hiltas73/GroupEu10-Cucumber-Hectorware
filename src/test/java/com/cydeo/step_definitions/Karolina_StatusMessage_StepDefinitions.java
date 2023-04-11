package com.cydeo.step_definitions;

import com.cydeo.pages.Karolina_StatusPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Karolina_StatusMessage_StepDefinitions {

    Karolina_StatusPage statusPage = new Karolina_StatusPage();

    @When("user clicks on {string} from the displayed options")
    public void user_clicks_on_from_the_displayed_options(String statusMessage) {
        statusPage.selectMessage(statusMessage);
    }
    @When("user clicks on Set status message")
    public void user_clicks_on_set_status_message() {
        statusPage.setStatusMessageButton.click();
    }
    @Then("message should be set to {string}")
    public void message_should_be_set_to(String expectedMessage) {
        statusPage.userProfileButton.click();
        String actualMessage = statusPage.setStatus.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));

        statusPage.setStatus.click();
        statusPage.clearStatusMessageButton.click();
    }
}
