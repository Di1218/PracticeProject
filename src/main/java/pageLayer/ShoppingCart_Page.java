package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart_Page {
public WebDriver driver;
	
	public ShoppingCart_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//p[contains(text(),'Aussie Miracle Curls Leave-In Detangling Milk with')]")
	private WebElement aussieoil;

	public WebElement getAussieoil() {
		return aussieoil;
	}
	
	@FindBy(xpath="//span[contains(text(),'Shipping')]")
	private WebElement shippinklink;

	public WebElement getShippinklink() {
		return shippinklink;
	}
	
	@FindBy(xpath="//button[contains(text(),'Next')]")
	private WebElement nextforpayment;

	public WebElement getNextforpayment() {
		return nextforpayment;
	}
	@FindBy(id="email")
	private WebElement email;

	public WebElement getEmail() {
		return email;
	}
	
	@FindBy(xpath="//p[contains(text(),'T-fal Excite Stainless Steel 14pc Cookware Set')]")
	private WebElement cookwear;
	
	public WebElement getCookwear() {
		return cookwear;
	}
	
	@FindBy(xpath="//a[contains(text(),'T-fal Excite Stainless Steel 14pc Cookware Set')]")
	private WebElement cookwearlink;
	
	public WebElement getCookwearLink() {
		return cookwearlink;
	}

	@FindBy(xpath="//button[contains(text(),'+')]")
	private WebElement plusBtn;

	public WebElement getPlusBtn() {
		return plusBtn;
	}
	
	@FindBy(xpath="//button[contains(text(),'-')]")
	private WebElement minusBtn;

	public WebElement getMinusBtn() {
		return minusBtn;
	}
	@FindBy(xpath="//input[@inputmode='numeric']")
    private WebElement writeNum;

	public WebElement getWriteNum() {
		return writeNum;
	}
	
	@FindBy(xpath="//p[contains(text(),'T-fal Stainless 3qt/​20cm Saucepan')]")
	private WebElement cookwear2;

	public WebElement getCookwear2() {
		return cookwear2;
	}
}
