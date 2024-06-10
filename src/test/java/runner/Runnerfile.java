package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"html:target/cucumberReports.html"},
		features="src\\test\\resources\\features\\SmokeTesing2",
		glue="steps",
		stepNotifications=true,
		tags="@wip12345",
		dryRun=false
		)
public class Runnerfile {
}