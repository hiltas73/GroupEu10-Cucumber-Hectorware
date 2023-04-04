package com.cydeo.step_definitions;

import com.cydeo.pages.Alen_TalkPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;

public class Alen_Talk_StartStopConversation_StepDefinitions {

    Alen_TalkPage alenTalkPage = new Alen_TalkPage();

    @Given("user click any conversation name from conversation list")
    public void user_click_any_conversation_name_from_conversation_list() throws InterruptedException {
        alenTalkPage.SelectAnyConversation.click();
        Thread.sleep(4000);
    }

    @Given("user click Start Call button")
    public void user_click_start_call_button() throws InterruptedException {
        alenTalkPage.StartCallButton.click();
        Thread.sleep(5000);
    }

    @When("user click Leave Call button")
    public void user_click_leave_call_button() throws InterruptedException {
        alenTalkPage.LeaveCallButton.click();
        Thread.sleep(5000);
    }

    @Then("user verify stoped conversation")
    public void user_verify_stoped_conversation() {
        String actual = alenTalkPage.VerifyLeaveCall.getText();
        System.out.println("actual = " + actual);
        String expected = "You left the call";

        Assert.assertEquals(actual, expected);
    }


}
