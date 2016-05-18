package com.loginium.driver.desktop;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.loginium.driver.DriverBase;
import com.loginium.driver.DriverSetting;

public class DesktopChromeDriver extends DriverBase {

  public DesktopChromeDriver(DriverSetting driverSetting) throws MalformedURLException {
    super(driverSetting);

    if (driverSetting.getRemoteURL() == null || driverSetting.getRemoteURL().equals("")) {
      log.info("Picking up Chrome executable at " + driverSetting.getExecutablePath());
      System.setProperty("webdriver.chrome.driver", driverSetting.getExecutablePath());
      setWebDriver(new ChromeDriver());
    } else {
      DesiredCapabilities capabilities = DesiredCapabilities.chrome();
      capabilities.setVersion(driverSetting.getBrowserVersion());
      capabilities.setCapability(CapabilityType.PLATFORM, driverSetting.getPlatform());
      setWebDriver(new RemoteWebDriver(new URL(driverSetting.getRemoteURL()), capabilities));
    }
  }
}
