package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Addresses_Page {
	public WebDriver driver;

	public Addresses_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//body/div[@id='wrap']/div[@id='main-wrap']/div[@id='empty-template']/section[@id='my-account-content']/section[1]/div[1]/nav[1]/section[1]/ul[1]/li[8]")
	private WebElement adresseslink;

	public WebElement getAdresseslink() {
		return adresseslink;
	}

	@FindBy(id = "add-new-address-btn")
	private WebElement addnewAddressbtn;

	public WebElement getAddnewAddressbtn() {
		return addnewAddressbtn;
	}

	@FindBy(id = "shipping-first-name")
	private WebElement fn;

	public WebElement getFn() {
		return fn;
	}

	@FindBy(xpath = "//input[@id='shipping-last-name']")
	private WebElement ln;

	public WebElement getLn() {
		return ln;
	}

	@FindBy(xpath = "//input[@id='shipping-address1']")
	private WebElement shippingAdrs;

	public WebElement getShippingAdrs() {
		return shippingAdrs;
	}

	@FindBy(xpath = "//input[@id='shipping-city']")
	private WebElement shippingcity;

	public WebElement getShippingcity() {
		return shippingcity;
	}

	@FindBy(id = "provinces")
	private WebElement province;

	public WebElement getProvince() {
		return province;
	}

	public void selectProvince() {
		Select select = new Select(getProvince());
		select.selectByVisibleText("Ontario");
	}

	@FindBy(xpath = "//input[@id='shipping-postal-code']")
	private WebElement shippingpostalcd;

	public WebElement getShippingpostalcd() {
		return shippingpostalcd;
	}

	@FindBy(id = "shipping-phone")
	private WebElement shippingphn;

	public WebElement getShippingphn() {
		return shippingphn;
	}

	@FindBy(id = "save-address-btn")
	private WebElement saveAddressbtn;

	public WebElement getSaveAddressbtn() {
		return saveAddressbtn;
	}

	//hi
}
