package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		glue = "stepdefinitions",
		features = "src/test/java/features/IRCTC.feature",
		monochrome = true,
		dryRun = false,
		tags = "@TC002"
		)


public class RunnerFile extends AbstractTestNGCucumberTests{
	
	
	

}
