package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Basecls;


public class HomePageTest extends Basecls{

	@Test(priority = 1)
	public void textVerify() {
		test = extend.createTest("textVerify");
		String acttext = hp.textVerification();
		Assert.assertEquals(acttext, "Products","Incorrect text");
			
	}
	
	@Test(priority = 2)
	public void sort() {
		test = extend.createTest("sort");
		hp.filterselect();
	}
	
	@Test(priority = 3)
	public void addtoCart() {
		test = extend.createTest("addtoCart");
		hp.addToCart();
	}
	
	@Test(priority = 4)
	public void cartSelect() {
		test = extend.createTest("cartSelect");
		hp.clickCart();
	}
	
}
