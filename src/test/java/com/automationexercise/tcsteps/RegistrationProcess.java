package com.automationexercise.tcsteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/",
        plugin = {"pretty","html:out"})
public class RegistrationProcess {
}
