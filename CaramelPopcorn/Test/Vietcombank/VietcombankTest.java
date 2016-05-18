package Vietcombank;

import org.testng.annotations.Test;

import Vietcombank.HomePage.Language;

public class VietcombankTest extends TestBase {

  @Test
  public void Testcase_01() throws InterruptedException {
    pageFactory.getHomePage().closeDialog().changeLanguage(Language.ENGLISH).closeDialog()
        .goThroughAllMenuItems();
  }

}
