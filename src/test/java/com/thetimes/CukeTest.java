package com.thetimes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by user on 4/27/2017.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format="html:target/Cucumber.Report",tags="@java")


public class CukeTest {
}
