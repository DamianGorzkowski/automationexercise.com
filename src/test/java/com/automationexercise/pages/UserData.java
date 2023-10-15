package com.automationexercise.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.UUID;

public class UserData {
    private String name;
    private String email;
    private String title;
    private String password;
    private String dateOfBirth;

    public String getTitle() {
        return title;
    }

    public UserData setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public UserData setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public UserData(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String getName() {
        return name;
    }

    public UserData setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserData setEmail(String email) {
//        this.email = email;
        this.email = UUID.randomUUID() + "@gmail.com";
        return this;
    }


}
