package com.aajtak.android.Hamburger_Feedback;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
/**
 * Date : 1 July 2021 This is Hamburger_Feedback Module of AajTak Application.
 * 
 * Description:  Verify that user is able to go to feedback screen by tapping on the 'Feedback' from 'Settings'.
 * @author Archana George
 * @version 9.37(417)
 */
public class TC_AT_Feedback_001 extends Aajtak_app_Util{
		@Test(description = "Verify that user is able to go to feedback screen by tapping on the 'Feedback' from 'Settings'",priority = 1)
		public void AT_Feedback_001() throws InterruptedException {
			
			//It will launch application
			launchApp();
			
			//It is used to load the complete Onboarding screen
			Aajtak_app_Util.compelteOnboarding();
			
			//Click on Hamburger Menu Icon
			clickBtn(hamburgerMenu.getHamburgerIcon(), "Hamburger Icon");
			
			//It will scroll till to settings option.
			scrollToElement(hamburgerMenu.getSettingsInAnyaCategorys());
			
			//Click on settings option
			clickBtn(hamburgerMenu.getSettingsInAnyaCategorys());
			
			//It will scroll till to FeedBack option.
			scrollToElement(settings.getFeedBack());
			
			//Click on Feedback option
			clickBtn(settings.getFeedBack());
			
			//Wait till the feedback screen is loaded
			waitTillElementPresent(feedBack.getNameEditable(), 10);
			
			//It will verify that feedback page is displayed or not
			isElementExist(feedBack.getFeedbackInSettings());
		}
}
