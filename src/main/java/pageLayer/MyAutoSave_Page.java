package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyAutoSave_Page {
public WebDriver driver;
	
	public MyAutoSave_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}

}
