package com.vcentry.automation.stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class LoginStepDefinition {

	WebDriver driver;
	
	@Given("Open browser")
	public void open_browser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Divya\\WebDriverTest\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Then("Enter url as {string}")
	public void enter_url_as(String url) {
		driver.manage().window().maximize();
		driver.get(url);
	}

	@Then("Enter valid username as {string}")
	public void enter_valid_username_as(String username) {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
	 
	}

	@Then("Enter valid password as {string}")
	public void enter_valid_password_as(String password) {
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
	    
	}

	@And("Click login")
	public void click_login() {
		 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		    
	}
	
}
