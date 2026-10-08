package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

	WebDriver driver;
	By heading = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By continueshop = By.xpath("//*[@id=\"continue-shopping\"]");
	By checkout = By.xpath("//*[@id=\"checkout\"]");
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String text() {
		return driver.findElement(heading).getText();
	}
	
	public boolean continueShopping() {
		return driver.findElement(continueshop).isEnabled();
	}
	
	public boolean checkout() {
		return driver.findElement(checkout).isEnabled();
	}
	
	public void checkoutClick() {
		driver.findElement(checkout).click();
	}
	
}
