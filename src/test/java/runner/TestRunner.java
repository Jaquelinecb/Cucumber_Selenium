
package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/java/features",
	glue = ("seleniumgluecode"),
	plugin = { "pretty", "json:target/cucumber/Cucumber.json" }
	
)


public class TestRunner {
	

}
