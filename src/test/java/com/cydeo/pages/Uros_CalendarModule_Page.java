package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Uros_CalendarModule_Page {

    public Uros_CalendarModule_Page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "(//a[@aria-label='Calendar'])[1]")
    public WebElement calendarModuleIcon;
//button primary new-event  (//div[@class='trigger']/button)[1]

    @FindBy(xpath = "(//div[@class='trigger']/button)[1]/parent::div")
    public WebElement sixDotButton;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement dayView;

    @FindBy(xpath = "//div[@class='fc-timegrid fc-timeGridDay-view fc-view']")
    public WebElement dayViewElement;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekView;

    @FindBy(xpath = "//div[@class='fc-timegrid fc-timeGridWeek-view fc-view']")
    public WebElement weekViewElement;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthView;

    @FindBy(xpath = "//div[@class='fc-daygrid fc-dayGridMonth-view fc-view']")
    public WebElement monthViewElement;

    @FindBy(xpath = "//button[@class='button primary new-event']")
    public WebElement newEventButton;
//

    @FindBy(xpath = "//input[@class='app-sidebar-header__maintitle-input']")

    public WebElement nameOfTheNewEvent;

    @FindBy(xpath = "(//input[@name='date'][@class='mx-input'])[2]")
    public WebElement fromDateInput;

    @FindBy(xpath = "//button[@class='mx-btn mx-btn-text mx-btn-icon-double-right']")
    public WebElement nextYear;
    //mx-btn mx-btn-text mx-btn-icon-double-left
    @FindBy(xpath = "//button[@class='mx-btn mx-btn-text mx-btn-icon-double-left']")
    public WebElement previousYear;
    @FindBy(xpath = "//td[@title='2022-04-18']")
    public WebElement passedTimeEvent;

    @FindBy(xpath = "//td[@title='2024-04-01']")
    public WebElement fromDate;
    @FindBy(xpath = "//td[@title='2024-04-16']")
    public WebElement newFromDate;
    @FindBy(xpath = "//td[@title='2024-04-18']")
    public WebElement newFromDate2;
    @FindBy(xpath = "(//div[@class='app-sidebar-tab__buttons']/button)[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//button[@class='datepicker-button-section__datepicker-label button datepicker-label']")
    public WebElement datePicker;

    @FindBy(xpath = "//div[.='Test Event']")
    public WebElement savedTestEvent;


    @FindBy(xpath = "(//button[@class='primary'])[1]")
    public WebElement updateButton;

    @FindBy(xpath = "//div[.='Test Event 2']")
    public WebElement updatedEvent2;

    @FindBy(xpath = "//div[.='Test Event 3']")
    public WebElement updatedEvent3;

    @FindBy(xpath = "(//button[@class='icon action-item__menutoggle action-item__menutoggle--default-icon'])[6]")
    public WebElement deleteOrDownload;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteButton;


}
