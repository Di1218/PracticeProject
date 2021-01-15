package testsLayer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class MyLists_Test extends TestSet{
	

	
	@Test
	public void TC_94_My_Lists_Page_createList() throws Throwable
	{

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyList_page().getMyListLink().click();
		getMyList_page().getWriteListname().sendKeys("hi");
		getMyList_page().getSaveList().click();		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img23.png"));
		
	}
	
	@Test
	public void TC_95_My_Lists_Page_searchBox() throws Throwable
	{
		String expectedres="Orange, Seedless";

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyList_page().getMyListLink().click();
		getMyList_page().getWriteListname().sendKeys(Keys.PAGE_DOWN);
		
		getMyList_page().getSearchbox().sendKeys("oranges");
		getMyList_page().getSearchBtn().click();
		getMyList_page().getOranges().getText();
		Assert.assertTrue(	getMyList_page().getOranges().getText().contains(expectedres));		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img24.png"));
	}
	
	@Test
	public void TC_96_My_List_page_clickOn_Item() throws Throwable
	{
		String expectedres="Orange, Seedless";

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyList_page().getMyListLink().click();
		getMyList_page().getWriteListname().sendKeys(Keys.PAGE_DOWN);
		
		getMyList_page().getSearchbox().sendKeys("oranges");
		getMyList_page().getSearchBtn().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img25.png"));
		
	}
	
	
	
}
