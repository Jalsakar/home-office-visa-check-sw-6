package gov.uk.check.visa.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",//feature path
        glue = "gov/uk/check/visa/steps",//steps folder path
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        tags = "@sanity"
)

public class SanityRunCukeTest extends AbstractTestNGCucumberTests {
}
