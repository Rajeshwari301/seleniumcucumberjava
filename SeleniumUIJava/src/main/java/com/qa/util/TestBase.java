package com.qa.util;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

//import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {

	 public static WebDriver driver;
	 public static Properties prop;

	public TestBase() {
		
			prop = new Properties();
			FileInputStream fis = null;
			
			try {
				fis = new FileInputStream("/Users/rajeshwarimahadevan/eclipse-workspace/SeleniumUIJava/src/main/java/com/qa/properties/config.properties");
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
 

	public static void initialization() throws IOException {
		
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/rajeshwarimahadevan/eclipse-workspace/chromedriver-mac-x64/chromedriver");
			//System.setProperty("webdriver.http.factory", "jdk-http-client");
			 //ChromeOptions option = new ChromeOptions();
	          //option.addArguments("--remote-allow-origins=*");
	          //WebDriverManager.chromedriver().setup();
	            driver = new ChromeDriver();
		   
			
		}
		else if (browsername.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "/Users/rajeshwarimahadevan/eclipse-workspace/chromedriver");
			driver = new FirefoxDriver();

		}
	

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));


	}
	
}


