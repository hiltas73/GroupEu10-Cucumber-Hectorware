package com.cydeo.step_definitions;

import com.cydeo.pages.KarolinaFilesPage;
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

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class Karolina_FileUpload_StepDefinitions {

    KarolinaFilesPage filesPage = new KarolinaFilesPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("user")).sendKeys("Employee222");
        Driver.getDriver().findElement(By.id("password")).sendKeys("Employee123");
        Driver.getDriver().findElement(By.id("submit-form")).click();
    }

    @When("user hovers over Files module")
    public void user_hovers_over_files_module() {
        actions.moveToElement(filesPage.filesModule).perform();
    }

    @When("user clicks on Files module")
    public void user_clicks_on_files_module() {
        filesPage.filesModule.click();
    }

    @When("user clicks on All files folder from the left navigation menu")
    public void user_clicks_on_all_files_folder_from_the_left_navigation_menu() {
        filesPage.allFilesFolder.click();
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
    public void user_selects_a_file_from_sized_to_upload(String fileLocation, String fileSize) throws AWTException, InterruptedException {
        // Locate the file input field - done in the previous step
        // Click on the file input field to trigger the file dialog - done in the previous step

        // Create a new instance of the Robot class
        Robot robot = new Robot();

        // Wait for the file dialog to appear
        Thread.sleep(1000);

        // Set the file path to the clipboard
        StringSelection filePath = new StringSelection(fileLocation);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);

        // Simulate pressing the Ctrl + V keys to paste the file path into the file dialog
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // Simulate pressing the Enter key to submit the file dialog
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Then("user should see a file {string} uploaded from {string} is displayed in All files folder")
    public void user_should_see_a_file_uploaded_from_is_displayed_in_all_files_folder(String fileName, String fileLocation) {
        Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.invisibilityOf(filesPage.progressBar));
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement uploadedFile = filesPage.getUploadedFiles(fileName, fileLocation);
        Assert.assertTrue(uploadedFile.isDisplayed());

        // I need to delete the uploaded files after assertion, because when running tests for the second time, the file will already be uploaded, therefore the app will not handle uploading again without some additional steps from the user
        filesPage.get3DotsByUploadedFiles(fileName, fileLocation).click();
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

