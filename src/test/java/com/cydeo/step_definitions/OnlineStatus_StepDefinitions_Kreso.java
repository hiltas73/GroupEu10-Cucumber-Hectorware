package com.cydeo.step_definitions;

import com.cydeo.pages.HectorwarePage_Kreso;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


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
    public void user_clicks_on_avatar_button()  {
        BrowserUtils.sleep(2);
        hectorwarePageKreso.avatarButton.click();


    }
    @When("user clicks Set status button")
    public void user_clicks_in_dropdown_set_status_button()  {
        BrowserUtils.sleep(2);
        hectorwarePageKreso.setStatusButton.click();

    }
    @Then("user should see online status")
    public void user_should_see_online_status()  {
        BrowserUtils.sleep(3);
      String actualOnlineStatus = hectorwarePageKreso.onlineStatus.getText();
      String expectedOnlineStatus = "Online status";

        Assert.assertEquals(expectedOnlineStatus, actualOnlineStatus);

    }

    @When("user clicks Online button")
    public void user_clicks_online_button()  {
        BrowserUtils.sleep(3);
        hectorwarePageKreso.onlineButton.click();
    }
    @Then("user should see in dropdown menu that status has changed to Online")
    public void user_should_see_in_dropdown_menu_that_status_has_changed_to_online() {
        String actualOnlineStatusInDropdownMenu = hectorwarePageKreso.setStatusButton.getText();
        String expectedOnlineStatusInDropdownMenu = "Online";

        System.out.println("actualOnlineStatusInDropdownMenu = " + actualOnlineStatusInDropdownMenu);
        System.out.println("expectedOnlineStatusInDropdownMenu = " + expectedOnlineStatusInDropdownMenu);

        Assert.assertEquals(expectedOnlineStatusInDropdownMenu,actualOnlineStatusInDropdownMenu);

    }

    @And("user clicks Away button")
    public void user_clicks_away_button()  {
        BrowserUtils.sleep(3);
        hectorwarePageKreso.awayButton.click();

    }

    @When("user clicks X button to close the online status window")
    public void user_clicks_x_button_to_close_the_online_status_window()  {
        BrowserUtils.sleep(2);
        hectorwarePageKreso.xButton.click();

    }
    @Then("user should see in dropdown menu that status has changed to Away")
    public void user_should_see_in_dropdown_menu_that_status_has_changed_to_away() {

        String actualOnlineStatusInDropdownMenu = hectorwarePageKreso.setStatusButton.getText();
        String expectedOnlineStatusInDropdownMenu = "Away";

        System.out.println("actualOnlineStatusInDropdownMenu = " + actualOnlineStatusInDropdownMenu);
        System.out.println("expectedOnlineStatusInDropdownMenu = " + expectedOnlineStatusInDropdownMenu);

        Assert.assertEquals(expectedOnlineStatusInDropdownMenu,actualOnlineStatusInDropdownMenu);
    }

    @When("user clicks Do not Disturb button")
    public void user_clicks_do_not_disturb_button()  {
        BrowserUtils.sleep(3);
        hectorwarePageKreso.doNotDisturbButton.click();

    }
    @Then("user should see in dropdown menu that status has changed to Do not Disturb")
    public void user_should_see_in_dropdown_menu_that_status_has_changed_to_do_not_disturb() {

        String actualOnlineStatusInDropdownMenu = hectorwarePageKreso.setStatusButton.getText();
        String expectedOnlineStatusInDropdownMenu = "Do not disturb";

        System.out.println("actualOnlineStatusInDropdownMenu = " + actualOnlineStatusInDropdownMenu);
        System.out.println("expectedOnlineStatusInDropdownMenu = " + expectedOnlineStatusInDropdownMenu);

        Assert.assertEquals(expectedOnlineStatusInDropdownMenu,actualOnlineStatusInDropdownMenu);

    }

    @When("user clicks Invisible button")
    public void user_clicks_invisible_button()  {
        BrowserUtils.sleep(3);
        hectorwarePageKreso.invisibleButton.click();

    }
    @Then("user should see in dropdown menu that status has changed to Invisible")
    public void user_should_see_in_dropdown_menu_that_status_has_changed_to_invisible() {

        String actualOnlineStatusInDropdownMenu = hectorwarePageKreso.setStatusButton.getText();
        String expectedOnlineStatusInDropdownMenu = "Invisible";

        System.out.println("actualOnlineStatusInDropdownMenu = " + actualOnlineStatusInDropdownMenu);
        System.out.println("expectedOnlineStatusInDropdownMenu = " + expectedOnlineStatusInDropdownMenu);

        Assert.assertEquals(expectedOnlineStatusInDropdownMenu,actualOnlineStatusInDropdownMenu);

    }

    @After
    public void teardownScenario(Scenario scenario){

        //scenario.isFailed() --> if scenario fails this method will return TRUE boolean value

        if (scenario.isFailed()){

            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }

        BrowserUtils.sleep(3);
        Driver.closeDriver();

        //System.out.println("====Closing browser using cucumber @After");
        // System.out.println("====Scenario ended/ Take screenshot if failed");
    }

}
