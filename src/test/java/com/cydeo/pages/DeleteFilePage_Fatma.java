package com.cydeo.pages;


import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DeleteFilePage_Fatma {

    public DeleteFilePage_Fatma() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//table[@id='filestable'])[1]//span[.='Day13Notes']")
    public WebElement file;
    
    @FindBy (xpath = "//a[.='All files']\n")
    public WebElement allFilesBtn;

    @FindBy(xpath = "//li[@class=\"action-5\"]")
    public WebElement deleteFileBtn;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFilesBtn;

    @FindBy(xpath = "((//table[@id='filestable'])[11])//span[.='Day13Notes']")
    public WebElement deletedFile;


    @FindBy(xpath = "(//table[@id='filestable'])[11]")
    public WebElement table;





}
