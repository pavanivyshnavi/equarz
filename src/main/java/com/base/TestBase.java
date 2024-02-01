package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	//we are going to take data from the configuration properties file and open the browser 
	//and set the configuration

	public static Properties prop;
	private static FileInputStream file;
	public static WebDriver driver;
	public String proppath="./src/main/java/configproperties/Configprop";

	public TestBase() {
		prop=new Properties();
		try {
			file=new FileInputStream(proppath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void Intialization() {
		String browsername=prop.getProperty("browser");

		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}	
	public static void Intialization1() {
		String browsername=prop.getProperty("browser");

		if(browsername.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			//WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("enter valid browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(12, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url1"));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}	

}
