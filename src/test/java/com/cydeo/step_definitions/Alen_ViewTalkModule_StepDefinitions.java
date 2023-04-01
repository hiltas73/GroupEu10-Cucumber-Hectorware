package com.cydeo.step_definitions;

import com.cydeo.pages.Alen_TalkPage;
import com.cydeo.pages.LoginHalimPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Alen_ViewTalkModule_StepDefinitions {


    Alen_TalkPage alenTalkPage = new Alen_TalkPage();

    LoginHalimPage loginHalimPage = new LoginHalimPage();

    @Given("user navigates to the url")
    public void user_navigates_to_the_url() {

        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginHalimPage.login(ConfigurationReader.getProperty("username"),ConfigurationReader.getProperty("password"));


    }

    @When("user click Talk button")
    public void user_click_talk_button() {
        alenTalkPage.TalkModule.click();

    }
    @Then("user should see conversation list on the left side of the page")
    public void user_should_see_conversation_list_on_the_left_side_of_the_page() {

        Assert.assertTrue(alenTalkPage.ConversationList.isDisplayed());

    }

}
