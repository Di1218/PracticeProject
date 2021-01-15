package testsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class CreditCard_Test extends TestSet{

	
	@Test
	public void TC_46_CreditCard_page() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300);");
		getCreditCard_page().getCreditcardLink().click();		
	}
	
	@Test
	public void Tc_47_CreditCard_page_Edi_or_add_creditcard_validdata() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();		
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300);");
		getCreditCard_page().getCreditcardLink().click();
        getCreditCard_page().getAddcreditcardbtn().click();
    	Thread.sleep(2000);
		getCreditCard_page().getCreditNum().sendKeys("4537338144139027");
		getCreditCard_page().getExpiryMonth().sendKeys("01");
		getCreditCard_page().getExpiryYear().sendKeys("21");
		getCreditCard_page().getSecurityCode().sendKeys("841");
		getCreditCard_page().getCreditPhnnum().sendKeys("5192818989");
		getCreditCard_page().getCreditCity().sendKeys("london");
		getCreditCard_page().selectprovince();
		getCreditCard_page().getPostalcode().sendKeys("N5W 0A6");
		getCreditCard_page().getSavecreditdetail().click();		
	}
	
	@Test
	public void TC_48_CreditCard_page_Edit_or_add_creditcard_Invaliddata() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 300);");
		getCreditCard_page().getCreditcardLink().click();
        getCreditCard_page().getAddcreditcardbtn().click();
    	Thread.sleep(2000);
		getCreditCard_page().getCreditNum().sendKeys("45373381139027");
		getCreditCard_page().getExpiryMonth().sendKeys("01");
		getCreditCard_page().getExpiryYear().sendKeys("20");
		getCreditCard_page().getSecurityCode().sendKeys("81");
		getCreditCard_page().getCreditPhnnum().sendKeys("51928989");
		getCreditCard_page().getCreditCity().sendKeys("london");
		getCreditCard_page().selectprovince();
		getCreditCard_page().getPostalcode().sendKeys("N 0A6");
		getCreditCard_page().getSavecreditdetail().click();		
	}
}
