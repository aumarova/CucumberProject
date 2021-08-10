package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"org/example/step_defs"},
//        dryRun = false
//        plugin = {"json:target/cucumber.json"},
//        plugin = {"pretty", "html:target/reports"}
        publish = true
)
public class RegressionTestRunner {
}
