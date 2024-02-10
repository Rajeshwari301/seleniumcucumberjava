package com.qa.stepdefinition;

import com.qa.util.TestBase;

import com.qa.pages.*;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class logintest extends TestBase {
	
	loginpage page;
	
	public logintest() {
		super();
	}

	
	

	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {

		TestBase.initialization();
		page = new loginpage();


	}

	@When("^title of login page is OrangeHRM$")
	public void title_of_login_page_is_OrangeHRM() throws Throwable {

		String title = page.validatepagetitle();
		System.out.println(title);
	}


	@Then("^user enters username and password$")
	public void user_enters_username_and_password() throws Throwable {
	    page.enteruserandpass();

	}

	

	}






