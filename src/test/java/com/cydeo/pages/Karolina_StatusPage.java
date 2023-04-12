package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Karolina_StatusPage {
    public Karolina_StatusPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "div[class='avatardiv avatardiv-shown']")
    public WebElement userProfileButton;

    @FindBy(css = "a[class='user-status-menu-item__toggle']")
    public WebElement setStatus;

    @FindBy(css = "div[class='user-status-online-select']")
    public List<WebElement> allOnlineStatuses;

    @FindBy(css = "button[class='action-item action-item--single header-close icon-close undefined undefined has-tooltip']")
    public WebElement xButton;

    public void selectStatusOption(String statusOption) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(allOnlineStatuses));
        for (WebElement onlineStatus : allOnlineStatuses) {
            //to get the text of the outer element only
            if (onlineStatus.getText().split("\n")[0].contains(statusOption)) {
                onlineStatus.click();
                break;
            }
        }
    }

    @FindBy(css = "span[class='predefined-status__message']")
    public List<WebElement> allStatusMessages;

    @FindBy(css = "button[class='status-buttons__primary primary']")
    public WebElement setStatusMessageButton;

    @FindBy(css = "button[class='status-buttons__select']")
    public WebElement clearStatusMessageButton;

    public void selectMessage(String statusMessage) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 30);
        wait.until(ExpectedConditions.visibilityOfAllElements(allStatusMessages));
        for (WebElement status : allStatusMessages) {
            if (status.getText().endsWith(statusMessage)) {
                status.click();
                break;
            }
        }
    }
}
