package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0004 extends Aajtak_app_Util{
	@Test(priority = 4, description = "Verify that the user is able to go to Set Preferences screen")
	public void AT_Onboarding_004() throws InterruptedException
	
	{
		launchApp();
		compelteOnboardingCopy();
		isElementExist(homescreen.getAajTakHomeLogocopy());
		Thread.sleep(2000);
		swipeRight();
		isElementExist(HomeScreenSection.getBharathsectioncopy());
		swipeRight();
		swipeRight();
		
		
		
	}
}
