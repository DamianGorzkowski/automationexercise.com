package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    public LogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "name")
    private WebElement nameInputBox;
    @FindBy(css = ".signup-form input:nth-child(3)")
    private WebElement newUserEmailInputBox;
    @FindBy(css = ".btn:nth-child(5)")
    private WebElement signInButton;
    @FindBy(name = "email")
    private WebElement existingUserEmail;
    @FindBy(name = "password")
    private WebElement existingUserPassword;
    @FindBy(css = ".btn:nth-child(4)")
    private WebElement loginButtonSignInPage;

    public void fillNewUserInputBox(UserData userData) {
        nameInputBox.sendKeys(userData.getName());
        newUserEmailInputBox.sendKeys(userData.getEmail());
    }
    public void signInButtonClick () {
        signInButton.click();
    }
    public void existingUserEmailAndPasswordInput(UserData userData) {
        existingUserEmail.sendKeys(userData.getEmail());
        existingUserPassword.sendKeys(userData.getPassword());
    }
    public void loginButtonSignInPageClick() {
        loginButtonSignInPage.click();
    }
}