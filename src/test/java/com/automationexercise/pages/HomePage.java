package com.automationexercise.pages;

import com.automationexercise.tcsteps.Tc1Steps;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//    private WebDriver driver;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#slider-carousel > div")
    private WebElement homePageItem;
    @FindBy (css = ".navbar-nav > li:nth-child(4) > a")
    private WebElement logInSignInButton;

    public boolean isVisible() {
       return homePageItem.isDisplayed();
    }
    public void clickSignUpButton () {
        logInSignInButton.click();
    }
}
