package com.cydeo.step_definitions;

import com.cydeo.pages.Turgay_CalendarPage;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class Turgay_Calendar_StepDefinitions {
    Turgay_CalendarPage calendarPage = new Turgay_CalendarPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is on calendar module")
    public void user_is_on_calendar_module() {

        actions.moveToElement(calendarPage.calendarModule).perform();
        calendarPage.calendarModule.click();

    }

    @When("user clicks on grid tab")
    public void user_clicks_on_grid_tab() {
        calendarPage.gridTab.click();
    }

    @When("user clicks on  day button")
    public void user_clicks_on_day_button() {
        calendarPage.dayButton.click();
    }

    @Then("user sees the daily calendar view")
    public void user_sees_the_daily_calendar_view() {
        Assert.assertEquals("https://qa.hectorware.com/index.php/apps/calendar/timeGridDay/now", Driver.getDriver().getCurrentUrl());
    }

    @When("user clicks on  week button")
    public void user_clicks_on_week_button() {
        calendarPage.weekButton.click();
    }

    @Then("user sees the weekly calendar view")
    public void user_sees_the_weekly_calendar_view() {
        Assert.assertEquals("https://qa.hectorware.com/index.php/apps/calendar/timeGridWeek/now", Driver.getDriver().getCurrentUrl());
    }

    @When("user clicks on  month button")
    public void user_clicks_on_month_button() {
        calendarPage.monthButton.click();
    }

    @Then("user sees the monthly calendar view")
    public void user_sees_the_monthly_calendar_view() {
        Assert.assertEquals("https://qa.hectorware.com/index.php/apps/calendar/dayGridMonth/now", Driver.getDriver().getCurrentUrl());

    }


    @When("enters the name of the New Event as {string}")
    public void enters_the_name_of_the_new_event_as(String string) {
        calendarPage.eventName.sendKeys(string);

    }

    @Then("user verifies that event is updated.")
    public void user_verifies_that_event_is_updated() {
        Assert.assertTrue(calendarPage.updatedEvent.isDisplayed());

    }

    @Then("verifies that event is saved")
    public void verifies_that_event_is_saved() {
        Assert.assertTrue(calendarPage.event.isDisplayed());
    }
    @Then("user clicks on the saved event to update")
    public void user_clicks_on_the_saved_event_to_update() {
        calendarPage.event.click();

    }

    @When("updates the name as {string}")
    public void updates_the_name_as(String string) {
        calendarPage.eventName.clear();
        calendarPage.eventName.sendKeys(string);

    }

    @When("clicks the saves  button")
    public void clicks_the_saves_button() {
        calendarPage.saveButton.click();

    }

    @When("enters the date {string}")
    public void enters_the_date(String string) {
      calendarPage.date.click();
    }

    @When("updates the date as {string}")
    public void updates_the_date_as(String string) {
     calendarPage.newDate.click();
    }

}
