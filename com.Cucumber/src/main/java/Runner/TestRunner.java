package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\siva\\Desktop\\NewTours\\com.Cucumber\\src\\main\\java\\Features",//path of feature file
glue={"stepDefinition"},//package name 
format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucu.xml"} ,//generates diff outputs
strict=true,//if we forget to define methods....it tells any non defined methods
dryRun=false,monochrome=true //display the console output in a readable manner



//dryRun=true is used for mapping of scenarios with methods
//dryRun=false ..ignore above cases and go on execution

)
public class TestRunner {

}
