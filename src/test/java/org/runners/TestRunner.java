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

//package org.runners;
//
//import org.junit.runner.RunWith;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(features = "src/test/resources/features",
//        glue = { "Steps" },
//        tags = "@nv_compte",
//        plugin = { "pretty", "html:target/test-output.html", "json:target/cucumber.json",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
//        dryRun = false,
//        monochrome = true
//)
//public class TestRunner {
//
//}
