package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Turgay_CalendarPage {
    public Turgay_CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//ul[@id='appmenu']/li[@data-id='calendar']")
    public WebElement calendarModule;

    @FindBy(xpath = "(//div[@class='trigger']/button)[1]/parent::div")
    public WebElement gridTab;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-day']")
    public WebElement dayButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-week']")
    public WebElement weekButton;

    @FindBy(xpath = "//span[@class='action-button__icon icon-view-module']")
    public WebElement monthButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement eventName;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[6]/td[1]/div/div[2]/div/a/div/div/div/div")
    public WebElement updatedEvent;


    @FindBy(xpath = "//*[@id=\"tab-app-sidebar-tab-details\"]/div[2]/button")
    public WebElement saveButton;


    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[6]/td[1]")
    public WebElement date;



    @FindBy(xpath = "//*[@id=\"app-content-vue\"]/div/div/div/table/tbody/tr/td/div/div/div/table/tbody/tr[6]/td[1]/div/div[2]/div/a")
    public WebElement event;



    @FindBy(xpath = "//input[@id='allDay']")
    public WebElement newDate;

}
