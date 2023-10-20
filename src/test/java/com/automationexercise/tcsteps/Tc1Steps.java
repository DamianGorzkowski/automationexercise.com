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
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Tc1Steps {
    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private UserData userData;
    private SignupPage signupPage;
    private Actions actions;

    @Given("Launch browser")
    public void launchBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @And("Navigate to url {string}")
    public void navigateToUrl(String url) {
        this.driver.get(url);
    }

    @And("Verify that home page is visible successfully")
    public void verifyThatHomePageIsVisibleSuccessfully() {
        homePage = new HomePage(driver);
        assertTrue(homePage.isVisible());
    }
    @And("Click on Signup | Login button")
    public void clickOnSignupLoginButton() {
        this.homePage = new HomePage(driver);
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
        loginPage = new LoginPage(driver);
        userData = new UserData(driver);
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
        signupPage = new SignupPage(driver);
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

    @And("Click 'Continue' button")
    public void clickContinueButton() {
        signupPage.continueButtonClick();
        actions = new Actions(driver);
        actions.moveByOffset(951, 66).click().perform();
    }

    @And("Verify that 'Logged in as {string}' is visible")
    public void verifyThatLoggedInAsUsernameIsVisible(String userName) {
        WebElement loggedName = driver.findElement(By.xpath("//header[@id='header']/div/div/div/div[2]/div/ul/li[10]/a"));
        String name = loggedName.getText();
        assertEquals("Logged in as " + userName, name);
    }
}
