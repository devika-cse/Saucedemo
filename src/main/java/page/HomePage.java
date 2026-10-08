package page ;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	By producttext = By.xpath("//*[@id=\"header_container\"]/div[2]/span");
	By filter = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
	By addtocart1 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
	By addtocart2 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bike-light\"]");
	By addtocart3 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
	By addtocart4 = By.xpath("//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]");
	By addtocart5 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    By addtocart6 = By.xpath("//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]");
    By cart = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String textVerification() {
	    return driver.findElement(producttext).getText();
	    
	}
	
	public void filterselect() {
		WebElement f = driver.findElement(filter);
		Select fElement = new Select(f);
		fElement.selectByContainsVisibleText("low to high");
	
		
	}
	
	public void addToCart() {
		driver.findElement(addtocart1).click();
		driver.findElement(addtocart2).click();
		driver.findElement(addtocart3).click();
		driver.findElement(addtocart4).click();
		driver.findElement(addtocart5).click();
		driver.findElement(addtocart6).click();
	}
	
	public void clickCart() {
		driver.findElement(cart).click();
	}
}
