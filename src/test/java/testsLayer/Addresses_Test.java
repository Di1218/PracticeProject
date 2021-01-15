package testsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class Addresses_Test extends TestSet {

	@Test
	public void TC_42_Addresses_page_add_address_with_valid_data() throws InterruptedException {

		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 200);");
		getAddresses_page().getAdresseslink().click();
		Thread.sleep(4000);

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getAddresses_page().getFn())).sendKeys("dipali");
		getAddresses_page().getLn().sendKeys("raaaana");
		// getAddresses_page().getShippingAdrs().sendKeys("700 king street, London
		// Ontario, N5W 0A6");
		getAddresses_page().getShippingcity().sendKeys("london");
		getAddresses_page().selectProvince();
		getAddresses_page().getShippingpostalcd().sendKeys("N5W 0A6");
		getAddresses_page().getShippingphn().sendKeys("5192517474");
		jse.executeScript("arguments[0].scrollIntoView();", getAddresses_page().getSaveAddressbtn());
		getAddresses_page().getSaveAddressbtn().click();
	}

	@Test
	public void TC_43_Addresses_page_add_address_with_Invalid_data() throws InterruptedException {
		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 200);");
		getAddresses_page().getAdresseslink().click();
		Thread.sleep(4000);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(getAddresses_page().getFn())).sendKeys("d@34");
		getAddresses_page().getLn().sendKeys("rrt#$");
		// getAddresses_page().getShippingAdrs().sendKeys("700 king street, London
		// Ontario, N5W 0A6");
		getAddresses_page().getShippingcity().sendKeys("lon");
		getAddresses_page().selectProvince();
		getAddresses_page().getShippingpostalcd().sendKeys("N5W");
		getAddresses_page().getShippingphn().sendKeys("5192517474444");
		jse.executeScript("arguments[0].scrollIntoView();", getAddresses_page().getSaveAddressbtn());
		getAddresses_page().getSaveAddressbtn().click();
	}

	@Test(enabled = false)
	public void TC_44_Addresses_page_Save_address_with_null_information() throws Throwable {
		getCreateAccount_page().signInwithValiddata();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 200);");
		getAddresses_page().getAdresseslink().click();
		Thread.sleep(4000);
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", getAddresses_page().getSaveAddressbtn());
		getAddresses_page().getSaveAddressbtn().click();
	}

}
