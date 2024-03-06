package com.pom.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Instagram_Login_Page {
@FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
private WebElement userName;
@FindBy(xpath = "//input[@aria-label='Password']")
private WebElement password;
@FindBy(xpath = "//button[@class=' _acan _acap _acas _aj1- _ap30']")
private WebElement login;


public Instagram_Login_Page(WebDriver driver) {
	PageFactory.initElements(driver, this);
}


public WebElement getUserName() {
	return userName;
}


public WebElement getPassword() {
	return password;
}


public WebElement getLogin() {
	return login;
}

//Business Logic
public void Login(String UN, String pass) {
	userName.sendKeys(UN);
	password.sendKeys(pass);
	login.click();
}
}
