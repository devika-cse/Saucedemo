package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	By usernamefield = By.id("user-name");
	By passwordfield = By.id("password");
	By loginbutton = By.id("login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setValues(String username , String password) {
		driver.findElement(usernamefield).sendKeys("standard_user");
		driver.findElement(passwordfield).sendKeys("secret_sauce");
	}
	
	public void loginClick(){
		driver.findElement(loginbutton).click();
	}
	
}
