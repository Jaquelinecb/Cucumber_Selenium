package runner;

import cucumber.api.CucumberOptions;


@CucumberOptions(
		features = "src/test/resources/functionalTests",
		glue= {"stepDefinitions"},
		plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json" },
		monochrome = true
	)

public class TestRunnerDos {

}
