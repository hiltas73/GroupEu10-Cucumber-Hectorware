package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Turgay_CalendarPage {
    public Turgay_CalendarPage(){
        PageFactory.initElements(Driver.getDriver(),this);
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

    @FindBy (xpath = "//input[@placeholder='Event title']")
    public WebElement eventName;

    //a[@data-recurrence-id='1681635600']

   @FindBy(xpath = "//a[@data-recurrence-id='1681635600']    ")
    public WebElement updated1;

    //a[@data-recurrence-id='1680825600']

    @FindBy(xpath = " //a[@data-recurrence-id='1680825600']")
    public WebElement event;



}
