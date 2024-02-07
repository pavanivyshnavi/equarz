package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;
import com.utils.Utils;

public class AddressFunctionality extends TestBase {
	
	Actions ac=new Actions(driver);
	Utils util=new Utils();
	
	@FindBy(xpath="//div[@class='navbar-tool-text']")
	WebElement dashboard;
	
	@FindBy(xpath="//a[text()=' My profile']")
	WebElement myprofile;
	
	@FindBy(xpath="//a[text()='Address ']")
	WebElement Address;
	
	@FindBy(id="add_new_address")
	WebElement AddnewAddress;
	
	@FindBy(xpath="//label[text()='Home']")
	WebElement Home;
	
	@FindBy(xpath="//label[text()='Shipping']")
	WebElement shipping;
	
	@FindBy(id="name")
	WebElement person_name;
	
	@FindBy(id="phone")
	WebElement phonenumber;
	
	@FindBy(id="address-city")
	WebElement city;
	
	@FindBy(id="zip")
	WebElement zipcode;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//textarea[@name='address']")
	WebElement address;
	
	@FindBy(xpath="//input[@id=\"pac-input\"]")
	WebElement searchhere;
	
	@FindBy(xpath="//button[text()='Add Informations  ']")
	WebElement addinfo;
	
	public AddressFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addaddress(String personname,String phonenum,String city1,String pincode,String Address1,String search) throws Throwable {
		ac.moveToElement(dashboard).build().perform();
		Thread.sleep(3000);
		myprofile.click();
		Address.click();
		AddnewAddress.click();
		Home.click();
		shipping.click();
		person_name.sendKeys(personname);
		phonenumber.sendKeys(phonenum);
		city.sendKeys(city1);
		zipcode.sendKeys(pincode);
		
		Select select=new Select(country);
		select.selectByVisibleText("India");
		
		address.sendKeys(Address1);
		searchhere.sendKeys(search);
		
		
		addinfo.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
