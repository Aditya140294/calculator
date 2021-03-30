package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(  plugin = {"pretty","html:target/cucumberreport","html:target/htmlreport"},
                   features = {"src/test/java/Features/multiplication.feature"},
                   glue = {"StepsDefination"})
public class Runner {

}
