package com.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	
	public static WebDriver driver;
	
	@Given("user is on loginPage")
	public void user_is_on_loginPage() {
		System.out.println("step1: User is on LoginPage");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/login");
	}
		
	@When("^user enters (.*) and (.*)")
	public void user_enters_username_and_password(String uName, String pssWD) {
		System.out.println("Step2: user enters username and PassWD");
	    driver.findElement(By.id("txtUsername")).sendKeys(uName);
	    driver.findElement(By.id("txtPassword")).sendKeys(pssWD);
	}

	@And("click on login button")
	public void click_on_login_button() {
		System.out.println("Step3: user is clicking on login button");
	    driver.findElement(By.name("Submit")).click();
	}

	@Then("user should land on home page")
	public void user_should_land_on_home_page() {
		System.out.println("Step4: user is on Home Page");
		driver.close();
	}
}