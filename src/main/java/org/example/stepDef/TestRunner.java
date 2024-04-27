package org.example.stepDef;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/java/org/example/cucumber_feature",
glue = {"org/example/stepDef"},
dryRun = false)

public class TestRunner
{

}
