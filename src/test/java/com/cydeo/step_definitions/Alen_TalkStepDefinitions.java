package com.cydeo.step_definitions;

import com.cydeo.pages.Alen_TalkPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Alen_TalkStepDefinitions {

    Alen_TalkPage alenTalkPage = new Alen_TalkPage();

    @Given("User navigates to the URL")
    public void user_navigates_to_the_url() {
        Driver.getDriver().get("https://qa.hectorware.com/index.php/apps/spreed/");
    }

    @When("User click Talk button")
    public void user_click_talk_button() {
        alenTalkPage.TalkModule.click();
    }

    @When("User click and conversation name under conversation list")
    public void user_click_and_conversation_name_under_conversation_list() {
        alenTalkPage.SelectAnyConversation.click();
    }

    @When("User click three little dots right next to start call")
    public void user_click_three_little_dots_right_next_to_start_call() {
        alenTalkPage.ThreeLittleDots.click();
    }

    @When("User click rename conversation from dropdown menu")
    public void user_click_rename_conversation_from_dropdown_menu() {
        alenTalkPage.RenameConversation.click();
    }

    @When("User enter alphanumerical characters between {int} and {int} chars")
    public void user_enter_alphanumerical_characters_between_and_chars(Integer int1, Integer int2) {
        alenTalkPage.inputCharacters.clear();
        alenTalkPage.inputCharacters.sendKeys("Employee12345");
    }

    @When("User click small arrow")
    public void user_click_small_arrow() {
        alenTalkPage.smallArrow.click();

    }

    @Then("User should verify edited conversation name")
    public void user_should_verify_edited_conversation_name() {
        String actual = alenTalkPage.VerifyList.getText();
        String expected = "Employee12345";
        Assert.assertEquals(expected, actual);
    }


}
