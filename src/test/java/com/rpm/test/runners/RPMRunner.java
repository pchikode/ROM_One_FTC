package com.rpm.test.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features/patient_case.feature"},
        plugin = {"pretty"},
        glue = {"com.rpm.test"},
        tags = "@SmokeTest1",
        dryRun = false)

public class RPMRunner {

}