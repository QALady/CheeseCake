package Vietcombank;

import com.loginium.element.Element;

public abstract class HomePage {

	protected Element lnkLanguage = new Element("//a[@id='ctl00_Header_LanguageSwitcher_LanguageLink']");
	private Element lnkCloseDialog = new Element("//button[@title='close']");

	public enum Language {
		ENGLISH, VIETNAMESE
	}

	public HomePage closeDialog() {
		if (lnkCloseDialog.isDisplayed()) {
 			lnkCloseDialog.click();
		}

		return this;
	}

	public HomePage changeLanguage(Language language) {

		if ((language == Language.ENGLISH && lnkLanguage.getText().trim().equals("English"))
				|| (language == Language.VIETNAMESE && lnkLanguage.getText().trim().equals("Tiếng Việt"))) {
			lnkLanguage.click();
		}

		return this;
	}

	public abstract HomePage goThroughAllMenuItems() throws InterruptedException;

}