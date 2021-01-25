package runPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"}, glue= {"stepDefs"},tags="@FBTest1", plugin={"pretty","html:target/Destination.html"} )
public class Runner {

	
}
/**
 * For cucumber frameworks, you need,:
 * 
 * Step definition files
 * Feature files - gherkins statements
 * Base file or classes
 * runner class or run pack
 */

// integrating Github with Eclipse
// https://automationstepbystep.com/2017/11/14/how-to-add-eclipse-project-to-github-how-to-commit-push-pull-from-eclipse-to-github/