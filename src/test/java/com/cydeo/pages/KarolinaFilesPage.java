package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KarolinaFilesPage {

    public KarolinaFilesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='files']")
    public WebElement filesModule;

    @FindBy(xpath = "//a[@class='nav-icon-files svg active']")
    public WebElement allFilesFolder;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement plusButton;

    @FindBy(xpath = "//li/label[@class='menuitem']")
    public WebElement uploadFile;

    @FindBy(xpath = "//div[@id='uploadprogressbar']")
    public WebElement progressBar;

    @FindBy(xpath = "//div[text()='Operation is blocked by access control']")
    public WebElement errorMessage;

    @FindBy(xpath = "//a[@class='menuitem action action-delete permanent']")
    public WebElement deleteFile;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public WebElement headerCheckbox;

    @FindBy(xpath = "(//a[@class='actions-selected']/span[.='Actions'])[1]")
    public WebElement actionButton;

    @FindBy(xpath = "//a[@class='menuitem action delete permanent']/span[.='Delete']")
    public WebElement deleteButton;

    public WebElement getUploadedFiles(String fileName, String fileLocation) {
        String xpath = "//tr[@data-file='" + fileName + "." + fileLocation.substring(fileLocation.length() - 3) + "']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public WebElement get3DotsByUploadedFiles(String fileName, String fileLocation) {
        String xpath = "//tr[@data-file='" + fileName + "." + fileLocation.substring(fileLocation.length() - 3) + "']//span[@class='icon icon-more']";
        return Driver.getDriver().findElement(By.xpath(xpath));
    }

    public void deleteAllUploadedFiles() {
        headerCheckbox.click();
        actionButton.click();
        deleteButton.click();
    }
}


