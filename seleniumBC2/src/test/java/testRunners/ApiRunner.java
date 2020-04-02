package testRunners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/test/resources/apiFeatureFile",
		glue = {"apiStepDefinitions"}
		//tags = "@ValidCredentials"
		)

public class ApiRunner extends AbstractTestNGCucumberTests{

}
