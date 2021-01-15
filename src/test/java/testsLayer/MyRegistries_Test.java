package testsLayer;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class MyRegistries_Test extends TestSet {

	
	@Test
	public void TC_98_My_Registries_page_create_BabyORWedding_registries() throws Throwable
	{

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyRegistries_page().getMyRegistrieslink().isDisplayed();
		Assert.assertTrue(getMyRegistries_page().getMyRegistrieslink().isDisplayed());
	}
	
}
