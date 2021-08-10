package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"org/example/step_defs"},
//        tags = "@smoke and @transactions", // run tests that have @smoke AND @transactions tags both
//        tags = "@smoke or @transactions", // run tests that have @smoke OR @transactions tags
//        tags = "not @ignore", // run ALL tests besides tests with @ignore tag
        tags = "@smoke or @transactions and not @ignore", // run ALL tests besides tests with @ignore tag
        plugin = {
                "pretty",
                "html:target/Cucumber.html",
                "json:target/Cucumber.json",
                "junit:target/Cucumber.xml"},
        monochrome = true
)
public class SmokeTestRunner {
}
