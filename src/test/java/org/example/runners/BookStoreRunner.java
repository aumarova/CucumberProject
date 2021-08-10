package org.example.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"org/example/step_defs"},
        tags = "@bookstore",
        plugin = {
                "pretty",
                "html:target/Cucumber.html",
                "json:target/Cucumber.json",
                "junit:target/Cucumber.xml"},
        dryRun = true,
        monochrome = true
)
public class BookStoreRunner {
}
