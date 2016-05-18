package Vietcombank;

import com.google.inject.Singleton;
import com.loginium.element.Element;

@Singleton
public class HomePage_EN extends HomePage {

	private Element lnkHomePage = new Element("//a[text()='Home']");
	private Element lnkPersonal = new Element("//a[text()='Personal']");
	private Element LnkCorporates = new Element("//a[text()='Corporates']");
	private Element LnkFinancialInstitutions = new Element("//a[text()='Financial Institutions']");
	private Element LnkEBanking = new Element("//a[text()='E-Banking']");
	private Element LnkCareers = new Element("//a[text()='Careers']");
	private Element LnkInvestors = new Element("//a[text()='Investors']");
	private Element LnkAboutVCB = new Element("//a[text()='About VCB']");

	@Override
	public HomePage_EN goThroughAllMenuItems() throws InterruptedException {
		System.out.println("English Version");

		lnkHomePage.mouseTo();
//		Thread.sleep(1000);
		lnkPersonal.mouseTo();
//		Thread.sleep(1000);
		LnkCorporates.mouseTo();
//		Thread.sleep(1000);
		LnkFinancialInstitutions.mouseTo();
//		Thread.sleep(1000);
		LnkEBanking.mouseTo();
//		Thread.sleep(1000);
		LnkCareers.mouseTo();
//		Thread.sleep(1000);
		LnkInvestors.mouseTo();
//		Thread.sleep(1000);
		LnkAboutVCB.mouseTo();
//		Thread.sleep(1000);

		return this;
	}
}
