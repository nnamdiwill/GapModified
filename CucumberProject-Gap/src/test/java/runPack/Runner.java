package runPack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources"}, glue= {"stepDefs"},tags="@GapTest2", plugin={"pretty","html:target/Destination.html"} )
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