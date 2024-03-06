package com.pom.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POS_Employee_Page {
	//Declaration
		@FindBy(xpath = "//a[.='Keyboard']")
		private WebElement keyboardPOS;
		@FindBy(xpath = "//a[.='Mouse']")
		private WebElement mousePOS;
		@FindBy(xpath = "//a[.='Headset']")
		private WebElement headsetPOS;
		@FindBy(xpath = "//a[.='CPU']")
		private WebElement cpuPOS;
		@FindBy(xpath = "//a[.='Monitor']")
		private WebElement monitorPOS;
		@FindBy(xpath = "//a[.='Motherboard']")
		private WebElement motherboardPOS;
		@FindBy(xpath = "//a[.='Processor']")
		private WebElement processorPOS;
		@FindBy(xpath = "//a[.='Power Supply']")
		private WebElement powerSupplyPOS;
		@FindBy(xpath = "//a[.='Others']")
		private WebElement othersPOS;
		@FindBy(xpath = "//button[.='SUBMIT']")
		private WebElement submitPOS;
		@FindBy(xpath = "//div[@class='btn bg-gradient-danger btn-danger']")
		private WebElement deletePOS;
		@FindBy(xpath = "//a[@data-target='#poscustomerModal']")
		private WebElement POScreateCus;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::input[@name='firstname']")
		private WebElement POSCusFN;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::input[@name='lastname']")
		private WebElement POSCusLN;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::input[@name='phonenumber']")
		private WebElement POSCusPhonenumber;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[@class='btn btn-success']")
		private WebElement POSCusSave;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[@class='btn btn-danger']")
		private WebElement POSCusReset;
		@FindBy(xpath = "//form[@action='cust_pos_trans.php?action=add']/descendant::button[@class='btn btn-secondary']")
		private WebElement POSCusCancel;
		@FindBy(xpath = "//div[@id='poscustomerModal']/descendant::span[.='×']")
		private WebElement POSCusClose;
		@FindBy(xpath = "//select[@name='customer']")
		private WebElement POSselectCus;
		@FindBy(xpath = "//input[@placeholder='ENTER CASH']")
		private WebElement POSEnterCash;
		@FindBy(xpath = "//button[.='PROCEED TO PAYMENT']")
		private WebElement POSpayment;
		@FindBy(xpath = "//div[@id='posMODAL']/descendant::span[.='×']")
		private WebElement POSpaymentClose;
		@FindBy(xpath = "//h3[@class='font-weight-bold py-3 bg-light']")
		private WebElement POSgrandPrice;
		
		//Initialisation
		public POS_Employee_Page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}

		public WebElement getKeyboardPOS() {
			return keyboardPOS;
		}

		public WebElement getMousePOS() {
			return mousePOS;
		}

		public WebElement getHeadsetPOS() {
			return headsetPOS;
		}

		public WebElement getCpuPOS() {
			return cpuPOS;
		}

		public WebElement getMonitorPOS() {
			return monitorPOS;
		}

		public WebElement getMotherboardPOS() {
			return motherboardPOS;
		}

		public WebElement getProcessorPOS() {
			return processorPOS;
		}

		public WebElement getPowerSupplyPOS() {
			return powerSupplyPOS;
		}

		public WebElement getOthersPOS() {
			return othersPOS;
		}

		public WebElement getSubmitPOS() {
			return submitPOS;
		}

		public WebElement getDeletePOS() {
			return deletePOS;
		}

		public WebElement getPOScreateCus() {
			return POScreateCus;
		}

		public WebElement getPOSCusFN() {
			return POSCusFN;
		}

		public WebElement getPOSCusLN() {
			return POSCusLN;
		}

		public WebElement getPOSCusPhonenumber() {
			return POSCusPhonenumber;
		}

		public WebElement getPOSCusSave() {
			return POSCusSave;
		}

		public WebElement getPOSCusReset() {
			return POSCusReset;
		}

		public WebElement getPOSCusCancel() {
			return POSCusCancel;
		}

		public WebElement getPOSCusClose() {
			return POSCusClose;
		}

		public WebElement getPOSselectCus() {
			return POSselectCus;
		}

		public WebElement getPOSEnterCash() {
			return POSEnterCash;
		}

		public WebElement getPOSpayment() {
			return POSpayment;
		}

		public WebElement getPOSpaymentClose() {
			return POSpaymentClose;
		}

		public WebElement getPOSgrandPrice() {
			return POSgrandPrice;
		}
		

}
