package com.aajtak.android.HomeScreen;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 9 June 2021
 * 
 * Description: Verify that user is able to navigate to comments screen by
 * tapping on 'Comments' icon below any story
 * 
 * @author Archana George
 * @version 9.37(417)
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeScreen_005 extends Aajtak_app_Util {

	@Test(priority = 9, description = "Description: Verify that user is able to navigate to comments screen by tapping on 'Comments' icon below any story")
	public void AT_Home_005() throws InterruptedException {

		// Launch the app
		launchApp();

		// Complete Onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		// wait till homescreen is loaded
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
		clickBtn(homescreen.getBadikhabreinSectionCopy());
		Thread.sleep(3000);
	
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getCommentIcon(),"commemt icon is present");
		Thread.sleep(4000);
		isElementExist(comments.getCommentTextHeading());

		// Scroll to Badi Khabrein section
	//	scrollToElement(homescreen.getBadiKahbreinSection());

		// Scroll to a story in top stories
		//scrollToElement(homescreen.getOtherStoryTitle());

		// Tap on comment icon
		//clickBtn(homescreen.getCommentIcon(), "Comment Icon");

		// Validate if comment page is present
		//isElementExist(comments.getCommentTextHeading());
	}
}