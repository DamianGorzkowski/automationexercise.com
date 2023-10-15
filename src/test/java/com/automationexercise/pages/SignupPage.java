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

    @FindBy(id = "months")
    private WebElement monthDateOfBirth;

    @FindBy(id = "years")
    private WebElement yearDateOfBirth;
    @FindBy(id = "newsletter")
    private WebElement newsletterCheckboxSignupPage;

    @FindBy(id = "optin")
    private WebElement specialOffersCheckboxSignupPage;
    @FindBy(id = "first_name")
    private WebElement firstName;
    @FindBy(id = "last_name")
    private WebElement lastName;
    @FindBy(id = "company")
    private WebElement company;
    @FindBy(id = "address1")
    private WebElement address;
    @FindBy(id = "address2")
    private WebElement address2;
    @FindBy(id = "country")
    private WebElement country;
    @FindBy(id = "state")
    private WebElement state;
    @FindBy(id = "city")
    private WebElement city;
    @FindBy(id = "zipcode")
    private WebElement zipcode;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumber;





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
    public void setNewsletterCheckboxSignupPage() {
        newsletterCheckboxSignupPage.click();
    }
    public  void  setSpecialOffersCheckboxSignupPage() {
        specialOffersCheckboxSignupPage.click();
    }
    public void fillFormWIthOtherNeededInformation(UserData userData) {
        firstName.sendKeys(userData.getFirstName());
        lastName.sendKeys(userData.getLastName());
        company.sendKeys(userData.getCompany());
        address.sendKeys(userData.getAddress());
        address2.sendKeys(userData.getAddress2());
        country.sendKeys(userData.getCountry());
        state.sendKeys(userData.getState());
        city.sendKeys(userData.getCity());
        zipcode.sendKeys(userData.getZipcode());
        mobileNumber.sendKeys(userData.getMobileNumber());
    }


}
