package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.base.TestBase;

public class WishListFunctionality extends TestBase {
	

	@FindBy(xpath="//div[@class='d-flex d-block']//a[@href=\"https://e-quarz.com/product/water-bottle-nqMmRX\"]")
	WebElement waterbottle;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o ']")
	WebElement bottlewishlist;
	
	@FindBy(xpath="//a[text()='Home']")
	WebElement homebutton;
	
	@FindBy(xpath="//div[@class='d-flex d-block']//a[@href=\"https://e-quarz.com/product/trustbasket-organic-manure-combo-of-vermicompost-5kg-and-cocopeat-5kg-for-all-type-plants-green-bpjBid\"]")
	WebElement vermicompost;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o ']")
	WebElement vermiwishlist;
	
	@FindBy(xpath="//a[@href=\"https://e-quarz.com/products?id=4&data_from=brand&page=1\"][@class='__brand-item']")
	WebElement applebrand;
	
	@FindBy(xpath="//img[@src=\"https://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-6493ff79ce7a6.png\"]")
	WebElement iphone;
	
	@FindBy(xpath="//i[@class='fa fa-heart-o ']")
	WebElement iphonewishlist;
	
	@FindBy(xpath="//i[@class='navbar-tool-icon czi-heart']")
	WebElement wishlist;
	
	@FindBy(xpath="//i[@onclick=\"removeWishlist('1564')\"]")
	WebElement removevermi;
	
	@FindBy(xpath="//a[@class=\"d-block h-100\"][@href=\"https://e-quarz.com/product/water-bottle-nqMmRX\"]")
	WebElement buybottle;
	
	@FindBy(xpath="//span[text()='Buy now']")
	WebElement buynow;
	
	
	
	
	
	
	
	
	
	@FindBy(xpath="//span[@class='countWishlist']")
	WebElement wishcount;
	
	
	public WishListFunctionality(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public void bottle() {
		waterbottle.click();
		bottlewishlist.click();
	}
	public void homepage() {
		homebutton.click();
	}
	
	public void compost() {
		vermicompost.click();
		vermiwishlist.click();
	}
	public void iphone() {
		applebrand.click();
		iphone.click();
		iphonewishlist.click();
	}
	
	
	public void wishlistremove() {
		wishlist.click();
		removevermi.click();
	}
	
	
	public void wishlistcount() {
		String str=wishcount.getText();
		System.out.println(str);
	}
	
	public void buynow_functionality() {
		wishlist.click();
		buybottle.click();
		buynow.click();
	}
}
