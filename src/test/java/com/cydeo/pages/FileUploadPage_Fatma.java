package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileUploadPage_Fatma {
    public FileUploadPage_Fatma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy (xpath = "//a[@class='button new']")
    public WebElement plusBtn;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFileBtn;

    @FindBy(xpath = "(//span[@class='displayname'])[2]")
    public WebElement newFolderBtn;

    @FindBy(xpath = "(//span[@class='displayname'])[3]")
    public WebElement newTextDocBtn;

    @FindBy(xpath = "//table[@id='filestable']/tbody/tr[11]/td[2]/a/span/span[1]")
    public WebElement file;

    public String fileDirection = "/Users/fatmakayhan/Desktop/Day13Notes.docx";

}
