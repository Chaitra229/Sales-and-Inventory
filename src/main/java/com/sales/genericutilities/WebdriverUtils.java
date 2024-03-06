package com.sales.genericutilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils {
/**
 * This method will load all the elements in the web page
 * @Chaitra L
 * @param driver
 * @param sec
 */
public void waitforPageLoad(WebDriver driver, int sec) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
/**
 * This method will maximise the browser
 * @param driver
 */
public void maximizeWindow(WebDriver driver) {
	driver.manage().window().maximize();
}
/**
 * This method will minimise the browser
 * @param driver
 */
public void minimizeWindow(WebDriver driver) {
	driver.manage().window().minimize();
}
/**
 * This method is and object of WebdriverWait
 * @Chaitra L
 * @param driver
 * @param sec
 * @return
 */
public WebDriverWait webDriverWaitObj(WebDriver driver, int sec) {
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(sec));
	return wait;
}
/**
 * This method will wait until the element is visible
 * @param driver
 * @param sec
 * @param ele
 */
public void elementToBeVisible(WebDriver driver, int sec, WebElement ele)
{
	webDriverWaitObj(driver, sec).until(ExpectedConditions.visibilityOf(ele));
}
/**
 * This method will wait until the element is clickable
 * @Chaitra L
 * @param driver
 * @param sec
 * @param ele
 */
public void elementToBeClickable(WebDriver driver, int sec, WebElement ele) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.elementToBeClickable(ele));
}
/**
 * This method will wait until the alert is present
 * @param driver
 * @param sec
 */
public void alertIsPresent(WebDriver driver,int sec) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.alertIsPresent());
}
/**
 * This method will wait until the element is selected
 * @param driver
 * @param sec
 * @param ele
 */
public void elementToBeselected(WebDriver driver, int sec, WebElement ele) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.elementToBeSelected(ele));
}
/**
 * This method will wait until the frame is available and it will switch to the frame
 * @param driver
 * @param sec
 * @param ele
 */
public void frameAvailableandSwitch(WebDriver driver, int sec, WebElement ele) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ele));
}
/**
 * This method will wait until the title contains the given string
 * @param driver
 * @param sec
 * @param title
 */
public void titleContains(WebDriver driver, int sec,String title) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.titleContains(title));
}
/**
 * This method will wait until the url contains the given string
 * @param driver
 * @param sec
 * @param url
 */
public void urlContains(WebDriver driver, int sec, String url) {
	webDriverWaitObj(driver, sec).until(ExpectedConditions.urlContains(url));
}
/**
 * This method is an object created for select class
 * @param ele
 * @return
 */
public Select dropdownObj(WebElement ele) {
	Select sel=new Select(ele);
	return sel;
}
/**
 * This method will select the dropdown option based on the given index
 * @param ele
 * @param index
 */
public void selectDropDown(WebElement ele, int index) {
	dropdownObj(ele).selectByIndex(index);
}
/**
 * This method will select the dropdown option based on the given value
 * @param ele
 * @param value
 */
public void selectDropDown(WebElement ele, String value) {
	dropdownObj(ele).selectByValue(value);
}
/**
 * This method will select the dropdown option based on the VisibleText
 * @param text
 * @param ele
 */
public void selectDropDown(String text,WebElement ele) {
	dropdownObj(ele).selectByVisibleText(text);
}
/**
 * This method will deselect the selected option based on index
 * @param ele
 * @param index
 */
public void deselectDropDown(WebElement ele, int index) {
	dropdownObj(ele).deselectByIndex(index);
}
/**
 * This method will deselect the selected option based on the given value
 * @param ele
 * @param value
 */
public void deselectDropDown(WebElement ele, String value) {
	dropdownObj(ele).deselectByValue(value);
}
/**
 * This method will deselect the selected option based on the VisibleText
 * @param text
 * @param ele
 */
public void deselectDropDown(String text,WebElement ele) {
	dropdownObj(ele).deselectByVisibleText(text);
}
/**
 * This method will deselect all the selected options in dropdown
 * @param ele
 */
public void deselectDropDown(WebElement ele) {
	dropdownObj(ele).deselectAll();
}
/**
 * This method will get all selected options from the dropdown
 * @param ele
 * @return
 */
public List<WebElement> getAllSelectedDD(WebElement ele) {
	List<WebElement> Selectedoptions = dropdownObj(ele).getAllSelectedOptions(); 
	return Selectedoptions;
}
/**
 * This method will get the first selected options from the dropdown
 * @param ele
 * @return
 */
public WebElement getFirstSelecteDD(WebElement ele) {
	WebElement firstOption = dropdownObj(ele).getFirstSelectedOption();
	return firstOption;
}
/**
 * This method will get all the options from the dropdown
 * @param ele
 * @return
 */
public List<WebElement> getAllDDOption(WebElement ele) {
	List<WebElement> allOptions = dropdownObj(ele).getOptions();
	return allOptions;
}
/**
 * This method is an object created for Actions class
 * @param driver
 * @return
 */
public Actions actionsObj(WebDriver driver) {
	Actions act=new Actions(driver);
	return act;
}
/**
 * This method will drag and drop the element from one location to another specified location
 * @param driver
 * @param src
 * @param dst
 */
public void dragAndDrop(WebDriver driver, WebElement src, WebElement dst) {
	actionsObj(driver).dragAndDrop(src, dst).perform();
}
/**
 * This method will click and hold on the specified element
 * @param driver
 * @param ele
 */
public void clickAndHold(WebDriver driver, WebElement ele) {
	actionsObj(driver).clickAndHold(ele).perform();
}
/**
 * This method will mouseHover to a specified element
 * @param driver
 * @param ele
 */
public void mouseHover(WebDriver driver, WebElement ele) {
	actionsObj(driver).moveToElement(ele).perform();
}
/**
 * This method will right click on a specified element
 * @param driver
 * @param ele
 */
public void rightClick(WebDriver driver, WebElement ele) {
	actionsObj(driver).contextClick(ele).perform();
}
/**
 * This method will double click on a particular specified element
 * @param driver
 * @param ele
 */
public void doubleClick(WebDriver driver, WebElement ele) {
	actionsObj(driver).doubleClick(ele).perform();
}
/**
 * This method will double click on a web page
 * @param driver
 */
public void doubleClickOnWebPage(WebDriver driver) {
	actionsObj(driver).doubleClick().perform();
}
/**
 * This method will right click on a web page
 * @Chaitra L
 * @param driver
 */
public void rightClickOnWebPage(WebDriver driver) {
	actionsObj(driver).contextClick().perform();
}
/**
 * This method will press enter key
 * @Chaitra L
 * @param driver
 */
public void enterKeyPress(WebDriver driver) {
	actionsObj(driver).sendKeys(Keys.ENTER).perform();
}
/**
 * This method is an object created for Robot class
 * @return
 * @throws AWTException
 */
public Robot robotObj() throws AWTException {
	Robot rb=new Robot();
	return rb;
}
/**
 * This method will press enter key
 * @throws AWTException
 */
public void enterKey() throws AWTException {
	robotObj().keyPress(KeyEvent.VK_ENTER);
}
/**
 * This method will release the enter key
 * @throws AWTException
 */
public void enterRelease() throws AWTException {
	robotObj().keyRelease(KeyEvent.VK_ENTER);
}
/**
 * This method will switch the frame based on the index passed
 * @param driver
 * @param index
 */
public void switchToFrame(WebDriver driver, int index) {
	driver.switchTo().frame(index);
}
/**
 * This method will switch the frame based on the name or Id passed
 * @param driver
 * @param nameorID
 */
public void switchToFrame(WebDriver driver, String nameorID) {
	driver.switchTo().frame(nameorID);
}
/**
 * This method will switch the frame based on the element address
 * @param driver
 * @param ele
 */
public void switchToFrame(WebDriver driver, WebElement ele) {
	driver.switchTo().frame(ele);
}
/**
 * This method will accept the alert popup
 * @param driver
 */
public void acceptAlert(WebDriver driver) {
	driver.switchTo().alert().accept();
}
/**
 * This method will cancel the alert popup
 * @param driver
 */
public void dismissAlert(WebDriver driver) {
	driver.switchTo().alert().dismiss();
}
/**
 * This method will send the values to the prompt box popup
 * @param driver
 * @param text
 */
public void sendToAlert(WebDriver driver, String text) {
	driver.switchTo().alert().sendKeys(text);
}
/**
 * This method will get the text of the alert popup
 * @param driver
 * @return
 */
public String getTextFromAlert(WebDriver driver) {
	String alertText = driver.switchTo().alert().getText();
	return alertText;
}
/**
 * This method is used to switch to the specific window
 * @param driver
 * @param partialWinTitle
 */
public void switchToWindow(WebDriver driver, String partialWinTitle) {
	Set<String> windows = driver.getWindowHandles();
	Iterator<String> it = windows.iterator();
	while(it.hasNext())
	{
		String winID = it.next();
		String currentWinTitle = driver.switchTo().window(winID).getTitle();
		if (currentWinTitle.contains(partialWinTitle)) {
			break;
		}
	}
}
/**
 * This method will take screenshot and store in folder called screenshot
 * @param driver
 * @param screenShotName
 * @return
 * @throws IOException
 */
public static String getScreenShot(WebDriver driver, String screenShotName) throws IOException {
	JavaUtils jlib = new JavaUtils();
	String FailedTCName = screenShotName+jlib.systemDateFormat("dd-MM-YYYY HH-mm-ss");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File src = ts.getScreenshotAs(OutputType.FILE);
	String path="./screenshot/"+FailedTCName+".png";
	File dst = new File(path);
	String srcPath = dst.getAbsolutePath();
	FileUtils.copyFile(src, dst);
	return srcPath;
}
/**
 * This method will perform random scroll
 * @Chaitra L
 * @param driver
 * @param x
 * @param y
 */
public void scrollAction(WebDriver driver, int x, int y) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy("+x+","+y+")", "");
}
/**
 * This method will scroll until the specified element is found
 * @param driver
 * @param ele
 */
public void scrollToElement(WebDriver driver, WebElement ele) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	int y = ele.getLocation().getY();
	int x = ele.getLocation().getX();
	js.executeScript("window.scrollBy("+x+","+y+")", "");
}
/**
 * This method will scroll to the specified element
 * @param ele
 * @param driver
 */
public void scrollToElement(WebElement ele,WebDriver driver) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("argument[0].scrollIntoView", ele);
}
}
