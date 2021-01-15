package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreditCard_Page {
public WebDriver driver;
	
	public CreditCard_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Credit Cards')]")
	private WebElement creditcardLink;

	public WebElement getCreditcardLink() {
		return creditcardLink;
	}
	
	@FindBy(xpath="//button[@id='add-new-cc-modal-trigger']")
	private WebElement addcreditcardbtn;

	public WebElement getAddcreditcardbtn() {
		return addcreditcardbtn;
	}
	
	@FindBy(id="credit-card-card-no")
	private WebElement creditNum;

	public WebElement getCreditNum() {
		return creditNum;
	}
	@FindBy(id="credit-card-expiry-month")
	private WebElement expiryMonth;

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}
	@FindBy(id="credit-card-expiry-year")
	private WebElement expiryYear;

	public WebElement getExpiryYear() {
		return expiryYear;
	}
	
	@FindBy(id="credit-card-security-code")
	private WebElement securityCode;

	public WebElement getSecurityCode() {
		return securityCode;
	}
	@FindBy(id="credit-card-phone")
	private WebElement creditPhnnum;

	public WebElement getCreditPhnnum() {
		return creditPhnnum;
	}
	
	@FindBy(xpath="//label[contains(text(),'Canada')]")
	private WebElement canadaCheckbox;

	public WebElement getCanadaCheckbox() {
		return canadaCheckbox;
	}

	
	@FindBy(id="credit-card-city")
	private WebElement creditCity;

	public WebElement getCreditCity() {
		return creditCity;
	}
	
	@FindBy(xpath="//select[@data-automation='province-input']")
	private WebElement selectdropdwn;

	public WebElement getSelectdropdwn() {
		return selectdropdwn;
	}
	public void selectprovince()
	{
		Select select=new Select(getSelectdropdwn());
		select.selectByVisibleText("Ontario");
	}
	
	@FindBy(id="credit-card-postal-code")
	private WebElement postalcode;

	public WebElement getPostalcode() {
		return postalcode;
	}
	
	@FindBy(id="add-cc-modal-btn")
	private WebElement savecreditdetail;

	public WebElement getSavecreditdetail() {
		return savecreditdetail;
	}
}
