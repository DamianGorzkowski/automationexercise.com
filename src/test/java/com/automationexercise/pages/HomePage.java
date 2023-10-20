package com.automationexercise.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "body")
    private WebElement homePageBody;
    @FindBy (css = ".navbar-nav > li:nth-child(4) > a")
    private WebElement logInSignInButton;
    @FindBy(linkText = "Delete Account")
    private WebElement deleteAccountButton;

    public boolean isVisible() {
        return homePageBody.isDisplayed();
    }
    public void clickSignUpButton () {
        logInSignInButton.click();
    }
    public void deleteAccountButtonClick() {
        deleteAccountButton.click();
    }
}