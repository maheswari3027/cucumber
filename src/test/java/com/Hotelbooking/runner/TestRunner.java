package com.Hotelbooking.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\HotelLog.feature",glue="com\\Hotelbooking\\stepdef",
dryRun=false,monochrome=true,plugin= {"pretty","html:target\\Hotel.html","json:target\\Hotel.json",
		"junit:target\\Hotel.junit"})

public class TestRunner {
	@AfterClass
	public static void tearDown() {
		ReportingTest.jvmReport("C:\\Program Files\\Java\\CucumberProject\\target\\Hotel.json");
	}

}
