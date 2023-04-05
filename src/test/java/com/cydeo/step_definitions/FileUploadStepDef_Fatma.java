package com.cydeo.step_definitions;

import com.cydeo.pages.FileUploadPage_Fatma;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class FileUploadStepDef_Fatma {
    LoginPage loginPage = new LoginPage();
    FileUploadPage_Fatma uploadFilePage = new FileUploadPage_Fatma();

    @Given("user is logged in with valid credentials")
    public void user_is_logged_in_with_valid_credentials() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.username.sendKeys("Employee299");
        loginPage.password.sendKeys("Employee123");
        loginPage.LoginButton.click();
    }

    @When("user clicks on the plus button")
    public void user_clicks_on_the_plus_button() {
    uploadFilePage.plusBtn.click();
    }

    @When("user uploads a file with the features defined in AC")
    public void user_uploads_a_file_with_the_features_defined_in_ac() {
        uploadFilePage.uploadFileBtn.sendKeys(uploadFilePage.fileDirection);
        BrowserUtils.sleep(2);
    }

    @Then("the uploaded file should be visible on the files page")
    public void the_uploaded_file_should_be_visible_on_the_files_page() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(this.uploadFilePage.file.isDisplayed());
        //Driver.closeDriver();

    }
}
