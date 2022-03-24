package com.Hotelbooking.runner;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;



public class ReportingTest {
	public static void jvmReport(String JsonFile) {
		File report=new File("C:\\Program Files\\Java\\CucumberProject\\src\\test\\resources\\Report");
	    Configuration config=new Configuration(report, "Mahe project");
	    config.addClassifications("tester", "prabhu");
	    config.addClassifications("browser","chrome");
	    List<String> al=new ArrayList<String>();
	    al.add(JsonFile);
	    ReportBuilder builder=new ReportBuilder(al, config);
	    builder.generateReports();
	
	}
}

