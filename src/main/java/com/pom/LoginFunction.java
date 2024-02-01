package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.TestBase;

public class LoginFunction extends TestBase {

	@FindBy (id="si-email")
	WebElement user;

	@FindBy (id="si-password")
	WebElement password;

	@FindBy (xpath="//button[text()='Sign in']")
	WebElement signin;

	public  LoginFunction(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public Homepage dologin() {
		user.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		signin.click();

		return new Homepage();

}

}
