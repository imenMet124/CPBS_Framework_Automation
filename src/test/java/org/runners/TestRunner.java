package org.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        glue = "org/steps",
        tags = "@nv_compte",
        plugin = {"json:target/cucumber.json","html:target/site/CPBS_Report.html"})
public class TestRunner  {

}
