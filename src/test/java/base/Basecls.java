package base;

import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import page.CartPage;
import page.CheckoutPage;
import page.HomePage;

public class Basecls {

	public static WebDriver driver;
	public static HomePage hp;
	public static CartPage cp;
	public static CheckoutPage ch;
	
	public static ExtentSparkReporter reporter;
	public static ExtentReports extend;
	public static ExtentTest test;
	
	@BeforeTest
	public void setUp() {
		reporter = new ExtentSparkReporter("./Report/myreport1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("Functional testing");
		reporter.config().setTheme(Theme.DARK);
		extend = new ExtentReports();
		extend.attachReporter(reporter);
		extend.setSystemInfo("hostname", "localhost");
		extend.setSystemInfo("os", "windows10");
		extend.setSystemInfo("testername", "devika");
		extend.setSystemInfo("Browser name", "chrome");
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver= new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
	}
	
	@BeforeMethod
	public void method(Method mthd) {
		hp = new HomePage(driver);
		cp = new CartPage(driver);
		ch = new CheckoutPage(driver);
  		test=extend.createTest(mthd.getName());
		
	}
	
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException{
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL, "test case failed is "+result.getName());
			test.log(Status.FAIL, "test case failed is "+result.getThrowable());
		}
		
		else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP, "test case skipped is "+result.getName());
		}
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS, "test case passes is "+result.getName());
		}
	}
	
	
	
	
	@AfterTest
	public void end() {
		extend.flush();
	}
	
	
}
