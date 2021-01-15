package testsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class MyAccount_Test extends TestSet {
	
	JavascriptExecutor jse = (JavascriptExecutor)driver;

	@Test
	public void TC_36_My_Account_page_shipping_num() throws InterruptedException, IOException
	{
		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(3000);
		getMyAccount_page().getViewAllOrder().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img30.png"));
		
	}
	
	
	@Test
	public void TC_39_My_account_page_modification_of_orders_with_valid_ordernum() throws InterruptedException, IOException
	{
		
		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(3000);
		getMyAccount_page().getViewAllOrder().click();
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",getMyAccount_page().getManageOrderLink());		
		getMyAccount_page().getManageOrderLink().click();
		Thread.sleep(2000);
		getMyAccount_page().getMakeReturnLink().click();
		Thread.sleep(2000);
		getMyAccount_page().getContinueButton().click();
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();",getMyAccount_page().getCheckbox4());			
		getMyAccount_page().getCheckbox4().click();
		Thread.sleep(2000);
		getMyAccount_page().selectOptipondropdown();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img31.png"));
		
		
		
	}

	@Test
	public void TC_40_My_account_page_modification_of_orders_with_Invalid_ordernum() throws InterruptedException, IOException
	{
		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		WebDriverWait wait=new WebDriverWait(driver,30);
		
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(3000);
		getMyAccount_page().getViewAllOrder().click();
		Thread.sleep(1000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].scrollIntoView();",getMyAccount_page().getManageOrderLink());		
		getMyAccount_page().getManageOrderLink().click();
		Thread.sleep(2000);
		getMyAccount_page().getMakeReturnLink().click();
		Thread.sleep(2000);
		getMyAccount_page().getContinueButton().click();
		Thread.sleep(2000);
		jse.executeScript("arguments[0].scrollIntoView();",getMyAccount_page().getCheckbox4());			
		getMyAccount_page().getCheckbox4().click();
		Thread.sleep(2000);
		getMyAccount_page().selectOptipondropdown();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img31.png"));
		
		
	}
	@Test
	public void TC_41_My_account_page_clickOn_view_order() throws InterruptedException, IOException
	{

		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(3000);
		getMyAccount_page().getViewAllOrder().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img33.png"));
		
	}

	
	
	



}


