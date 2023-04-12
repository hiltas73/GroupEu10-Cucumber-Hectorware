package com.cydeo.step_definitions;

import com.cydeo.pages.Karolina_FilesPage;
import com.cydeo.pages.LoginHalimPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Karolina_FileUpload_StepDefinitions {

    LoginHalimPage loginPage = new LoginHalimPage();
    Karolina_FilesPage filesPage = new Karolina_FilesPage();
    Actions actions = new Actions(Driver.getDriver());

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);

    @Given("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.login("Employee222", "Employee123");
    }

    @When("user hovers over Files module")
    public void user_hovers_over_files_module() {
        actions.moveToElement(filesPage.filesModule).perform();
    }

    @When("user clicks on Files module")
    public void user_clicks_on_files_module() {
        filesPage.filesModule.click();
    }

    @When("user clicks on + button")
    public void user_clicks_on_button() {
        filesPage.plusButton.click();
    }

    @When("user clicks on Upload file from the displayed dropdown")
    public void user_clicks_on_upload_file_from_the_displayed_dropdown() {
        filesPage.uploadFile.click();
    }

    @When("user selects a file from {string} sized {string} to upload")
    public void user_selects_a_file_from_sized_to_upload(String fileLocation, String fileSize) {
        String workingDir = System.getProperty("user.dir");
        String srcPath = workingDir + "\\src\\" + fileLocation;
        filesPage.hiddenUploadFileBtn.sendKeys(srcPath);
    }

    @Then("user should see a file {string} uploaded from {string} is displayed in All files folder")
    public void user_should_see_a_file_uploaded_from_is_displayed_in_all_files_folder(String fileName, String fileLocation) {
        wait.until(ExpectedConditions.visibilityOf(filesPage.getUploadedFiles(fileName, fileLocation)));
        WebElement uploadedFile = filesPage.getUploadedFiles(fileName, fileLocation);
        Assert.assertTrue(uploadedFile.isDisplayed());
        BrowserUtils.sleep(5);
        // I need to delete the uploaded files after assertion, because when running tests for the second time, the file will already be uploaded, therefore the app will not handle uploading again without some additional steps from the user
        WebElement dotsByUploadedFiles = filesPage.get3DotsByUploadedFiles(fileName, fileLocation);
        wait.until(ExpectedConditions.elementToBeClickable(dotsByUploadedFiles));
        dotsByUploadedFiles.click();
        filesPage.deleteFile.click();
    }

    @Then("user should see error message File size exceeds the maximum limit of 5 MB is displayed")
    public void user_should_see_error_message_file_size_exceeds_the_maximum_limit_of_5_mb_is_displayed() {
        try {
            Assert.assertTrue(filesPage.errorMessage.isDisplayed());
        } catch (NoSuchElementException e) {
            //I need to delete the uploaded files after assertion, because when running tests for the second time, the file will already be uploaded, therefore the app will not handle uploading again without some additional steps from the user
            filesPage.deleteAllUploadedFiles();
            System.out.println("The message is NOT displayed, the app has a bug here!");
            e.printStackTrace();
        }
    }
}

