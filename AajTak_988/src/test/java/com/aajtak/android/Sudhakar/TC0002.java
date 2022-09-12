package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0002 extends Aajtak_app_Util{
	@Test(priority = 2,description = "Verify that the user get navigated to Settings screen when user taps on Anya settings link")
	public void AT_Onboarding_002() throws InterruptedException{
		launchApp();
	compelteOnboardingCopy();
	clickBtn(homescreen.getHamburgerIconCopy());
	
	scrollToElement(hamburgerMenu.getSettingsButtoncopy());
	clickBtn(hamburgerMenu.getSettingsButtoncopy());
		isElementExist(notificatonPayeOnboarding.getNotificationButtonCopy());

		
	}
}
