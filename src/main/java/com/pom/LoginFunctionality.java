package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginFunctionality {
	
	@FindBy(name="user_id")
	WebElement user;
	
	@FindBy(name="password")
	WebElement passw;
	
	@FindBy(xpath="//button[text()='Sign in']")
	WebElement submit;
	
	@FindBy(xpath="//a[text()[normalize-space()='Forgot password?']]")
	public WebElement forgotPassword;
	
	@FindBy(id="remember")
	public WebElement rememberMe;
	
	@FindBy(xpath="//a[@class=\"btn btn-outline-primary\"]")
	public WebElement signupbutton;
	
	@FindBy(xpath="//i[@class='czi-eye password-toggle-indicator']")
	public WebElement showPassword;
	
	public LoginFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Forlogin(String username,String password) {
		user.sendKeys(username);
		passw.sendKeys(password);
		submit.click();
	}

	public void forgotPword() {
		forgotPassword.click();
}

   public void rememberme() {
	rememberMe.click();
	
}

   public void signupbutton() {
	signupbutton.click();
}

   public void showpassword() {
	showPassword.click();
}


}
