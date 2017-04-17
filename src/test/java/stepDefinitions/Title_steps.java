package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Title_steps {
	public static WebDriver driver;
	String actualTitle = "";




@Given("^I am on Mercury Tours$")
public void i_am_on_Mercury_Tours() throws Throwable {
    System.out.println("step1");
//    System.setProperty("webdriver.gecko.driver","D:\\paths\\geckodriver.exe");
//	driver = new FirefoxDriver();
	
	String baseUrl = "http://newtours.demoaut.com";
	System.out.println(driver);
	driver.get(baseUrl);
}

@When("^I get the page title$")
public void i_get_the_page_title() throws Throwable {
	System.out.println("step2");
	actualTitle = driver.getTitle();
}

@Then("^I verify that the page title is \"([^\"]*)\"$")
public void i_verify_that_the_page_title_is(String arg1) throws Throwable {
	System.out.println("step3");
	String expectedTitle = arg1;
	
	if(actualTitle.contentEquals(expectedTitle)){
		System.out.println("Test Passed!");
	}
	else {
		System.out.println(driver.getTitle());
		System.out.println("Test Failed!!");
	}
//	driver.quit();
}

@After
public void whatever2(){
	System.out.println("after");
	driver.quit();
}

}
