package Vietcombank;

import com.google.inject.Singleton;
import com.loginium.element.Element;

@Singleton
public class HomePage_VN extends HomePage {

	private Element lnkHomePage = new Element("//a[text()='Trang chủ']");
	private Element lnkPersonal = new Element("//a[text()='Cá nhân']");
	private Element LnkCorporates = new Element("//a[text()='Doanh nghiệp']");
	private Element LnkFinancialInstitutions = new Element("//a[text()='Định chế tài chính']");
	private Element LnkEBanking = new Element("//a[text()='Ngân hàng điện tử']");
	private Element LnkCareers = new Element("//a[text()='Tuyển dụng']");
	private Element LnkInvestors = new Element("//a[text()='Nhà đầu tư']");
	private Element LnkAboutVCB = new Element("//a[text()='Giới thiệu']");

	@Override
	public HomePage_VN goThroughAllMenuItems() throws InterruptedException {
		System.out.println("Vietnamese Version");
		lnkHomePage.mouseTo();
		Thread.sleep(1000);
		lnkPersonal.mouseTo();
		Thread.sleep(1000);
		LnkCorporates.mouseTo();
		Thread.sleep(1000);
		LnkFinancialInstitutions.mouseTo();
		Thread.sleep(1000);
		LnkEBanking.mouseTo();
		Thread.sleep(1000);
		LnkCareers.mouseTo();
		Thread.sleep(1000);
		LnkInvestors.mouseTo();
		Thread.sleep(1000);
		LnkAboutVCB.mouseTo();
		Thread.sleep(1000);

		return this;
	}
}
