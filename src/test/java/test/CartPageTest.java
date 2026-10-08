package test;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basecls;

public class CartPageTest extends Basecls{

	@Test(priority = 1)
	public void textHeading() {
		test = extend.createTest("textHeading");
		String actual = cp.text();
		Assert.assertEquals(actual, "Your Cart" , "'Your cart' Text incorrect");
	}
	
	@Test(priority = 2)
	public void conShopping() {
		test = extend.createTest("conShopping");
		boolean cs = cp.continueShopping();
		Assert.assertEquals(cs, true,"Continue Shopping button is not enabled");
		System.out.println("Continue Shopping is enabled ");
	}
	
	@Test(priority = 3)
	public void checkout() {
		test = extend.createTest("checkout test");
		boolean ck = cp.checkout();
		Assert.assertEquals(ck, true , "Checkout button is not enabled");
		System.out.println("Checkout button is enabled");
	}
	
	@Test(priority = 4)
	public void clickCheckout() {
	
		cp.checkoutClick();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.urlContains("checkout"));
	}
	
	

}
