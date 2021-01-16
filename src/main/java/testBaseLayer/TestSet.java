package testBaseLayer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pageLayer.Addresses_Page;
import pageLayer.CreateAccount_Page;
import pageLayer.CreditCard_Page;

import pageLayer.MyAccount_Page;
import pageLayer.MyAutoSave_Page;
import pageLayer.MyList_Page;
import pageLayer.MyRecommendation_Page;
import pageLayer.MyRegistries_Page;
import pageLayer.OrderHistory_Page;
import pageLayer.PersonalSetting_Page;
import pageLayer.SearchProducts_Page;
import pageLayer.ShoppingCart_Page;
import testUtil.TestUtil;
import testUtil.WebDriverListener;

public class TestSet {

	public WebDriver driver;
	public static Properties prop;



	public Addresses_Page addresses_page;

	public Addresses_Page getAddresses_page() {
		return addresses_page;
	}

	public CreateAccount_Page createAccount_page;

	public CreateAccount_Page getCreateAccount_page() {
		return createAccount_page;
	}

	public CreditCard_Page creditCard_page;

	public CreditCard_Page getCreditCard_page() {
		return creditCard_page;
	}

	public MyAccount_Page myAccount_page;

	public MyAccount_Page getMyAccount_page() {
		return myAccount_page;
	}

	public MyAutoSave_Page myAutoSave_page;

	public MyAutoSave_Page getMyAutoSave_page() {
		return myAutoSave_page;
	}

	public MyList_Page myList_page;

	public MyList_Page getMyList_page() {
		return myList_page;
	}

	public MyRecommendation_Page myReccomendation_page;

	public MyRecommendation_Page getMyReccomendation_page() {
		return myReccomendation_page;
	}

	public MyRegistries_Page myRegistries_page;

	public MyRegistries_Page getMyRegistries_page() {
		return myRegistries_page;
	}

	public OrderHistory_Page orderHistory_page;

	public OrderHistory_Page getOrderHistory_page() {
		return orderHistory_page;
	}

	public PersonalSetting_Page personalSetting_page;

	public PersonalSetting_Page getPersonalSetting_page() {
		return personalSetting_page;
	}

	public SearchProducts_Page seacrhProducts_page;

	public SearchProducts_Page getSeacrhProducts_page() {
		return seacrhProducts_page;
	}

	public ShoppingCart_Page shoppingCart_page;

	public ShoppingCart_Page getShoppingCart_page() {
		return shoppingCart_page;
	}
	
	public TestUtil testUtil;
	public TestUtil getTestUtil() {
		return testUtil;
	}
	
	public WebDriverListener webdriverListener;
	public WebDriverListener getWebdriverListener() {
		return webdriverListener;
	}
	
	public EventFiringWebDriver eventfiringWebdriver;
	public EventFiringWebDriver getEventfiringWebdriver() {
		return eventfiringWebdriver;
	}

	public TestSet() {
		try {
			prop = new Properties();
			FileInputStream file = new FileInputStream(
					"C:\\Users\\Dipali Tailor\\eclipse\\Walmart\\src\\main\\java\\environmentalVariables\\config.properties");
			prop.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch(ElementClickInterceptedException e)
		{
			e.printStackTrace();
		}
		catch(MoveTargetOutOfBoundsException e)
		{
			e.printStackTrace();
		}
	}

	public void driverSet() {
		if (prop.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dipali Tailor\\Desktop\\JarFiles\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dipali Tailor\\Desktop\\JarFiles\\geckodriver.exe");
	        driver = new FirefoxDriver();
		} else {
			System.out.println("Browser is not defined");
		}
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoad_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.pageLoad_timeout, TimeUnit.SECONDS);

		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
	}

	@BeforeMethod
	public void objectSet() {
		driverSet();
		addresses_page = new Addresses_Page(driver);
		createAccount_page = new CreateAccount_Page(driver);
		creditCard_page = new CreditCard_Page(driver);
		myAccount_page = new MyAccount_Page(driver);
		myAutoSave_page = new MyAutoSave_Page(driver);
		myList_page = new MyList_Page(driver);
		myReccomendation_page = new MyRecommendation_Page(driver);
		myRegistries_page = new MyRegistries_Page(driver);
		orderHistory_page = new OrderHistory_Page(driver);
		personalSetting_page = new PersonalSetting_Page(driver);
		seacrhProducts_page = new SearchProducts_Page(driver);
		shoppingCart_page = new ShoppingCart_Page(driver);
		testUtil=new TestUtil(driver);
		webdriverListener=new WebDriverListener();
		eventfiringWebdriver=new EventFiringWebDriver(driver);
		eventfiringWebdriver.register(webdriverListener);
		driver=eventfiringWebdriver;		
		

	}

}
