package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.util.TestBase;

public class loginpage extends TestBase {

	

	@FindBy(name="username")
	WebElement username;

	@FindBy(name ="password")
	WebElement password;

	@FindBy(xpath = "//a[@href='/login']")
	WebElement formactionlink;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginbtn;

	@FindBy(xpath = "//a[@href='/logout']")
	WebElement logoutbtn;


	public loginpage()  {
		PageFactory.initElements(driver, this);
	}


	public String validatepagetitle() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver.getTitle();


	}


	public void enteruserandpass() {
		//driver.findElement(By.name("username")).sendKeys(prop.getProperty("username"));
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginbtn.click();

	}

	public void logsout() {
		logoutbtn.click();
		return;
	}
}
