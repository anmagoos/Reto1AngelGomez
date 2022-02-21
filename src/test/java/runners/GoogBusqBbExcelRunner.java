package runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drive.SeleniumWebDriver;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features  = "src/test/resources/features/googleBusquedaBb.feature",
        glue = "stepDefinitions",
        snippets = SnippetType.CAMELCASE

)
public class GoogBusqBbExcelRunner {

}
