package com.juaracoding.cucumber2.step_definition;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestLogin {

	public WebDriver driver;
	
	public TestLogin() {
		driver = Hook.driver;
	}
	
	@When("User login ke halaman web")
	public void testLogin() {
		driver.get("https://www.phptravels.net/login");
		WebElement btnGotIt = driver.findElement(By.id("cookie_stop"));
		btnGotIt.click();
		WebElement formEmail = driver.findElement(By.name("email"));
		formEmail.sendKeys("user@phptravels.com");
		WebElement formPass = driver.findElement(By.name("password"));
		formPass.sendKeys("demouser");
		WebElement btnLogin = driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[1]/div/div[2]/div[2]/div/form/div[3]/button"));
		btnLogin.click();
	}
	
	@Then("User berhasil login")
	public void berhasilLogin() {		
		String expect = "Welcome Back";
		String txtWelome = driver.findElement(By.className("author__meta")).getText();
		System.out.println(txtWelome);
		assertTrue(expect.contains(txtWelome));
	}
	
}
