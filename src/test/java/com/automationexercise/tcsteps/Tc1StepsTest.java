package com.automationexercise.tcsteps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/features/tc_1_register_user.feature",
        plugin = {"pretty","html:out"})
public class Tc1StepsTest {
}
