package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class OrderHistory_Page {
public WebDriver driver;
	
	public OrderHistory_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[contains(text(),'Order History')]")
	private WebElement orderHisLink;

	public WebElement getOrderHisLink() {
		return orderHisLink;
	}
	
	@FindBy(id="view-orders-from-label")
	private WebElement recentOrderDropDown;

	public WebElement getRecentOrderDropDown() {
		return recentOrderDropDown;
	}
	
	public void selectYear()
	{
		Select select=new Select(getRecentOrderDropDown());
		select.selectByVisibleText("Last 90 days (1 order)");
	}
	
	@FindBy(xpath="//div[contains(text(),'You currently have no orders to display.')]")
	private WebElement noOrders;

	public WebElement getNoOrders() {
		return noOrders;
	}
	
	@FindBy(xpath="//a[contains(text(),'Start shopping!')]")
	private WebElement startshoppingLink;

	public WebElement getStartshoppingLink() {
		return startshoppingLink;
	}
	
}
