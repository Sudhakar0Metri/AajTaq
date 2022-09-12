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
 * This test case is to verify that user is able to tap 'Bookmark' icon. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_008 extends Aajtak_app_Util {
	
	@Test(priority = 29,description = "Description : Verify that user is able to tap 'Bookmark' icon")
	public void AT_StoryDetail_008() throws Exception {
		
		//It will launch applications
		launchApp();
		
		//It is used to load the complete Onboarding screen
	//	Aajtak_app_Util.compelteOnboarding();
		compelteOnboardingCopy();
		
		//Select the manoranjan option in horizontal menu
		//selectSectionInHomeScreen(homescreen.getManoranjanTab());
		swipeToElement(homescreen.getManoranjanTab());
		clickBtn(homescreen.getManoranjanTab());
		clickBtn(homescreen.getFirstNewstitle());
		clickBtn(homescreen.getAntButton());
		isElementExist(homescreen.getBookmarkIcon(), "Book mark icon");
		clickBtn(homescreen.getBookmarkIcon());
		String expectedTitle = homescreen.getFirstStoryTitle().getText();
		clickDeviceBackButton(1);
clickBtn(homescreen.getHamburgerIconCopy(), "Hamburger menu");
		
		//Navigate to bookmark content
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmarks");
		clickBtn(bookmarkContent.getBookmarkFirstStory());
		//Verify if bookmarked story is present
		
		isElementExist(bookmarkContent.getVerifyFirstStoryTitle(), "Bookmarked Story");
		String actualTitle = bookmarkContent.getVerifyFirstStoryTitle().getText();
		verifyStoryTitles(expectedTitle,actualTitle);
		
		//Scroll to first story title of manoranjan
		//scrollToElement(storyDetail.getFirstStoryTitle());
		
		//Click on first story title of manoranjan
		//clickBtn(storyDetail.getFirstStoryTitle());
						
		//Click on tike samaj aagaya in story detail walkthrough page
	//	clickBtn(storyDetail.getTikeSamajAgaya());
						
		//Click on Action over flow icon
		//clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
						
		//Click on bookmark icon which is present in action over flow
	//	clickBtn(storyDetail.getBookmarkIconInActionOverflow(), "Bookmark icon");
				
		//Get toast message like bookmark kiya gaya
		//String mesg = storyDetail.getToastMsg().getText();
				
		//Compare with toast message
	//	verifyTwoText(mesg, "बुकमार्क किया गया :)");
	}
}
