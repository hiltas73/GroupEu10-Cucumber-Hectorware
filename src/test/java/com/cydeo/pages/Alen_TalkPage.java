package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Alen_TalkPage {

public Alen_TalkPage(){
    PageFactory.initElements(Driver.getDriver(),this);

}

@FindBy (xpath = "//*[@filter='url(#invertMenuMain-spreed)']")
    public WebElement TalkModule;

@FindBy(xpath = "(//*[@class='acli__content'])[1]")
    public WebElement SelectAnyConversation;

@FindBy (xpath = "//*[@id=\"app-content-vue\"]/div/div[1]/div/div/div/button")
    public WebElement ThreeLittleDots;

@FindBy (xpath = "//span[.='Rename conversation']")
    public WebElement RenameConversation;

@FindBy (xpath = "//input[@class='app-sidebar-header__maintitle-input']")
    public WebElement inputCharacters;

@FindBy(xpath = "//button[@class='icon-confirm']")
    public WebElement smallArrow;

@FindBy (xpath = "(//span[@class='acli__content__line-one__title'])[1]")
    public WebElement VerifyList;

 @FindBy(xpath = "//ul[@class='conversations']")
    public WebElement ConversationList;

 @FindBy(xpath = "//div[@id='content-vue']/main/div/div/button")
    public WebElement StartCallButton;

 @FindBy(xpath = "//div[@id='content-vue']/main/div/div/button")
    public WebElement LeaveCallButton;

 @FindBy(xpath = "(//div[@id='content-vue']/div/ul/li/ul/li)[1]/a/div[2]/div[2]/span[1]")
    public WebElement VerifyLeaveCall;
}
