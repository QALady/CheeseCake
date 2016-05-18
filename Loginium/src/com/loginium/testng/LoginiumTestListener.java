package com.loginium.testng;

// import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class LoginiumTestListener extends TestListenerAdapter {

  // private final Level REPORT = Level.forName("REPORT", 350);
  private static Logger log = LogManager.getLogger();

  @Override
  public void onTestSuccess(ITestResult tr) {
    // logTestcaseDetail(tr);
  }

  @Override
  public void onTestFailure(ITestResult tr) {
    log.info(tr.getThrowable().getMessage());
  }

  @Override
  public void onTestSkipped(ITestResult tr) {
    // logTestcaseDetail(tr);
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult tr) {
    // logTestcaseDetail(tr);
  }

  @Override
  public void onConfigurationFailure(ITestResult tr) {
    log.info(tr.getThrowable().getMessage());
  }

  @Override
  public void onStart(ITestContext testContext) {
    log.info("=============================================");
    log.info("================= START TEST ================");
    log.info("=============================================");
  }

  @Override
  public void onFinish(ITestContext testContext) {
    log.info("=============================================");
    log.info("================= END TEST ================");
    log.info("=============================================");
  }


}
