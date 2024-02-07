package com.pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.TestBase;

public class HomepageLinks extends TestBase  {
	
	@FindBy(xpath="//img[@src=\"https://e-quarz.com/public/assets/front-end/png/about company.png\"]")
	WebElement aboutcompany;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homepage;
	
	@FindBy(xpath="//img[@src=\"https://e-quarz.com/public/assets/front-end/png/contact us.png\"]")
	WebElement contactus;
	
	@FindBy(xpath="//img[@src=\"https://e-quarz.com/public/assets/front-end/png/faq.png\"]")
	WebElement FAQ;
	
	@FindBy(xpath="//a[text()='Featured Products']")
	WebElement featuredproducts;
	
	@FindBy(xpath="//a[text()='Latest Products']")
	WebElement latestproducts;
	
	@FindBy(xpath="//a[text()='Best Selling Products']")
	WebElement bestsellingproducts;
	
	@FindBy(xpath="//a[text()='Top Rated Products']")
	WebElement Topratedproducts;
	
	@FindBy(xpath="//a[text()='Profile Info']")
	WebElement profileinfo;
	
	@FindBy(xpath="//a[text()='Track Order']")
	WebElement trackorder;
	
	@FindBy(xpath="//a[text()='Refund policy']")
	WebElement refundpolicy;
	
	@FindBy(xpath="//a[text()='Return policy']")
	WebElement returnpolicy;
	
	@FindBy(xpath="//a[text()='Cancellation policy']")
	WebElement cancellationpolicy;
	
	@FindBy(xpath="//i[@class=\"fa fa-user-o m-2\"]")
	WebElement support;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement Termsandcond;
	
	@FindBy(xpath="//a[@href=\"https://e-quarz.com/privacy-policy\"]")
	WebElement privacypolicy;
	
	@FindBy(xpath="//a[@class='navbar-brand d-none d-sm-block mr-3 flex-shrink-0 __min-w-7rem']")
	WebElement equarzlogo;
	
	public HomepageLinks(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void aboutcompanytest() {
		aboutcompany.click();
		String str=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/about-us", str);
		}
	
	public void contactustest() {
		contactus.click();
		String str1=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/contacts", str1);
		
	}
	public void FAQtest() {
		FAQ.click();
		String str2=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/helpTopic", str2);
	}
	
	public void featuredproductstest() {
		featuredproducts.click();
		String str3=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/products?data_from=featured&page=1", str3);
	}
	public void latestproductstest() {
		latestproducts.click();
		String str4=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/products?data_from=latest&page=1", str4);
	}
	public void bestsellingproductstest() {
		bestsellingproducts.click();
		String str5=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/products?data_from=best-selling&page=1", str5);
	}
	public void Topratedproductstest() {
		Topratedproducts.click();
		String str6=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/products?data_from=top-rated&page=1", str6);
	}
	public void profileinfotest() {
		profileinfo.click();
		String str7=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/user-account", str7);
	}
	public void trackordertest() {
		trackorder.click();
		String str8=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/track-order", str8);
	}
	public void refundpolicytest() {
		refundpolicy.click();
		String str9=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/refund-policy", str9);
	}
	public void returnpolicytest() {
		returnpolicy.click();
		String str10=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/return-policy", str10);
	}
	public void cancellationpolicytest() {
		cancellationpolicy.click();
		String str11=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/cancellation-policy", str11);
	}
	public void supporttest() {
		support.click();
		String str12=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/account-tickets", str12);
	}
	public void Termsandcondtest() {
		Termsandcond.click();
		String str13=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/terms", str13);
	}
	public void privacypolicytest() {
		privacypolicy.click();
		String str14=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/privacy-policy", str14);
	}
	public void equarzlogotest() {
		equarzlogo.click();
		String str15=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/", str15);
	}
	
}
