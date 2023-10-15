package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "name")
    private WebElement nameInputBox;
    @FindBy(css = ".signup-form input:nth-child(3)")
    private WebElement emailInputBox;
    @FindBy(css = ".btn:nth-child(5)")
    private WebElement signInButton;

    public void fillNewUserInputBox(UserData userData) {
        nameInputBox.sendKeys(userData.getName());
        emailInputBox.sendKeys(userData.getEmail());
    }
    public void signInButtonClick () {
        signInButton.click();
    }
}
