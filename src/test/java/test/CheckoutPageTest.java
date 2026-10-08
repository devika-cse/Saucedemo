package test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basecls;

public class CheckoutPageTest extends Basecls{

	@Test(priority = 1)
	public void checkout() {
		test = extend.createTest("checkout");
		String actualtxt = ch.checkoutInfo();
		Assert.assertEquals(actualtxt, "Checkout: Your Information","Checkout not visible");
	}
	
	@Test(priority = 2)
	public void info() {
	
		ch.fillInfo();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("checkout-step-two"));
	}
	
	@Test(priority = 3)
	public void finishbtn() {
		
		ch.finish();
		
		
	}
}
