package org.example.testRunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.example.stepDefs.SD01_AddCourse;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue =    {"org.example.stepDefs"},
        plugin = {          "pretty",
                "html:target/cucumber.html",
                "json:target/cucumber.json",
                "junit:target/cukes.xml",
                "rerun:target/rerun.txt"},
        tags = "@test"
)
public class Runners  extends AbstractTestNGCucumberTests {


}
