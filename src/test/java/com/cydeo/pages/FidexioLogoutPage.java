package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FidexioLogoutPage {



    public FidexioLogoutPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"oe_main_menu_navbar\"]/div[2]/ul[2]/li/ul/li[6]/a")
    public WebElement logOut;

    @FindBy(xpath = "//img[@class='img-circle oe_topbar_avatar']")
    public WebElement profileIcon;

    @FindBy(xpath = "//div[@class='o_dialog_warning modal-body']")
    public  WebElement expireMessage;

    @FindBy(xpath = "//a[@class='navbar-brand']")
    public  WebElement logInPage;
}
