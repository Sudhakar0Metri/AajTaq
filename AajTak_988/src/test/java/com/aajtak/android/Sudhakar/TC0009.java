package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0009 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Description: Verify that each story has Comments icon, Bookmark icon, Offline Story icon and Share icon")
	public void AT_Home_003() throws InterruptedException {

	
		launchApp();

	
		compelteOnboardingCopy();
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		
		clickBtn(homescreen.getBadikhabreinSectionCopy());
		Thread.sleep(3000);
	
		clickBtn(homescreen.getAntButton());
			isElementExist(homescreen.getCommentIcon(), "Comment icon");
		isElementExist(homescreen.getBookmarkIcon(), "Book mark icon");
		isElementExist(homescreen.getOfflineIcon(), "Save icon");
		isElementExist(homescreen.getShareIcon(), "Share icon");
	}
}
