package injectHepper;

import com.google.inject.AbstractModule;

import Vietcombank.HomePage;
import Vietcombank.HomePage_EN;
import Vietcombank.HomePage_VN;

public class InjectModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(HomePage.class).to(HomePage_EN.class);		
	}

}
