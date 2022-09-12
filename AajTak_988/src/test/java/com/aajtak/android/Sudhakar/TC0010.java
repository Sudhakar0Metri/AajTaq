package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0010 extends Aajtak_app_Util {

	@Test(priority = 3, description = "Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
	public void AT_Home_005() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
	waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		
		clickBtn(homescreen.getBadikhabreinSectionCopy());
		Thread.sleep(3000);
	
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getCommentIcon(),"commemt icon is present");
		Thread.sleep(4000);
		isElementExist(comments.getCommentTextHeading());

		
	}
}
