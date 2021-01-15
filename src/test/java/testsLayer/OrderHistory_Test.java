package testsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class OrderHistory_Test extends TestSet {

	@Test
	public void TC_81_Order_History_page() throws InterruptedException, IOException {
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();

		getOrderHistory_page().getOrderHisLink().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img26.png"));
		
	}

	@Test
	public void TC_82_Order_History_page_select_any_year_from_last_10years() throws InterruptedException, IOException {
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();

		getOrderHistory_page().getOrderHisLink().click();
		getOrderHistory_page().selectYear();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img27.png"));
		
	}

	@Test
	public void TC_83_Order_history_noOrder_placed() throws Throwable {
		String expectedText="You currently have no orders to display.";
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getSignInUsername().sendKeys("ankitdj888@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("Ankit12#");
		getCreateAccount_page().getSignInButton().click();
		Thread.sleep(3000);
		getCreateAccount_page().getMyAccountLink().click();
		getOrderHistory_page().getOrderHisLink().click();
		getOrderHistory_page().getNoOrders().getText();
		Assert.assertTrue(	getOrderHistory_page().getNoOrders().getText().contains(expectedText));
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img28.png"));
		
	}
	
	@Test
	public void TC_84_Order_History_Start_Shopping_link() throws InterruptedException, IOException
	{
		String expectedURL="https://www.walmart.ca/en";
		String expectedText="You currently have no orders to display.";
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getSignInUsername().sendKeys("ankitdj888@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("Ankit12#");
		getCreateAccount_page().getSignInButton().click();
		Thread.sleep(3000);
		getCreateAccount_page().getMyAccountLink().click();
		getOrderHistory_page().getOrderHisLink().click();
		getOrderHistory_page().getStartshoppingLink().click();
	    String actualURL=driver.getCurrentUrl();
	    Assert.assertEquals(actualURL, expectedURL); 
	    File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img29.png"));
		
	}
}