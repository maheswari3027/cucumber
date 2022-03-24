package com.orange.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions(features="src\\test\\resources\\Features\\OrangeLog.feature",glue="com\\orange\\stepdef",
	dryRun=false,monochrome=true,tags="@reg")

	public class TestRunner {

	
}
