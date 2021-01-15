package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyRegistries_Page {
public WebDriver driver;
	
	public MyRegistries_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div//a[contains(text(),'My registries')]")
	private WebElement myRegistrieslink;

	public WebElement getMyRegistrieslink() {
		return myRegistrieslink;
	}
}
