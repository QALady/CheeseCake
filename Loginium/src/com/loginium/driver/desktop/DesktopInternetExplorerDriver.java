package com.loginium.driver.desktop;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.loginium.driver.DriverBase;
import com.loginium.driver.DriverSetting;

public class DesktopInternetExplorerDriver extends DriverBase {

	public DesktopInternetExplorerDriver(DriverSetting driverSetting) throws MalformedURLException {
		super(driverSetting);
		if (driverSetting.getRemoteURL() == null || driverSetting.getRemoteURL().equals("")) {			
			log.info("Picking up Internet Explorer executable at " + driverSetting.getExecutablePath());
			System.setProperty("webdriver.ie.driver", driverSetting.getExecutablePath());
			setWebDriver(new InternetExplorerDriver());
		} else {
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setVersion(driverSetting.getBrowserVersion());
			capabilities.setCapability(CapabilityType.PLATFORM, driverSetting.getPlatform());
			setWebDriver(new RemoteWebDriver(new URL(driverSetting.getRemoteURL()), capabilities));
		}
	}
}
