package Runners;

import io.cucumber.junit.platform.engine.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepDefinitions"},
        tags = "@Smoketest",
        plugin = {"pretty", "html:Reports/cucumber-reports.html", "json:target/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        monochrome = true,
        publish = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}