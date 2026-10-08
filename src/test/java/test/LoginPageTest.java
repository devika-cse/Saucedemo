package test;

import org.testng.annotations.Test;

import base.Basecls;
import page.LoginPage;

public class LoginPageTest extends Basecls{

	
	@Test
	public void login() {
		test=extend.createTest("login");
		LoginPage lo = new LoginPage(driver);
		lo.setValues("error_user", "secret_sauce");
		lo.loginClick();
	}
}
