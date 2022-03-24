package com.orange.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {
	WebDriver driver;
	@Given("Launch the browser")
	public void launch_the_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	@Given("Open the Orange HRM")
	public void open_the_orange_hrm() {
	       driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	    
    @When("Enter the {string} and {string}")
	    public void enter_the_and(String username, String password) {
    	WebElement user=driver.findElement(By.id("txtUsername"));
	    user.sendKeys(username);
	    WebElement pass=driver.findElement(By.id("txtPassword"));
	    pass.sendKeys(password);
    }
    @When("Enter the username and password")
    public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
    	List<Map<String, String>> asMaps= dataTable.asMaps();
    	WebElement user=driver.findElement(By.id("txtUsername"));
	    user.sendKeys(asMaps.get(0).get("username"));
	    WebElement pass=driver.findElement(By.id("txtPassword"));
	    pass.sendKeys(asMaps.get(1).get("password"));
    }



    

	@When("click the login button")
	public void click_the_login_button() {
	    WebElement login=driver.findElement(By.id("btnLogin"));
	    login.click();
	}
	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    System.out.println("Outcome");
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    
	}



}
