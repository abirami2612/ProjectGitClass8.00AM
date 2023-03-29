package org.test;

import org.base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class TestClassy extends BaseClass {
	
	public TestClassy() {
		
		PageFactory.initElements(driver, this);
		
	}

}
