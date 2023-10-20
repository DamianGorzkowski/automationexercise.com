package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


    public class WebDriverManager {
        private static WebDriver driver;

        public static WebDriver getDriver() {
            if (driver == null) {
                // Inicjalizacja WebDrivera
                driver = new ChromeDriver();
            }
            return driver;
        }

        public static void quitDriver() {
            if (driver != null) {
                driver.quit();
                driver = null;
            }
        }
    }

