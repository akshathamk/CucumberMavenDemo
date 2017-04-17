package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.Before;

public class Sample_steps {
	public static WebDriver driver;
	
	//driver initialise
	@Before 
	public void whatever1(){
		System.out.println("before");
		System.setProperty("webdriver.gecko.driver","D:\\paths\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

}
