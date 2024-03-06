package com.pom.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.*;

public class Inventory_Page {
	//Declaration
	@FindBy(xpath = "//table[@id='dataTable']/tbody/tr[1]/td[3]")
	private WebElement inventQuantity;
	@FindBy(xpath = "//table[@id='dataTable']/tbody/tr[1]/td[1]")
	private WebElement inventPCode;
	@FindBy(xpath = "//input[@class='form-control form-control-sm']")
	private WebElement inventSearch;


	//Initialisation
	public Inventory_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	//Utilisation

	public WebElement getInventSearch() {
		return inventSearch;
	}
	public WebElement getInventQuantity() {
		return inventQuantity;
	}
	
	public WebElement getInventPCode() {
		return inventPCode;
	}



	//Business Logic
	public void checkQuantityinInventory(String Act_Prod_Quantity) {
		String exp_quantity = inventQuantity.getText();
		int exp_quan = Integer.parseInt(exp_quantity);
		int act_quan = Integer.parseInt(Act_Prod_Quantity);
		if (act_quan<exp_quan) {
			System.out.println("The product quantity is "+act_quan+" updated in the Inventory");
		}
		else {
			System.out.println("The product quantity is not updated in the Inventory");
		}
	}
	
	public void checkProductCreated(String P_Code) {
		inventSearch.sendKeys(P_Code);
		String Act_P_Code = inventPCode.getText();
		assertEquals(Act_P_Code, P_Code);
		System.out.println("Product created displayed in Inventory");
//		if (Act_P_Code.equals(P_Code)) {
//			System.out.println("Product created displayed in Inventory");
//		}
		
	}




}
