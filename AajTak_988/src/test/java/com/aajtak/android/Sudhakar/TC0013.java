package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;



@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC0013 extends Aajtak_app_Util{
	@Test(priority = 5,description = "Verify that each story under 'Badi Khabarae' is showing up the uploaded time")
	public void AT_Home_004() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
	waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
	clickBtn(homescreen.getBadikhabreinSectionCopy());
	scrollToElement(homescreen.getOtherStoryTitle());



	isElementExist(homescreen.getNewsDate());
		
	}
}

