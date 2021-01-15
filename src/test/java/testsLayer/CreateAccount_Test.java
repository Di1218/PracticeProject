package testsLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class CreateAccount_Test extends TestSet {
	
	@Test
	public void TC_1_createAccount_Firstname_with_2_char()
	{
		getCreateAccount_page().cmnMethod("ty", "tail", "5197894455", "ty123@gmail.com", "ty123#");
	}	

	@Test
	public void TC_2_createAccount_Firstname_morethan_2_validchar() {
		getCreateAccount_page().cmnMethod("cyli", "tail", "5197194455", "tyclie12@gmail.com", "ty123#");

	}

	@Test
	public void TC_3_createAccount_Firstname_lessthan_2_char() {
		getCreateAccount_page().cmnMethod("c", "tail", "5197444455", "tyclie123@gmail.com", "ty123#");
	}

	@Test
	public void TC_4_createAccount_Firstname_Null() {
		String expectedError = "Please enter your first name.";
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();		
		getCreateAccount_page().getLname().sendKeys("tandedd");
		getCreateAccount_page().getPhonenum().sendKeys("5197888125");
		getCreateAccount_page().getEmail().sendKeys("bini13142@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("dghty67@3#");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
		getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();
		getCreateAccount_page().getCreateAccount().click();

		// Type 1- generating error message
		// getCreateAccount_page().getFnameNullErrormsg().getText();
		// Assert.assertEquals(getCreateAccount_page().getFnameNullErrormsg().getText(),expectedError);

		// Type 2-generating an error message
		// Assert.assertTrue(getCreateAccount_page().getFnameNullErrormsg().getText().contains(expectedError));
		// System.out.println("Error message is same");

		// Type 3-generating an error message with get attribute
		getCreateAccount_page().getFnameNullErrormsg().getAttribute("innerHTML");
		Assert.assertTrue(getCreateAccount_page().getFnameNullErrormsg().getAttribute("innerHTML")
				.contains("Please enter your first name."));
		System.out.println("First name null error message is same");
	}

	@Test
	public void TC_5_createAccount_Firstname_invalidchar() {
		String expectedmsg = "Please enter a valid first name.";
			
		getCreateAccount_page().firstname("@#$", "tailor", "dips334@gmail.com", "dgh#45");
		getCreateAccount_page().getInvalidfnameErrormsg().getText();
		Assert.assertEquals(getCreateAccount_page().getInvalidfnameErrormsg().getText(), expectedmsg);
		System.out.println("first name invalid characters Error message is same");
	}

	@Test
	public void TC_6_createAccount_Lastname_with_2_char() {
		getCreateAccount_page().lastname("hi", "ta", "ssss12@gmail.com", "Hi123@gm");
	}

	@Test
	public void TC_7_createAccount_Lastname_morethan_2_validchar() {
		getCreateAccount_page().lastname("fi", "tailor", "fi112@gmail.com", "fi123#");
	}

	@Test
	public void TC_8_createAccount_Lastname_lessthan_2_char() {
		getCreateAccount_page().lastname("dips", "d", "dips12@gmail.com", "dips343");

	}

	@Test
	public void TC_9_createAccount_Lastname_Null() {
		String expectedlnnullmsg = "Please enter your last name.";
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getFname().sendKeys("qq");
		getCreateAccount_page().getPhonenum().sendKeys("5197894125");
		getCreateAccount_page().getEmail().sendKeys("bini12@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("dghty@3#");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);

		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
		getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();

		getCreateAccount_page().getCreateAccount().click();
		getCreateAccount_page().getLnameNullErrormsg().getText();
		Assert.assertTrue(getCreateAccount_page().getLnameNullErrormsg().getText().contains(expectedlnnullmsg));
		System.out.println("last name null error message is correct");
	}

	@Test
	public void TC_10_createAccount_Lastname_invalidchar() {
		String expectedInvaliderrormsg = "Please enter a valid last name.";
		getCreateAccount_page().lastname("dipa", "#$%^", "dipa111@gmail.com", "dipa@#");
		getCreateAccount_page().getLnInvaliderrormsg().getAttribute("innerHTML");
		Assert.assertEquals(getCreateAccount_page().getLnInvaliderrormsg().getAttribute("innerHTML"),
				expectedInvaliderrormsg);
		System.out.println("last name invalid error message is same");
	}

	@Test
	public void TC_11_createAccount_phnno_10digit() {
		getCreateAccount_page().cmnMethod("khu", "tan", "5192817187", "kh123@gmail.com", "kh12###");
	}

	@Test
	public void TC_12_createAccount_phnno_lessthan_10digit() {
		String expectedphnerrmsg = "Please enter a valid phone number.";
		getCreateAccount_page().cmnMethod("pi", "tan", "519281", "pi12@gmail.com", "pi123#");
		getCreateAccount_page().getPhnerrormsg().getText();
		Assert.assertEquals(getCreateAccount_page().getPhnerrormsg().getText(), expectedphnerrmsg);
		System.out.println("error message is same while entering less than 10 digit phn number");
	}

	@Test
	public void TC_13_createAccount_morethan_10digit() {
		String expectedphnerrmsg = "Please enter a valid phone number.";
		getCreateAccount_page().cmnMethod("diii", "tai", "5178954258963", "diii12@gmail.com", "diii12@");
		getCreateAccount_page().getPhnerrormsg().getText();
		Assert.assertTrue(
				getCreateAccount_page().getPhnerrormsg().getText().contains("Please enter a valid phone number."));
		System.out.println("error message is same while entering more than 10 digit phone numbers");
	}
	
	@Test
	public void TC_14_createAccount_with_valid_emailId()
	{
		getCreateAccount_page().cmnMethod("diii", "tai", "5178954278", "diiwwii12@gmail.com", "diii12@");
		
	}
	
	@Test
	public void TC_15_createAccount_with_invalid_emailId()
	{
		getCreateAccount_page().cmnMethod("zii", "ses", "5197879566", "df@ml", "fas23277");
	}
	
	@Test
	public void TC_16_createAccount_with_Null_emailId()
	{
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getFname().sendKeys("di");
		getCreateAccount_page().getLname().sendKeys("tailor");
		getCreateAccount_page().getPassword().sendKeys("dip3446");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);

		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}

		getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();
		getCreateAccount_page().getCreateAccount().click();

	}
	
	@Test
	public void TC_17_createAccount_with_morethan_6_char_password()
	{
		getCreateAccount_page().cmnMethod("zil", "sessay", "5197879746", "disss@gmail.com", "fas23277");
	}

	@Test 
	public void TC_18_createAccount_with_lessthan_6_char_password()
	{
		getCreateAccount_page().cmnMethod("tii", "rtrr", "5198589999","ji123@gmail.com", "dip");
	}

	@Test
	public void TC_19_createAccount_check_password_in_bulletform()
	{
		getCreateAccount_page().check3TypesPass("dipali", "tailor", "dipali11@gmail.com", "dipa123#");
	}
	
	@Test
	public void TC_20_createAccount_password_show_button() 
	{
		getCreateAccount_page().check3TypesPass("dipali", "tailor", "dipali11@gmail.com", "dipa123#");
		getCreateAccount_page().getShowButton().click();
	}
	
	@Test
	public void TC_21_createAccount_with_compex_password_min_6_char()
	{
		getCreateAccount_page().check3TypesPass("dipali", "tailor", "dipali11@gmail.com", "Dip12#");
	}
	
	@Test
	public void TC_22_createAccount_with_moderate_password_min_6_char()
	{
		getCreateAccount_page().check3TypesPass("dipali", "tailor", "dipali11@gmail.com", "Dip1223");
	}

	@Test
	public void TC_23_createAccount_with_weak_password_min_6_char()
	{
		getCreateAccount_page().check3TypesPass("dipali", "tailor", "dipali11@gmail.com", "dipa12");
	}

	@Test
	public void TC_24_createAccount_with_Null_password()
	{
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getFname().sendKeys("dttt");
		getCreateAccount_page().getLname().sendKeys("tandel");
		getCreateAccount_page().getPhonenum().sendKeys("5197894125");
		getCreateAccount_page().getEmail().sendKeys("bini12@gmail.com");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);

		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
        getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();
		getCreateAccount_page().getCreateAccount().click();
	}

	@Test(enabled=false)
	public void TC_25_createAccount_checkmark_emailmeabout_flyer() throws InterruptedException
	{
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getFname().sendKeys("bi");
		getCreateAccount_page().getLname().sendKeys("tailor");
		getCreateAccount_page().getPhonenum().sendKeys("5198547895");
		getCreateAccount_page().getEmail().sendKeys("binita@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("d4fsttfgf5");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);

		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}

		getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();

		getCreateAccount_page().getCreateAccount().click();

	

		

	}
	@Test
     public void TC_26_createAccount_Donot_checkmark_emailmeabout_flyer() throws InterruptedException
     {
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getFname().sendKeys("dttt");	
		getCreateAccount_page().getLname().sendKeys("tandel");	
		getCreateAccount_page().getPhonenum().sendKeys("5155974125");	
		getCreateAccount_page().getEmail().sendKeys("bini123@gmail.com");	
		getCreateAccount_page().getPassword().sendKeys("scg5565##");	
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
        getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);         
		getCreateAccount_page().getTermsAndCondition().click();		
		getCreateAccount_page().getCreateAccount().click();
		
     }
	
	@Test
	public void TC_27_Checkmark_TermsofUse()
	{
		getCreateAccount_page().cmnMethod("dieepaalli", "taei", "5197864774", "dipa12ee@gmail.com", "Dipa12#");
	}
	
	@Test
	public void TC_28_DoNotClick_on_TermsofUse_checkbox()
	{
		String errorofTermscondiyion="You must read and accept Walmart’s Terms of Use to subscribe";
		  getCreateAccount_page().getMyAccountLink().click();
		  getCreateAccount_page().getCreateAccolink().click();
		  getCreateAccount_page().getFname().sendKeys("dttt");
		  
		  getCreateAccount_page().getLname().sendKeys("tandel");
		  
		  getCreateAccount_page().getPhonenum().sendKeys("5155974125");
		  
		  getCreateAccount_page().getEmail().sendKeys("bini123@gmail.com");
		  
		  getCreateAccount_page().getPassword().sendKeys("scg5565##");
		  getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
		  getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		  getCreateAccount_page().getCreateAccount().click();
		 
		  getCreateAccount_page().getTermscondirionErrormsg().getText();
		Assert.assertTrue(getCreateAccount_page().getTermscondirionErrormsg().getText().contains("You must read and accept Walmart’s Terms of Use to subscribe"));
		System.out.println("error message is same when don not click on terms and condition checkbox");		
     }
	
	@Test
	public void TC_29_checkemail_after_creating_account()
	{
		getCreateAccount_page().cmnMethod("dipu","rana", "5197771154", "dipi12tt3R@gmail.com", "dsdsg4534");
	}
	
	@Test
	public void TC_30_without_firstandlastname_only_email_and_password()
	{
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getCreateAccolink().click();
		getCreateAccount_page().getPhonenum().sendKeys("5198547895");
		getCreateAccount_page().getEmail().sendKeys("binita@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("d4fsttfgf5");
		getCreateAccount_page().getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);

		if (getCreateAccount_page().getFlyerCheckbox().isDisplayed()) {
			getCreateAccount_page().getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}

		getCreateAccount_page().getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getCreateAccount_page().getTermsAndCondition().click();
        getCreateAccount_page().getCreateAccount().click();	
		
	}
	
	@Test
	public void TC_31_all_valid_data()
	{
		getCreateAccount_page().cmnMethod("dpu","rana", "5155118954", "dipi6623R@gmail.com", "dsdsg4534");
	}
	
	@Test
	public void TC_32_all_invalid_data()
	{
		getCreateAccount_page().cmnMethod("d","ra$$$$$", "5158954", "dipi2123R@l.com", "d4");
	}
	
	
	@Test
	public void TC_34_RegisteredUesr_navigation_from_signout_to_signin() throws InterruptedException
	{
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(2000);
		getCreateAccount_page().getSignInUsername().sendKeys("dipalitailor123@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("Dipali123#");
		getCreateAccount_page().getSignInButton().click();
		Thread.sleep(2000);
		getCreateAccount_page().getMyAccountLink().click();
		Thread.sleep(2000);
		getCreateAccount_page().getSignOutlink().sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(2000);
		getCreateAccount_page().getSignOutlink().click();
		getCreateAccount_page().getMyAccountLink().click();
		getCreateAccount_page().getSignInUsername().sendKeys("dipalitailor123@gmail.com");
		getCreateAccount_page().getPassword().sendKeys("Dipali123#");
		getCreateAccount_page().getSignInButton().click();
		
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


























