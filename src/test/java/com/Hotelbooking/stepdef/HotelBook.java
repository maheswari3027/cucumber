package com.Hotelbooking.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HotelBook {
	
WebDriver driver;
@Given("Launch the browser")
public void launch_the_browser() {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver	();
}
@Given("open the adactinhotelbooking url")
public void open_the_adactinhotelbooking_url() {
	driver.get("https://adactinhotelapp.com/");
}

@When("Enter the {string} and {string}")
public void enter_the_and(String username, String password) {
	WebElement user=driver.findElement(By.id("username"));
    user.sendKeys(username);
    WebElement pass=driver.findElement(By.id("password"));
    pass.sendKeys(password);
}
@When("Click the login button")
public void click_the_login_button() {
	WebElement login=driver.findElement(By.name("login"));
	login.click();
}
@When("Select the location")
public void select_the_location() {
	WebElement loc=driver.findElement(By.name("location"));
	Select location=new Select(loc);
	location.selectByValue("London");
}
@When("Select the hotels")
public void select_the_hotels() {
	WebElement hot=driver.findElement(By.name("hotels"));
	Select hotel=new Select(hot);
	hotel.selectByValue("Hotel Creek");
}
@When("Select the Room Type")
public void select_the_room_type() {
	WebElement roomtype=driver.findElement(By.name("room_type"));
	Select type=new Select(roomtype);
	type.selectByValue("Double");
}
@When("Select the Numebr of Rooms")
public void select_the_numebr_of_rooms() {
	WebElement noOfRooms=driver.findElement(By.name("room_nos"));
	Select Rooms=new Select(noOfRooms);
	Rooms.selectByValue("2");
}
@When("Click the Search button")
public void click_the_search_button() {
	WebElement search=driver.findElement(By.id("Submit"));
	search.click();
}
@When("Click the Radio button")
public void click_the_radio_button() {
	WebElement radio=driver.findElement(By.id("radiobutton_0"));
	radio.click();
}
@When("Click the Continue button")
public void click_the_continue_button() {
	WebElement contiue=driver.findElement(By.id("continue"));
	contiue.click();
}
@When("Enter the first name")
public void enter_the_first_name() {
	WebElement name=driver.findElement(By.name("first_name"));
	name.sendKeys("maheswari");
}
@When("Enter the last name")
public void enter_the_last_name() {
	WebElement lastname=driver.findElement(By.name("last_name"));
	lastname.sendKeys("prabhu");
}
@When("Enter the billing address")
public void enter_the_billing_address() {
	WebElement address=driver.findElement(By.name("address"));
	address.sendKeys("No.1,xxx,yyy,chennai-103");
}
@When("Enter the Credit Card number")
public void enter_the_credit_card_number() {
	WebElement ccn=driver.findElement(By.name("cc_num"));
	ccn.sendKeys("1234567890111213");
}
@When("Select the credit card type")
public void select_the_credit_card_type() {
	WebElement credittype=driver.findElement(By.name("cc_type"));
	Select sel=new Select(credittype);
	sel.selectByValue("AMEX");
}
@When("Select the ExpiryMonth and ExpiryYear")
public void select_the_expiry_month_and_expiry_year() {
	WebElement expirymonth=driver.findElement(By.name("cc_exp_month"));
	Select month=new Select(expirymonth);
	month.selectByValue("11");
	
	WebElement expiryyear=driver.findElement(By.name("cc_exp_year"));
	Select year=new Select(expiryyear);
	year.selectByValue("2022");
}
@When("Enter the CVV Number")
public void enter_the_cvv_number() {
	WebElement ccvno=driver.findElement(By.name("cc_cvv"));
	ccvno.sendKeys("234");
}
@When("Click the BookNow button")
public void click_the_book_now_button() {
	WebElement book=driver.findElement(By.name("book_now"));
	book.click();
}
@Then("Print the Order Id")
public void print_the_order_id() {
	WebElement orderid=driver.findElement(By.id("order_no"));
	String ord=orderid.getText();
	System.out.println("Order Id:"+ord);
}
@Then("Close the browser")
public void close_the_browser() {
    
}



}