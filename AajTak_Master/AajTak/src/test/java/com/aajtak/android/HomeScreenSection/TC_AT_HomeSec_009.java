package com.aajtak.android.HomeScreenSection;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aajtak.android.init.Aajtak_app_Util;

/**
 * @author Prasanna Kumar
 * @Version v9.37(417)
 * This is HomeScreen Section Module From Aaj Tak Application
 * Description : Verify that when user is able navigate to the article description page
 */

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_HomeSec_009 extends Aajtak_app_Util{

	@Test(description="Description : Verify that when user is able navigate to the article description page",priority = 9)
	public void AT_HomeSec_009() throws InterruptedException, IOException {

		//Launching the app
		launchApp();

		//Complete on board set up
		compelteOnboarding();

		//Scrolling till khel section in homescreen
		scrollToElement(homescreen.getKhelSection());

		//verifying khel section in homescreen
		isElementExist(homescreen.getKhelSection());

		//Scrolling till the element story is present
		scrollToElement(homescreen.getStoryInHomeScreen());

		//Clicking on the story in homescreen
		clickBtn(homescreen.getStoryInHomeScreen());

		//clicking on thike samajh agaya in wlakthrough screen in story detail
		clickBtn(storyDetail.getTikeSamajAgaya());

		//Clickin on device back button
		clickDeviceBackButton(1);

		// story detail open in diff section
		//Scrolling till manoranjan section in homescreen
		scrollToElement(homescreen.getManoranjanSection());

		//verifying manoranjan section in homescreen
		isElementExist(homescreen.getManoranjanSection());

		//Scrolling till the element story is prese
		scrollToElement(homescreen.getStoryInHomeScreen());

		//Clicking on the story in homescreen
		clickBtn(homescreen.getStoryInHomeScreen());

		//clicking on thike samajh agaya in wlakthrough screen in story detail
		clickDeviceBackButton(1);


	}

}
