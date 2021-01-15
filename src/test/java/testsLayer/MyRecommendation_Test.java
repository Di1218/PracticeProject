package testsLayer;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class MyRecommendation_Test extends TestSet{

	
	@Test
	public void TC_92_My_Recommendation_page() throws Throwable
	{

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyReccomendation_page().getMyReccomendationLink().click();
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img21.png"));
			}
	
	@Test
	public void TC_93_My_Recommendation_page_text_verify() throws Throwable
	{
		String expectedText="People with a similar purchase history also bought:";

		getCreateAccount_page().signInwithValiddata();
		getCreateAccount_page().getMyAccountLink().click();
		getMyReccomendation_page().getMyReccomendationLink().click();
		getMyReccomendation_page().getTextonMyReco().getText();
		Assert.assertTrue(getMyReccomendation_page().getTextonMyReco().getText().contains(expectedText));
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("D:/img22.png"));
		
	}

}
