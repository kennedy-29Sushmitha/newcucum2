package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/casecucumber1.Feature","src/main/resources/casecucumber2.Feature","src/main/resources/casecucumber3.Feature","src/main/resources/casecucumber4.Feature"},
				  glue="Stepdefinition",
				  plugin="json:target/jsonreport.json"
				
				  //tags={"@smoke"}
				  //tags={"@regression"}
				  //tags={"~@smoke"}
				  //tags={"@smoke","@regression"}
				 )


public class Runnerclass {

}
