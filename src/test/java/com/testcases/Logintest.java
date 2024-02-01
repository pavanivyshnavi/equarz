package com.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.TestBase;
import com.pom.LoginFunctionality;
import com.utils.Utils;

public class Logintest extends TestBase {
	
	String Excelsheet_name="login";
	LoginFunctionality login;
	@DataProvider
	public String[][] datatest() throws Throwable {
		return Utils.setdata(Excelsheet_name);
	}
	@BeforeMethod
	public void setup() {
		Intialization();
		login=new LoginFunctionality(driver);
	}
	@Test(priority=1,dataProvider="datatest",dataProviderClass=Logintest.class)
	public void verifylogin(String username,String password) {
		login.Forlogin(username, password);

		String homepageurl=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/", homepageurl);
	}

	@Test
	public void forgotPasswordEnable() {
		boolean forgotPasswordPresence=login.forgotPassword.isEnabled();
		Assert.assertEquals(true, forgotPasswordPresence);

	}


	@Test
	public void verifyForgotPassword() {
		login.forgotPword();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/customer/auth/recover-password", url);
	}


	@Test
	public void verifyRememberme() {
		login.rememberme();	

	}

	@Test
	public void verifySignUp() {
		login.signupbutton();
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://e-quarz.com/customer/auth/sign-up", url);
	}
	@AfterMethod
	public void tearDown() {

		driver.close();
	}



}
