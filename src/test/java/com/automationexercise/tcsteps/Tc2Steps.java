package com.automationexercise.tcsteps;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.WebDriverManager;
import io.cucumber.java.en.And;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import static org.junit.Assert.assertEquals;

public class Tc2Steps {

    private WebDriver driver = WebDriverManager.getDriver();

    @And("Verify 'Login to your account' is visible")
    public void verifyLogin() {
        WebElement loginText = driver.findElement(By.cssSelector(".login-form > h2"));
        String Text = loginText.getText();
        assertEquals("Login to your account", Text);
    }
}
