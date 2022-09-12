package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC0011 extends Aajtak_app_Util{
	@Test(priority = 3, description = "Verify that once user taps on Anya, it gives more options to share the story & if tapped 'Cancel' or any where on the screen, user navigates to 'Home' screen")
	public void AT_Home_013() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
	waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		
		clickBtn(homescreen.getBadikhabreinSectionCopy());
		Thread.sleep(3000);
	
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getShareIcon(),"share icon is present");
		Thread.sleep(4000);
		isElementExist(share.getOtherShare());
		clickBtn(share.getOtherShare());
		clickDeviceBackButton(1);
		clickDeviceBackButton(1);
		
		isElementExist(homescreen.getAajTakHomeLogocopy(), "AajTak Home");


		
	}

}
