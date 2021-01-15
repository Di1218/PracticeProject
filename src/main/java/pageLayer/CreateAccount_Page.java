package pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount_Page {
	public WebDriver driver;

	public CreateAccount_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Create account')]")
	private WebElement createAccolink;

	public WebElement getCreateAccolink() {
		return createAccolink;
	}

	@FindBy(xpath = "//span[contains(text(),'My account')]")
	private WebElement myAccountLink;

	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	@FindBy(xpath="//span[contains(text(),'Sign in')]")
	private WebElement signInLink;	
	public WebElement getSignInLink() {
		return signInLink;
	}
	

	@FindBy(xpath="//button[contains(text(),'Sign in')]")
	private WebElement signInButton;
	public WebElement getSignInButton() {
		return signInButton;
	}
	

	@FindBy(id = "firstName")
	private WebElement fname;

	public WebElement getFname() {
		return fname;
	}

	@FindBy(id = "lastName")
	private WebElement lname;

	public WebElement getLname() {
		return lname;
	}

	@FindBy(id = "phoneNumber")
	private WebElement phonenum;

	public WebElement getPhonenum() {
		return phonenum;
	}

	@FindBy(id = "email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}

	@FindBy(id = "password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id="username")
	private WebElement signInUsername;	
	public WebElement getSignInUsername() {
		return signInUsername;
	}

	@FindBy(id = "marketingPreference")
	private WebElement flyerCheckbox;

	public WebElement getFlyerCheckbox() {
		return flyerCheckbox;
	}

	@FindBy(id = "TAndC")
	private WebElement termsAndCondition;

	public WebElement getTermsAndCondition() {
		return termsAndCondition;
	}

	@FindBy(xpath = "//button[contains(text(),'Create account')]")
	private WebElement createAccount;

	public WebElement getCreateAccount() {
		return createAccount;
	}

	//////////////////// first name common method and error messages

	public void firstname(String fname, String lname, String email, String password) {
		getMyAccountLink().click();
		getCreateAccolink().click();
		getFname().sendKeys(fname);
		getLname().sendKeys(lname);
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
		if (getFlyerCheckbox().isDisplayed() == true) {
			getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
		getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getTermsAndCondition().click();
		getCreateAccount().click();
	}

	@FindBy(xpath = "//span[contains(text(),'Please enter your first name.')]")
	//span[contains(text(),'Please enter a valid first name.')]
	private WebElement fnameNullErrormsg;

	public WebElement getFnameNullErrormsg() {
		return fnameNullErrormsg;
	}

	@FindBy(xpath = "//span[contains(text(),'Please enter a valid first name.')]")
	private WebElement invalidfnameErrormsg;

	public WebElement getInvalidfnameErrormsg() {
		return invalidfnameErrormsg;
	}
	////////////////// last name common method and error messages

	public void lastname(String fname, String lname, String email, String password) {
		getMyAccountLink().click();
		getCreateAccolink().click();
		getFname().sendKeys(fname);
		getLname().sendKeys(lname);
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
		if (getFlyerCheckbox().isDisplayed() == true) {
			getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
		getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getTermsAndCondition().click();
		getCreateAccount().click();
	}

	@FindBy(xpath = "//span[contains(text(),'Please enter your last name.')]")
	private WebElement lnameNullErrormsg;

	public WebElement getLnameNullErrormsg() {
		return lnameNullErrormsg;
	}

	@FindBy(xpath = "//span[contains(text(),'Please enter a valid last name.')]")
	private WebElement lnInvaliderrormsg;

	public WebElement getLnInvaliderrormsg() {
		return lnInvaliderrormsg;
	}

	///////////// common method for all other elements and error messages
	public void cmnMethod(String fname, String lname, String phn, String email, String password) {
		getMyAccountLink().click();
		getCreateAccolink().click();
		getFname().sendKeys(fname);
		getLname().sendKeys(lname);
		getPhonenum().sendKeys(phn);
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
		getFlyerCheckbox().sendKeys(Keys.PAGE_DOWN);
		if (getFlyerCheckbox().isDisplayed() == true) {
			getFlyerCheckbox().click();
		} else {
			System.out.println("not displayed");
		}
		getTermsAndCondition().sendKeys(Keys.PAGE_DOWN);
		getTermsAndCondition().click();
		getCreateAccount().click();
	}

	@FindBy(xpath = "//span[contains(text(),'Please enter a valid phone number.')]")
	private WebElement phnerrormsg;

	public WebElement getPhnerrormsg() {
		return phnerrormsg;
	}

	public void check3TypesPass(String fname, String lname, String email, String password) {
		getMyAccountLink().click();
		getCreateAccolink().click();
		getFname().sendKeys(fname);
		getLname().sendKeys(lname);
		getEmail().sendKeys(email);
		getPassword().sendKeys(password);
	}

	@FindBy(xpath = "//span[contains(text(),'Show')]")
	private WebElement showButton;

	public WebElement getShowButton() {
		return showButton;
	}

	@FindBy(xpath = "//div[contains(text(),'You must read and accept Walmart’s Terms of Use to')]")
	private WebElement termscondirionErrormsg;

	public WebElement getTermscondirionErrormsg() {
		return termscondirionErrormsg;
	}
	
	@FindBy(xpath="//a[contains(text(),'Sign Out')]")
	private WebElement signOutlink;
	public WebElement getSignOutlink() {
		return signOutlink;
	}
	
	public void signInwithValiddata() throws InterruptedException
	{
		 getMyAccountLink().click();
		 Thread.sleep(2000);
		 getSignInUsername().sendKeys("dipalitailor123@gmail.com");;
		 getPassword().sendKeys("Dipali123#");
		 getSignInButton().click();
		 
	}
	

}
