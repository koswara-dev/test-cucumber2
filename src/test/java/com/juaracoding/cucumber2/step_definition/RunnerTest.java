package com.juaracoding.cucumber2.step_definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"classpath:features/"},
		glue = {"com.juaracoding.cucumber2.step_definition"},
		plugin = {"json:target/cucumber/cucumber.json"}
		)
public class RunnerTest {
	
}
