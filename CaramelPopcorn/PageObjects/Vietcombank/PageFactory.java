package Vietcombank;

import com.google.inject.Inject;

public class PageFactory {

	private HomePage homePage;
	
	@Inject
	public void setHomePage(HomePage page)
	{
		this.homePage = page;
	}	
	
	public HomePage getHomePage()
	{
		return this.homePage;
	}
}
