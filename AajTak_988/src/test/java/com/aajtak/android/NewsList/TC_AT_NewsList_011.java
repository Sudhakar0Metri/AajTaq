package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 01 June 2021
 * 
 * Description: Verify that once the user taps on 'Cancel' from the sharing
 * options, user navigates to Newslist screen
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_011 extends Aajtak_app_Util {

	@Test(priority = 19, description = "Description: Verify that once the user taps on 'Cancel' from the sharing options, user navigates to Newslist screen")
	public void AT_Newslist_011() throws InterruptedException {

		// launch app
		launchApp();

		// complete onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();

		// Tap on Manoranjan Tab
		//clickBtn(homescreen.getManoranjanTab());

		clickBtn(homescreen.getFirstNewstitle());
		clickBtn(homescreen.getAntButton());
		//clickBtn(homescreen.getSharebadiKhabre());
	
		// Wait till the screen loads
		//waitTillElementPresent(newsList.getshareIcon(), 15);

		// Tap on share icon
		//clickBtn(newsList.getshareIcon(), "Share icon");
		clickBtn(homescreen.getSharebadiKhabre());

		// Wait till the share sheet loads
		//waitTillElementPresent(share.getShareCancel(), 15);

		// Verify if the cancel share option is present
		isElementExist(share.getShareCancel());
		isElementExist(share.getShareCancel(), "Share icon");

		// Tap on cancel share
		clickBtn(share.getShareCancel());

		// Validate if use is navigated to newslist screen
	}

}
