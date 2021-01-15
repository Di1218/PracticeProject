package testsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class SearchProducts_Test extends TestSet {
	
	
	
	@Test
	public void TC_33_GuestUser_navigate_products()
	{
		getSeacrhProducts_page().guestUserNavigation();
	}
	
	@Test
	public void TC_35_My_Account_page() throws InterruptedException, IOException
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("Live Clean Coconut Milk Moisturizing Shampoo");
		getSeacrhProducts_page().getSubmit().click();
		getSeacrhProducts_page().getShampoo().click();
		Thread.sleep(3000);
		getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
		getSeacrhProducts_page().getAddToCart().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img34.png"));
		
		
	}
	
	@Test
	public void TC_55_searchproduct_with_keyword()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("dry Shampoo");
		getSeacrhProducts_page().getSubmit().click();
	}
	
	@Test
	public void TC_56_searchproduct_with_description_text()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("loreal paris voluminous lash paradise");
		getSeacrhProducts_page().getSubmit().click();
	}
	@Test
	public void TC_57_searchproduct_with_partial_item_text()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("ultra gel liner");
		getSeacrhProducts_page().getSubmit().click();
	}
	@Test
	public void TC_58_searchproduct_with_partial_item_number()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("30466020");
		getSeacrhProducts_page().getSubmit().click();
	}
	
	@Test
	public void TC_59_searchproduct_with_category_keyword()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("Vegetables or dairyor beans");
		getSeacrhProducts_page().getSubmit().click();
	}

	@Test
	public void TC_60_click_on_searchbutton_with_blankspace()
	{
		getSeacrhProducts_page().getSubmit().click();
	}
	
	@Test
	public void TC_61_searchbutton_with_invalid_data()
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("crm12#");
		getSeacrhProducts_page().getSubmit().click();
	}
	@Test
	public void TC_62_Sort_items() throws InterruptedException, IOException
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("dry Shampoo");
		getSeacrhProducts_page().getSubmit().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getBestmatchdropdown());
		getSeacrhProducts_page().getBestmatchdropdown().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img35.png"));
		
		//Thread.sleep(2000);
		//getSeacrhProducts_page().getLowhigh().sendKeys(Keys.PAGE_DOWN);
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(	getSeacrhProducts_page().getLowhigh())).click();
		//getSeacrhProducts_page().getLowhigh().sendKeys(Keys.PAGE_DOWN);
		//getSeacrhProducts_page().getLowhigh().click();
	}
	
	@Test
	public void TC_63_Sort_morethan_1_items() throws InterruptedException, IOException
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("dry Shampoo");
		getSeacrhProducts_page().getSubmit().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getBestmatchdropdown());
			getSeacrhProducts_page().getBestmatchdropdown().click();
		getSeacrhProducts_page().getBestmatchdropdown().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img36.png"));
		
		//getSeacrhProducts_page().getLowhigh().click();
	}
	
	@Test
	public void TC_64_filter_items() throws Throwable
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("dry Shampoo");
		getSeacrhProducts_page().getSubmit().click();
	    //Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 400);");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(	getSeacrhProducts_page().getBrand())).click();		
		getSeacrhProducts_page().getBrand().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img37.png"));
		
		//getSeacrhProducts_page().getBatiste().click();
		
		
	}
	

	@Test
	public void TC_65_sorting_and_filtering_together() throws Throwable
	{
		
		getSeacrhProducts_page().getSearch().sendKeys("dry Shampoo");
		getSeacrhProducts_page().getSubmit().click();
	    //Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 400);");
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(	getSeacrhProducts_page().getBrand())).click();
		Thread.sleep(2000);
		
		getSeacrhProducts_page().getBatiste().click();
		Thread.sleep(2000);
		getSeacrhProducts_page().getBestmatchdropdown().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img38.png"));
		
	//	wait.until(ExpectedConditions.visibilityOf(getSeacrhProducts_page().getLowhigh())).click();
		
		
	}
	
	@Test
	public void TC_66_SRP_with_valid_product_name()
	{

		getSeacrhProducts_page().getSearch().sendKeys("chocolate milk");
		getSeacrhProducts_page().getSubmit().click();
	}
	
	@Test
	public void TC_67_Total_products_per_page()
	{

		getSeacrhProducts_page().getSearch().sendKeys("dry shampoo");
		getSeacrhProducts_page().getSubmit().click();
		getSeacrhProducts_page().totalProducts();
	}
	

	@Test
	public void TC_69_Searchproduct_with_relevent_info_for_duplication() throws Throwable
	{

		getSeacrhProducts_page().getSearch().sendKeys("lipstic");
		getSeacrhProducts_page().getSubmit().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img39.png"));
		
	}


	@AfterMethod
	public void tear()
	{
		//driver.close();
	}

	
	
	

}
