package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/resources/features",
		glue = "steps",
		dryRun = true,
		tags = "@regressivos",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty", "html:target/cucumber-html"}	
		
		)





public class Executa {

}
