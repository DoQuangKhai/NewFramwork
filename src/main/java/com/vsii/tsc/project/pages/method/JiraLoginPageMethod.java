package com.vsii.tsc.project.pages.method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.vsii.tsc.core.utility.TestBase;
import com.vsii.tsc.project.pages.JiraLoginPage;

public class JiraLoginPageMethod extends TestBase {
//	// Create new Web Driver variable
//	WebDriver driver;
	// Create new WebElementLogin object
	public JiraLoginPage objJiraLoginPage = new JiraLoginPage();

	// Initialize all web element
	public JiraLoginPageMethod(WebDriver driver) {
		TestBase.driver = driver;
		PageFactory.initElements(driver, objJiraLoginPage);
	}

	// Enter username 
	public void setJiraUsrName(String txtJiraUsrName) {
		objJiraLoginPage.getWebUsername().sendKeys(txtJiraUsrName);
	}
	
	// Enter password
	public void setJiraPass(String txtJiraPass){
		objJiraLoginPage.getWebPassword().sendKeys(txtJiraPass);
	}
	
	// Click remember
	public void clickRemember(){
		objJiraLoginPage.getWebRemember().click();
	}
	
	// Click login
	public void clickLogin(){
		objJiraLoginPage.getWebLogin().click();
	}
	
	// PERFORM LOGIN OPERATION
	public void Login(String username, String password) {
		
		setJiraUsrName(username);

		setJiraPass(password);

		clickRemember();

		clickLogin();

	}
	
}
