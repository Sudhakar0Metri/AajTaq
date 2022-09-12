package com.aajtak.android.StoryDetails;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 1 June 2021 This is Story Detail module of AajTak Application.
 * 
 * @author Prathibha
 * @version 9.37(417) 
 * 
 * This test case is to verify that user is able to tap 'Offline Story' icon.
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_011 extends Aajtak_app_Util {
	
	@Test(priority = 32,description = "Description : Verify that user is able to tap 'Offline Story' icon")
	public void AT_StoryDetail_011() throws Exception {
		
		//It will launch application
		launchApp();
		
		//It is used to load the complete Onboarding screen
		//Aajtak_app_Util.compelteOnboarding();
		compelteOnboardingCopy();
		
		//Select the manoranjan option in horizontal menu
		//selectSectionInHomeScreen(homescreen.getManoranjanTab());
		swipeToElement(homescreen.getManoranjanTab());
		clickBtn(homescreen.getManoranjanTab());
		clickBtn(homescreen.getFirstNewstitle());
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getOfflineIcon());
		
		
		//Scroll to first story title of manoranjan
		//scrollToElement(storyDetail.getFirstStoryTitle());
		
		//Click on first story title of manoranjan
		//(storyDetail.getFirstStoryTitle());
												
		//Click on tike samaj aagaya in story detail walkthrough page
	//	clickBtn(storyDetail.getTikeSamajAgaya());
												
		//Click on Action over flow icon
		//clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
				
		//Click on offline icon which is present in action over flow
	//	clickBtn(storyDetail.getOfflineStoryInActionOverflow(), "Offline Story icon");
				
		//Get toast message like save kiya gaya
		//String mesg = storyDetail.getToastMsg().getText();
				
		//Compare with toast message
		//verifyTwoText(mesg, "सेव किया गया :)");
	}

}
