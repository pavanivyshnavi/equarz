package com.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.HomepageLinks;
import com.pom.LoginFunction;

public class Homepagelinkstest extends TestBase{
	LoginFunction login;
	HomepageLinks Hpl;
	
	public Homepagelinkstest() {
		super();
	}
	
	@BeforeMethod
	public void setup() throws Throwable {
		Intialization();
		login=new LoginFunction(driver);
		Hpl=new HomepageLinks(driver);
		login.dologin();
		Thread.sleep(3000);
		JavascriptExecutor jse= (JavascriptExecutor) driver;  
		jse.executeScript("window.scrollTo(0,200)");
		}
	
	@Test(priority=1)
	public void verifyaboutcompany() {
		Hpl.aboutcompanytest();
	}
	@Test(priority=2)
	public void verifycontactus() {
		Hpl.contactustest();
		
	}
	@Test(priority=3)
	public void verifyfaq() {
		Hpl.FAQtest();
	}
    @Test(priority=4)
    public void verifyfeaturedproducts() {
    	Hpl.featuredproductstest();
    }
    @Test(priority=5)
    public void verifyLatestproducts() {
    	Hpl.latestproductstest();
    }
    @Test(priority=6)
    public void verifybestsellingproducts() {
    	Hpl.bestsellingproductstest();
    	
    }
    @Test(priority=7)
    public void verifyTopratedproducts() {
    	Hpl.Topratedproductstest();
    }
    @Test(priority=8)
    public void verifyprofileinfo() {
    	Hpl.profileinfotest();
    }
    @Test(priority=9)
    public void verifytrackorder() {
    	Hpl.trackordertest();
    }
    @Test(priority=10)
    public void verifyrefundpolicy() {
    	Hpl.refundpolicytest();
    }
    @Test(priority=11)
    public void verifyreturnpolicy() {
    	Hpl.returnpolicytest();
    }
    @Test(priority=12)
    public void verifycancellationpolicy() {
    	Hpl.cancellationpolicytest();
    }
    @Test(priority=13)
    public void verifysupport() {
    	Hpl.supporttest();
    }
    @Test(priority=14)
    public void verifytermsndcon(){
    	Hpl.Termsandcondtest();
    	
    }
    @Test(priority=15)
    public void verifyprivacypolicy() {
    	Hpl.privacypolicytest();
    }
    @Test(priority=16)
    public void verifylogo() {
    	Hpl.equarzlogotest();
    }
        @BeforeMethod
    public void teardown() {
    	driver.close();
    }
}
