package com.pom;



import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class SearchdropFunctionality extends TestBase {
	
	@FindBy(xpath="//input[@class='form-control appended-form-control search-bar-input']")
	WebElement searchbar;
	
	@FindBy(xpath="//div[@class='overflow-hidden position-relative']")
	List<WebElement> productlist;
	
	@FindBy(xpath="//button[@class='input-group-append-overlay search_button'][@type='submit'][@style=\"border-radius: 0px 7px 7px 0px; left: unset; right: 0;top:0\"]")
	WebElement searchbutton;
	
	public SearchdropFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void search() {
		searchbar.sendKeys(prop.getProperty("searchtext"));
		searchbutton.click();
		//String str=driver.getCurrentUrl();
		//Assert.assertEquals("https://e-quarz.com/products?name=iphone&data_from=search&page=1", str);
	}
	
	
	public void dropdown()  {
		searchbar.sendKeys(prop.getProperty("searchtext"));
		searchbutton.click();
		for(WebElement prodlist:productlist) {
			
			if(prodlist.getText().equals("Apple iPhone 14 Pro Max (256 GB) - Silver")) {
				prodlist.click();
				String str1=driver.getCurrentUrl();
				Assert.assertEquals("https://e-quarz.com/product/apple-iphone-14-pro-max-256-gb-silver-A8nyVh", str1);
			}
		}
	}
	

}
