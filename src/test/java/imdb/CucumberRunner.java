package imdb;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/java/imdb/imdb.feature" }, strict = false)
public class CucumberRunner {
}
