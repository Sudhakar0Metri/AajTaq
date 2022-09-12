package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
import com.aajtak.android.pages.HomeScreenSection;
import com.aajtak.android.pages.Homescreen;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0003 extends Aajtak_app_Util{
	@Test(priority = 2,description = "Verify that the user get navigated to next screen by swiping horizontally")

	public void AT_Onboarding_003() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
		Thread.sleep(3000);
		swipeRight();
		Thread.sleep(5000);
		clickBtn(HomeScreenSection.getDelhibutton());
		isElementExist(HomeScreenSection.getDelhibutton());
		
	}
}
