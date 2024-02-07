package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;
import com.utils.Utils;

public class ProfileFunctionality extends TestBase {
	Actions ac=new Actions(driver);
	Utils util=new Utils();
	
	@FindBy(xpath="//small[text()='Hello, vyshnavi']")
	WebElement dashboard;
	
	@FindBy(xpath="//a[text()=' My profile']")
	WebElement profile;
	
	@FindBy(id="f_name")
	WebElement first_name;
	
	@FindBy(id="l_name")
	WebElement last_name;
	
	@FindBy(id="id=\"account-email\"")
	WebElement email;
	
	@FindBy(id="phone")
	WebElement phone;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="confirm_password")
	WebElement confirm_password;
	
	@FindBy(xpath="//button[text()='Update   ']")
	WebElement update;
	
	@FindBy(xpath="//label[@class='spandHeadO m-0']")
	WebElement image;
	
	@FindBy(xpath="//div[text()='Updated successfully']")
	WebElement success;
	
	public ProfileFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void profile_edit(String fname,String lname,String mail,String num,String password1,String conpassword) throws Throwable {
		ac.moveToElement(dashboard).build().perform();
		Thread.sleep(3000);
		
		profile.click();
		
		first_name.clear();
		Thread.sleep(2000);
		first_name.sendKeys(fname);
		
		last_name.clear();
		last_name.sendKeys(lname);
		
		phone.clear();
		phone.sendKeys(num);
		
		password.sendKeys(password1);
		confirm_password.sendKeys(conpassword);
		
		update.click();
		
		String str=success.getText();
		Assert.assertEquals(str, "Updated successfully");
		
		
		
	}
	

}
