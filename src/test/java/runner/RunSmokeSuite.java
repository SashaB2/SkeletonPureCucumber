package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"smoke"},
        features = {"C:/Users/B2/IdeaProjects/discovercucumber/src/test/resources/Features/OpenMainPage.feature"})
public class RunSmokeSuite {
}
