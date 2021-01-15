package testsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class PersonalSetting_Test extends TestSet {

	
	@Test
	public void TC_85_Personal_Setting_page_personal_info_editing() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getPersonalSetting_page().getPersonalSetLink().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getPersonalSetLink().click();
		getPersonalSetting_page().getPeronalInfoEdit().click();
		getPersonalSetting_page().getFirstName().sendKeys("dd");
		getPersonalSetting_page().getSavep().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getSavep().click();	
	}
	
	@Test
	public void TC_86_Personal_Setting_page_email_editing() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getPersonalSetting_page().getPersonalSetLink().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getPersonalSetLink().click();
		getPersonalSetting_page().getEmailEdit().isDisplayed();
		Assert.assertFalse(	getPersonalSetting_page().getEmailEdit().isDisplayed());
		System.out.println("User can edit email field");
	}
	
	@Test
	public void TC_87_Personal_Setting_page_password_editing() throws Throwable
	{
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)");
		//getPersonalSetting_page().getPersonalSetLink().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getPersonalSetLink().click();
		
		jse.executeScript("window.scrollBy(0,250)");
		//getPersonalSetting_page().getPasswordEdit().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getPasswordEdit().click();
	}
	
	@Test
	public void TC_88_Personal_Setting_page_language_editing() throws InterruptedException
	{
		
		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		//getPersonalSetting_page().getPersonalSetLink().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getPersonalSetLink().click();
		getPersonalSetting_page().getPersonalSetLink().sendKeys(Keys.PAGE_DOWN);
		getPersonalSetting_page().getLanguageEdit().click();
		getPersonalSetting_page().getFrance().click();
		getPersonalSetting_page().getEnglish().click();
		
		
	}
	
	
	

}
