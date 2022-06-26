package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/java/feature",
		glue ={"stepdefinition","hooks"},
		monochrome = true,
		dryRun = false,
		//tags={"@Regression","@Smoke"},  //And condition
		//tags={"@Regression,@Smoke"},  //OR condition
		//tags={"@Run,@hello"}  //skipping tag
		tags={"@Run, @hello, @Gift, @editV,@add_voucher_back"}
		//tags={" @gift_edit,@gift_add"}
		
		)

public class runner {

}