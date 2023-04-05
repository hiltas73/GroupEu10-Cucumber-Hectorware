package com.cydeo.step_definitions;

import com.cydeo.pages.DeleteFilePage_Fatma;
import com.cydeo.pages.FileUploadPage_Fatma;
import com.cydeo.pages.LoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

public class DeleteFileStepDef_Fatma {
    Actions actions = new Actions(Driver.getDriver());
    DeleteFilePage_Fatma deleteFilePage = new DeleteFilePage_Fatma();

    String fileName = deleteFilePage.file.getText();


    @When("user clicks all files button")
    public void user_clicks_all_files_button() {
        deleteFilePage.allFilesBtn.click();
    }

    @When("user right click the file that is to be deleted")
    public void user_right_click_the_file_that_is_to_be_deleted() {
        actions.contextClick(deleteFilePage.file).perform();

    }

    @When("user click delete file option")
    public void user_click_delete_file_option() {
        deleteFilePage.deleteFileBtn.click();
    }

    @When("user click deleted files button")
    public void user_click_deleted_files_button() {
        deleteFilePage.deletedFilesBtn.click();
        //Driver.getDriver().navigate().refresh();
    }

    @Then("name of recently deleted file should be displayed")
    public void name_of_recently_deleted_file_should_be_displayed() {
        //BrowserUtils.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        //boolean b = true;
        do{
            BrowserUtils.sleep(5);
            js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        }while(!deleteFilePage.table.getText().contains("Day13Notes"));


        Assert.assertTrue(deleteFilePage.deletedFile.isDisplayed());
        Driver.closeDriver();

    }
}
