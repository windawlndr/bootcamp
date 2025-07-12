package selenium_page_factory.test_suite_cucumber.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import org.testng.annotations.AfterSuite;

import cucumber.helper.CucumberReport;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
    features = "src/test/resources/Selenium_Page_Factory", 
    glue = "selenium_page_factory.test_suite_cucumber.definitions",
    plugin = {"pretty", "json:target/cucumber.json"})    
public class CucumberRunner extends AbstractTestNGCucumberTests {
@AfterSuite
    public void after_suite() {
        CucumberReport.generateReport();
        System.err.println("where is the report?");
    }
}
