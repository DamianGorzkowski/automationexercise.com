package com.automationexercise.tcsteps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.SignupPage;
import com.automationexercise.pages.UserData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tc1Steps {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private UserData userData;
    private SignupPage signupPage;


    @Given("Launch browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        homePage = new HomePage(driver);
        loginPage = new LoginPage(driver);
        userData = new UserData(driver);
        signupPage = new SignupPage(driver);

    }

    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        driver.get(url);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        assertTrue(homePage.isVisible());
    }

    @And("Click on Signup | Login button")
    public void clickOnSignupLoginButton() {
        homePage.clickSignUpButton();
    }

    @And("Verify 'New User Signup!' is visible")
    public void verifyNewUserSignupIsVisible() {
        WebElement newUserSignupText = driver.findElement(By.cssSelector(".signup-form > h2"));
        String newUserText = newUserSignupText.getText();
        assertEquals("New User Signup!", newUserText);

    }

    @When("Enter {string} and {string} address")
    public void enterNameAndEmailAddress(String name, String email) {
        loginPage.fillNewUserInputBox(userData.setName(name).setEmail(email));
    }

    @And("Click 'Signup' button")
    public void clickSignupButton() {
        loginPage.signInButtonClick();

    }

    @And("Verify that 'ENTER ACCOUNT INFORMATION' is visible")
    public void verifyThatENTERACCOUNTINFORMATIONIsVisible() {
        WebElement enterAccountText = driver.findElement(By.cssSelector(".title:nth-child(1) > b"));
        String enterAccountTextVisibility = enterAccountText.getText();
        assertEquals("ENTER ACCOUNT INFORMATION", enterAccountTextVisibility);
    }

    @And("Fill details: {string}, {string}, {string}, {string}, {string}")
    public void fillDetailsTitleNameEmailPasswordDateOfBirth(String title, String name, String email, String password, String dateOfBirth) {
        signupPage.fillSignupPageForm(userData.setTitle(title).setName(name).setEmail(email).setPassword(password).setDateOfBirth(dateOfBirth));

    }

    @And("Select checkbox 'Sign up for our newsletter!'")
    public void selectCheckboxSignUpForOurNewsletter() {
        signupPage.setNewsletterCheckboxSignupPage();
    }

    @And("Select checkbox 'Receive special offers from our partners!'")
    public void selectCheckboxReceiveSpecialOffersFromOurPartners() {
        signupPage.setSpecialOffersCheckboxSignupPage();
    }

    @And("Fill details: {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void fillDetailsFirstNameLastNameCompanyAddressAddressCountryStateCityZipcodeMobileNumber(String firstName, String lastName, String company, String address, String address2, String country, String state, String city, String zipcode, String mobileNumber) {
    signupPage.fillFormWIthOtherNeededInformation(userData.setFirstName(firstName).setLastName(lastName).setCompany(company).setAddress(address).setAddress2(address2).setCountry(country).setState(state).setCity(city).setZipcode(zipcode).setMobileNumber(mobileNumber));
    }

    @And("Click 'Create Account button'")
    public void clickCreateAccountButton() {
        signupPage.createAccountButtonClick();
    }

    @Then("Verify that 'ACCOUNT CREATED!' is visible")
    public void verifyThatACCOUNTCREATEDIsVisible() {
        WebElement accountCreatedText = driver.findElement(By.cssSelector("b"));
        String accountCreatedTextVisibility = accountCreatedText.getText();
        assertEquals("ACCOUNT CREATED!", accountCreatedTextVisibility);

    }
}
