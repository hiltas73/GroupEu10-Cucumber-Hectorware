package com.cydeo.step_definitions;

import com.cydeo.pages.Uros_CalendarModule_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Then;
import org.joda.time.Seconds;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Uros_CalendarModule_StepDefinitions {

    Uros_CalendarModule_Page urosCalendarModulePage = new Uros_CalendarModule_Page();

    //Verification of module page starts from here
    @Then("user clicks on a calendar module icon")
    public void user_clicks_on_a_calendar_module_icon() {
        urosCalendarModulePage.calendarModuleIcon.click();
    }

    @Then("user verifies the calendar module page")
    public void user_verifies_the_calendar_module_page() {

        String expectedTitle = "Calendar - Hectorware - QA";
        String actualTitle = Driver.getDriver().getTitle();


        Assert.assertTrue(actualTitle.contains(expectedTitle));


        //Verification of change by day month and week starts from here


    }

    @Then("user clicks on six-dot-button in the upper left corner")
    public void user_clicks_on_six_dot_button_in_the_upper_left_corner() {

        urosCalendarModulePage.sixDotButton.click();
    }

    @Then("user chooses view by day")
    public void user_chooses_view_by_day() {
        urosCalendarModulePage.dayView.click();
    }

    @Then("verifies that view has changed to the day interface")
    public void verifies_that_view_has_changed_to_the_day_interface() {
        Assert.assertTrue(urosCalendarModulePage.dayViewElement.isDisplayed());
    }

    @Then("user chooses view by week")
    public void user_chooses_view_by_week() {


        urosCalendarModulePage.weekView.click();
    }

    @Then("verifies that view has changed to the week interface")
    public void verifies_that_view_has_changed_to_the_week_interface() {
        Assert.assertTrue(urosCalendarModulePage.weekViewElement.isDisplayed());
    }

    @Then("user chooses view by month")
    public void user_chooses_view_by_month() {

        urosCalendarModulePage.monthView.click();
    }

    @Then("verifies that view has changed to the month interface")
    public void verifies_that_view_has_changed_to_the_month_interface() {
        Assert.assertTrue(urosCalendarModulePage.monthViewElement.isDisplayed());


    }
//Verification of user creates new event and updates it start here

    @Then("user clicks on the New Event button")
    public void user_clicks_on_the_new_event_button()  {

        urosCalendarModulePage.newEventButton.click();

    }
    @Then("enters the name of the New Event")
    public void enters_the_name_of_the_new_event()  {

        urosCalendarModulePage.nameOfTheNewEvent.sendKeys("Test Event");
    }
    @Then("enters the date of the event")
    public void enters_the_date_of_the_event() {
        urosCalendarModulePage.fromDateInput.click();
        urosCalendarModulePage.nextYear.click();
        urosCalendarModulePage.fromDate.click();
    }
    @Then("saves the event")
    public void saves_the_event() {
        urosCalendarModulePage.saveButton.click();
    }
    @Then("verifies that the event has been saved")
    public void verifies_that_the_event_has_been_saved() {
        urosCalendarModulePage.datePicker.click();
        urosCalendarModulePage.nextYear.click();
        urosCalendarModulePage.fromDate.click();
        Assert.assertTrue(urosCalendarModulePage.savedTestEvent.isDisplayed());
    }

    @Then("user clicks on the saved event")
    public void user_clicks_on_the_saved_event() {
        urosCalendarModulePage.savedTestEvent.click();
    }
    @Then("changes the name to {string}")
    public void changes_the_name_to(String string) {
        urosCalendarModulePage.nameOfTheNewEvent.clear();
        urosCalendarModulePage.nameOfTheNewEvent.sendKeys(string);
    }
    @Then("changes the {string}")
    public void changes_the(String string)  {
        urosCalendarModulePage.fromDateInput.sendKeys(Keys.CONTROL + "a");
        urosCalendarModulePage.fromDateInput.sendKeys(Keys.DELETE);
        urosCalendarModulePage.fromDateInput.sendKeys(string);


    }
    @Then("updates the event")
    public void updates_the_event() {
        urosCalendarModulePage.updateButton.click();
    }
    @Then("user verifies that event is updated with the same {string} and {string}")
    public void user_verifies_that_event_is_updated_with_the_same_and(String string, String string2) {
        urosCalendarModulePage.datePicker.click();
        if (string.equals("Test Event 2")){
            urosCalendarModulePage.newFromDate.click();
            Assert.assertEquals(string,urosCalendarModulePage.updatedEvent2.getText());
            urosCalendarModulePage.updatedEvent2.click();

        }else {urosCalendarModulePage.newFromDate2.click();
            Assert.assertEquals(string,urosCalendarModulePage.updatedEvent3.getText());
            urosCalendarModulePage.updatedEvent3.click();
        }
        urosCalendarModulePage.deleteOrDownload.click();
        urosCalendarModulePage.deleteButton.click();
    }


    @Then("enters the date of the event in the past:{string} and tries to save the event")
    public void enters_the_date_of_the_event_in_the_past_and_tries_to_save_the_event(String string) {
        urosCalendarModulePage.fromDateInput.sendKeys(Keys.CONTROL + "a");
        urosCalendarModulePage.fromDateInput.sendKeys(Keys.DELETE);
        urosCalendarModulePage.fromDateInput.sendKeys(string);
        urosCalendarModulePage.saveButton.click();


    }
    @Then("verifies that the event has not been saved")
    public void verifies_that_the_event_has_not_been_saved() {
        urosCalendarModulePage.datePicker.click();
        urosCalendarModulePage.previousYear.click();
        Assert.assertTrue("The user is able to save an Event in the past",!(urosCalendarModulePage.passedTimeEvent.isDisplayed()));

    }

}