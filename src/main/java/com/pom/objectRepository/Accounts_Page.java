package com.pom.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Accounts_Page {
	@FindBy(xpath = "//a[@data-target='#supplierModal']")
	private WebElement createUserAccount;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::select[@name='empid']")
	private WebElement userEmpID;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::input[@name='username']")
	private WebElement userEmpName;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::input[@name='password']")
	private WebElement userEmpPassword;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-success']")
	private WebElement userSave;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-danger']")
	private WebElement userReset;
	@FindBy(xpath = "//form[@action='us_transac.php?action=add']/descendant::button[@class='btn btn-secondary']")
	private WebElement userCancel;
	@FindBy(xpath = "//div[@id='supplierModal']/descendant::span[.='×']")
	private WebElement userClose;
	@FindBy(xpath = "//input[@type='search']")
	private WebElement userSearch;
	
	//Initialization
	public Accounts_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public WebElement getCreateUserAccount() {
		return createUserAccount;
	}

	public WebElement getUserEmpID() {
		return userEmpID;
	}

	public WebElement getUserEmpName() {
		return userEmpName;
	}

	public WebElement getUserEmpPassword() {
		return userEmpPassword;
	}

	public WebElement getUserSave() {
		return userSave;
	}

	public WebElement getUserReset() {
		return userReset;
	}

	public WebElement getUserCancel() {
		return userCancel;
	}

	public WebElement getUserClose() {
		return userClose;
	}

	public WebElement getUserSearch() {
		return userSearch;
	}
	
	
	
}
