package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccount_Page {
	public WebDriver driver;
	
	public MyAccount_Page(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="//input[@placeholder='What are you looking for?']")
	private WebElement search;	
	public WebElement getSearch() {
		return search;
	}
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;
	public WebElement getSubmit() {
		return submit;
	}

	public void guestUserNavigation()
	{
		getSearch().sendKeys("loreal shampoo");
		getSubmit().click();
	}
	
	@FindBy(xpath="//a[contains(text(),'View all orders')]")
	private WebElement viewAllOrder;

	public WebElement getViewAllOrder() {
		return viewAllOrder;
	}
	
	@FindBy(xpath="//a[contains(text(),'Manage order')]")
	private WebElement manageOrderLink;

	public WebElement getManageOrderLink() {
		return manageOrderLink;
	}
	@FindBy(xpath="//a[contains(text(),'Make a return')]")
	private WebElement makeReturnLink;

	public WebElement getMakeReturnLink() {
		return makeReturnLink;
	}
	
	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement continueButton;

	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(xpath="//input[@id='4']")
	private WebElement checkbox4;

	public WebElement getCheckbox4() {
		return checkbox4;
	}
	@FindBy(tagName="select")
	private WebElement dropDown;

	public WebElement getDropDown() {
		return dropDown;
	}
	
	public void selectOptipondropdown()
	{
		Select select=new Select(getDropDown());
		select.selectByVisibleText("Damaged");
	}
	
	
}
