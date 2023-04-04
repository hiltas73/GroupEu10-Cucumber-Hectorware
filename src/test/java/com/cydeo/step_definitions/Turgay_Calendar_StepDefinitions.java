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

}
