package pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalSetting_Page {
public WebDriver driver;
	
	public PersonalSetting_Page(WebDriver driver)
	{
		this.driver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li//a[contains(text(),'Personal Settings')]")
	private WebElement personalSetLink;

	public WebElement getPersonalSetLink() {
		return personalSetLink;
	}
	
	@FindBy(id="set-edit-info")
	private WebElement peronalInfoEdit;

	public WebElement getPeronalInfoEdit() {
		return peronalInfoEdit;
	}
	
	@FindBy(name="firstName")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="update-details-btn")
	private WebElement savep;

	public WebElement getSavep() {
		return savep;
	}

	@FindBy(id="set-edit-email")
	private WebElement emailEdit;

	public WebElement getEmailEdit() {
		return emailEdit;
	}

	@FindBy(id="password-section")
	private WebElement passwordEdit;

	public WebElement getPasswordEdit() {
		return passwordEdit;
	}
	

	@FindBy(id="set-edit-language")
	private WebElement languageEdit;

	public WebElement getLanguageEdit() {
		return languageEdit;
	}
	@FindBy(xpath="//span[contains(text(),' Français ')]")
	private WebElement france;

	public WebElement getFrance() {
		return france;
	}
	@FindBy(xpath="//span[contains(text(),'English ')]")
	private WebElement english;

	public WebElement getEnglish() {
		return english;
	}
	
	@FindBy(id="update-language-btn")
	private WebElement lansave;
	public WebElement getLansave() {
		return lansave;
	}
	
}
