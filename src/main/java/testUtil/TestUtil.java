package testUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TestUtil {

	public static WebDriver driver;
	public static long pageLoad_timeout = 20;
	public static long implicitlywait = 20;
	public static String excelsheetPath = "";
	Sheet sheet;
	Workbook wb;

	public TestUtil(WebDriver driver) {
		this.driver = driver;
	}

	public void changeToFrame() {
		driver.switchTo().frame("frame");
	}

	public Object[][] getData(String sheetName) throws EncryptedDocumentException, IOException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(excelsheetPath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}

		wb = WorkbookFactory.create(file);
		sheet = wb.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
			}
		}

		return data;

	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "Screenshot" + System.currentTimeMillis() + ".png"));

	}
}