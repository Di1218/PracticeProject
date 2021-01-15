package pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProducts_Page {
public WebDriver driver;
	
	public SearchProducts_Page(WebDriver driver)
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
	
	@FindBy(xpath="//img[@alt='Live Clean Coconut Milk Moisturizing Shampoo']")
	private WebElement shampoo;

	public WebElement getShampoo() {
		return shampoo;
	}

	@FindBy(xpath="//button[contains(text(),'Add to cart')]")
	private WebElement addToCart;

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	@FindBy(xpath="//button[contains(text(),'Checkout')]")
    private WebElement checkOutbtn;	
	public WebElement getCheckOutbtn() {
		return checkOutbtn;
	}
	
	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")
	private WebElement continuesho;	
	public WebElement getContinuesho() {
		return continuesho;
	}


	@FindBy(xpath="//button[contains(text(),'Proceed to checkout')]")
    private WebElement proceedtoCheckout;
	public WebElement getProceedtoCheckout() {
		return proceedtoCheckout;
	}
	
	@FindBy(xpath="//button[@data-automation='remove-product-from-cart']//span[contains(text(),'X Remove')]")
	private WebElement remove;

	public WebElement getRemove() {
		return remove;
	}


	@FindBy(xpath="//button[contains(text(),'Continue Shopping')]")	
		private WebElement continueShop;

		public WebElement getContinueShop() {
			return continueShop;
		}
		
		
		public void mainSearchpage()
		{
			driver.get("https://www.walmart.ca/en");
		}
		
		@FindBy(xpath="//div[contains(text(),'Best Match')]")
		private WebElement bestmatchdropdown;

		public WebElement getBestmatchdropdown() {
			return bestmatchdropdown;
		}
		
		@FindBy(xpath="//div[contains(text(),'Price: Low to High')]")
		private WebElement lowhigh;

		public WebElement getLowhigh() {
			return lowhigh;
		}		
		
		@FindBy(xpath="//span[contains(text(),'Home')]")
		private WebElement homeCat;

		public WebElement getHomeCat() {
			return homeCat;
		}
		
		@FindBy(xpath="//button[@data-automation='panel-expand-button']//label[contains(text(),'Brand')]")
		private WebElement brand;

		public WebElement getBrand() {
			return brand;
		}
		@FindBy(xpath="//div[@class='css-1yc32ua e1o8rzdd2']//span[contains(text(),'Batiste')]")
		private WebElement batiste;

		public WebElement getBatiste() {
			return batiste;
		}
		
		
		
		public void totalProducts()
		{
			List<WebElement> elements= driver.findElements(By.tagName("p"));
			elements.size();
			System.out.println(	elements.size());
			
		}
	}

