package retoQA.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/PasosEjem.feature",
        tags = "@tagRegiLogi",
        glue = "retoQA.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)


public class runner {
}
