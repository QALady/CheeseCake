package Vietcombank;

import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.loginium.driver.DriverManager;
import com.loginium.driver.DriverSetting;

import injectHepper.InjectModule;

public class TestBase {
	private static ApplicationContext context;
	protected DriverSetting driverSetting;
	protected Injector injector;
	protected PageFactory pageFactory;

	@BeforeSuite
	public void beforeSuite() {
		context = new ClassPathXmlApplicationContext("BrowserSetting.xml");
	}

	@BeforeTest
	public void BeforeTest() {
		injector = Guice.createInjector(new InjectModule());
		pageFactory = injector.getInstance(PageFactory.class);
	}

	@Parameters({ "driverSettingID" })
	@BeforeMethod
	public void beforeMethod(String driverSettingID) throws MalformedURLException, UnexpectedException {
		driverSetting = (DriverSetting) context.getBean(driverSettingID);
		DriverManager.createWebDriver(driverSetting);
		DriverManager.getDriver().manage().window().maximize();
		DriverManager.getDriver().get("http://vietcombank.com.vn/");
	}

	@AfterMethod
	public void afterMethod(ITestResult tr) {
		DriverManager.getDriver().quit();
	}

}
