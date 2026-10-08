package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

	WebDriver driver;
	By checkouttext = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By firstname = By.xpath("//*[@id=\"first-name\"]");
	By lastname = By.xpath("//*[@id=\"last-name\"]");
	By zipcode = By.xpath("//*[@id=\"postal-code\"]");
	By continuebtn = By.xpath("//*[@id=\"continue\"]");
	By finishbtn = By.xpath("//*[@id=\"finish\"]");
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String checkoutInfo() {
		return driver.findElement(checkouttext).getText();
	}
	
	public void fillInfo() {
		driver.findElement(firstname).sendKeys("zia");
		driver.findElement(lastname).sendKeys("sharon");
		driver.findElement(zipcode).sendKeys("680004");
		driver.findElement(continuebtn).click();
	}
	
	public void finish() {
		driver.findElement(finishbtn).click();
	}
}
