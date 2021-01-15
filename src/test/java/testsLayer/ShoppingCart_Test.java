package testsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBaseLayer.TestSet;

public class ShoppingCart_Test extends TestSet {
	
	@Test
	public void TC_49_online_payment_multiple_payment_options() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("parachute coconut oil");
		getSeacrhProducts_page().getSubmit().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		jse.executeScript("arguments[0].scrollIntoView();",	getShoppingCart_page().getAussieoil());
		getShoppingCart_page().getAussieoil().click();
		

		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getAddToCart());
		 getSeacrhProducts_page().getAddToCart().click();
		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getCheckOutbtn());   
		 getSeacrhProducts_page().getCheckOutbtn().click();    
         getSeacrhProducts_page().getProceedtoCheckout().click();		
	}
	
	@Test
	public void TC_50_new_creditcard_customfield() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("parachute coconut oil");
		getSeacrhProducts_page().getSubmit().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;	
		jse.executeScript("arguments[0].scrollIntoView();",	getShoppingCart_page().getAussieoil());
		getShoppingCart_page().getAussieoil().click();

		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getAddToCart());
		 getSeacrhProducts_page().getAddToCart().click();
		 jse.executeScript("arguments[0].scrollIntoView();",getSeacrhProducts_page().getCheckOutbtn());   
		 getSeacrhProducts_page().getCheckOutbtn().click();    
         getSeacrhProducts_page().getProceedtoCheckout().click();		
    	getShoppingCart_page().getNextforpayment().click();
	}
	
	@Test
	public void TC_54_Free_shipping_option() throws InterruptedException
	{
		getCreateAccount_page().signInwithValiddata();
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		getShoppingCart_page().getCookwear().click();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        //getSeacrhProducts_page().getAddToCart().click();
        //getSeacrhProducts_page().getCheckOutbtn().click();
        Thread.sleep(4000);
        
        getSeacrhProducts_page().getProceedtoCheckout().click();
        Thread.sleep(3000);
    	
	}

	@Test
	public void TC_70_Add_1_item_tothe_cart() throws Throwable
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
      
        
	}
	
	@Test
	public void TC_71_increase_quantity_ofthe_same_item_with_plussign() throws Throwable
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        getShoppingCart_page().getPlusBtn().click();
	}
	
	@Test
	public void TC_72_increase_quantity_ofthe_same_item_byentering_numbers() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        getShoppingCart_page().getWriteNum().sendKeys("3");
	}
	
	@Test
	public void TC_73_increase_the_quantity_multipletime_forthe_same_item_and_check_display() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        getShoppingCart_page().getPlusBtn().click();
        getShoppingCart_page().getPlusBtn().click();
	}
	
	@Test
	public void TC_74_add_different_items_in_shoppingcart() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getContinuesho())).click();
        getSeacrhProducts_page().getSearch().sendKeys(Keys.PAGE_UP);
        getSeacrhProducts_page().getSearch().clear();
        getSeacrhProducts_page().getSearch().sendKeys("parachute coconut oil");
		getSeacrhProducts_page().getSubmit().click();
		getShoppingCart_page().getCookwear2().click();		
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
     
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();		
	}
	
	@Test
	public void TC_75_remove_items_from_shoppingcart() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        getShoppingCart_page().getPlusBtn().click();
        Thread.sleep(2000);
    	getSeacrhProducts_page().getRemove().click();   
	}
	
	@Test
	public void TC_76_remove_all_items_from_shoppingcart() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        getShoppingCart_page().getPlusBtn().click();
        Thread.sleep(2000);
    	getSeacrhProducts_page().getRemove().click();   
	}
	
	@Test
	public void TC_77_clickOn_stored_items_in_shoppingcart() throws InterruptedException
	{
		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
        Thread.sleep(2000);
        getShoppingCart_page().getCookwearLink().click();
	}
	
	@Test
	public void TC_78_addItem_closeBrowser_reOpenthe_samesite() throws InterruptedException
	{

		getSeacrhProducts_page().getSearch().sendKeys("T-fal Excite Stainless Steel 14pc Cookware Set");
		getSeacrhProducts_page().getSubmit().click();
		
		System.out.println(getSeacrhProducts_page().getSearch().getText());
		//Assert.assertTrue(getSeacrhProducts_page().getSearch().getText().contains("T-fal Excite Stainless Steel 14pc Cookware Set"));
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 400);");
        Thread.sleep(2000);
        getSeacrhProducts_page().getAddToCart().sendKeys(Keys.PAGE_DOWN);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable( getSeacrhProducts_page().getAddToCart())).click();
        wait.until(ExpectedConditions.elementToBeClickable(  getSeacrhProducts_page().getCheckOutbtn())).click();
      
       
	}
}
