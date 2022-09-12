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
 * This test case is to verify that by tapping on the close button of the 'Comment' screen. 
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_StoryDetail_007 extends Aajtak_app_Util{
	
	@Test(priority = 28,description = "Description : Verify that by tapping on the close button of the 'Comment' screen")
	public void AT_StoryDetail_007() throws Exception {
		
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
		Thread.sleep(2000);
		String expectedTitle = homescreen.getFirstStoryTitle().getText();
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getCommentIcon(), "Comment icon");
		isElementExist(comments.getCommentTextHeading(),"Comments screen");

		
		//Scroll to first story title of manoranjan
		//scrollToElement(storyDetail.getFirstStoryTitle());
		
		//Click on first story title of manoranjan
		//clickBtn(storyDetail.getFirstStoryTitle());
				
		//Click on tike samaj aagaya in story detail walkthrough page
		//clickBtn(storyDetail.getTikeSamajAgaya());
				
		//Click on Action over flow icon
		//clickBtn(storyDetail.getActionOverflowBtn(), "Action Overflow Btn");
				
		//Click on comments icon
		//clickBtn(storyDetail.getCommentsIconInActionOverflow(), "Comments icon");
				
		//It will verify comments page is displayed or not
		//isElementExist(comments.getCommentScreen(), "Comments Screen");
				
		//It will wait till comments screen gets loaded
		//waitTillElementPresent(comments.getCloseCommentsScreen(), 15);
				
		//Click on close button
		//clickBtn(comments.getCloseCommentsScreen(), "Close Comments Screen");
		clickBtn(comments.getBackarrow());
		String Actualtitle = homescreen.getFirstStoryTitle().getText();
				
		//It will wait till description of story loaded
		//waitTillElementPresent(storyDetail.getTitleOfAnyStory(), 120);
				
		//It will verify the title of story in story detail page
		//isElementExist(storyDetail.getTitleOfAnyStory(), "Title of story detail");
		verifyStoryTitles(expectedTitle,Actualtitle);
	}

}
