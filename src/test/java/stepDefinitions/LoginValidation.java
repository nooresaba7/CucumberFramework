package stepDefinitions;



import org.openqa.selenium.WebDriver;

import CommonFunctions.CommonFunctions;
import cucumber.api.java.en.When;

public class LoginValidation {
WebDriver driver;
	@When("^Open Browser$")
	public void open_Browser() throws Throwable {
	  driver=CommonFunctions.startBrowser("chrome");
	}

	@When("^Open Application$")
	public void open_Application() throws Throwable {
	  CommonFunctions.openApplication(driver);  
	}

	@When("^wait for Username$")
	public void wait_for_Username() throws Throwable {
	    CommonFunctions.waitForElement(driver, "id","username", "10");
	}

	@When("^Enter Username$")
	public void enter_Username() throws Throwable {
	   CommonFunctions.typeAction(driver, "name", "username", "admin");
	}

	@When("^Wait for password$")
	public void wait_for_password() throws Throwable {
	  CommonFunctions.waitForElement(driver, "name", "password", "20"); 
	}

	@When("^Enter Password$")
	public void enter_Password() throws Throwable {
	  CommonFunctions.typeAction(driver, "name","password", "master");
	}

	@When("^Click on login$")
	public void click_on_login() throws Throwable {
	    CommonFunctions.clickAction(driver,"id", "btnsubmit");
	}

	@When("^wait for logout$")
	public void wait_for_logout() throws Throwable {
	  CommonFunctions.waitForElement(driver, "id", "logout", "10"); 
	}

	@When("^click on logout$")
	public void click_on_logout() throws Throwable {
	  CommonFunctions.clickAction(driver, "id", "logout");
	}

	@When("^wait for OK$")
	public void wait_for_OK() throws Throwable {
	   CommonFunctions.waitForElement(driver, "xpath","//button[contains(text(),'OK!')]", "10");
	}

	@When("^click on OK$")
	public void click_on_OK() throws Throwable {
	 CommonFunctions.clickAction(driver, "xpath", "//button[contains(text(),'OK!')]"); 
	}

	@When("^CloseBrowser$")
	public void closebrowser() throws Throwable {
	   CommonFunctions.closeBrowser(driver);
	}


	}
