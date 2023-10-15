package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

public class SignupPage {

    @FindBy(id = "id_gender1")
    private WebElement titleMrCheckbox;

    @FindBy(id = "id_gender2")
    private WebElement titleMrsCheckbox;
    @FindBy(id = "password")
    private WebElement passwordSignupPage;
    @FindBy(id = "days")
    private WebElement dayDateOfBirth;
    @FindBy(id = "months");
    private WebElement monthDateOfBirth;
    @FindBy(id = "years");
    private WebElement yearDateOfBirth;



    public SignupPage (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public void fillSignupPageForm (UserData userData) {
        if (Objects.equals(userData.getTitle(), "Mr.")) {
            titleMrCheckbox.click();
        } else {
            titleMrsCheckbox.click();
        }
        passwordSignupPage.sendKeys(userData.getPassword());

        LocalDate birthDate = LocalDate.parse(userData.getDateOfBirth());
        int day = birthDate.getDayOfMonth();
        Month month = birthDate.getMonth();
        int year = birthDate.getYear();
        dayDateOfBirth.sendKeys(String.valueOf(day));
        monthDateOfBirth.sendKeys(String.valueOf(month));
        yearDateOfBirth.sendKeys((String.valueOf(year)));

    }


}
