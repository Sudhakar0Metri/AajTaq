package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021 
 * 
 * Description: Verify that user is able to view the
 * bookmarked story is available in 'Bookmark' tab
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_007 extends Aajtak_app_Util {

	@Test(priority = 13, description = "Description: Verify that user is able to view the bookmarked story is available in 'Bookmark' tab")
	public void AT_Newslist_007() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		
		// Tap on Manoranjan Tab
		swipeToElement(homescreen.getManoranjanTab());
		clickBtn(homescreen.getManoranjanTab());
		clickBtn(homescreen.getFirstNewstitle());
		clickBtn(homescreen.getAntButton());
		clickBtn(homescreen.getBookmarkIcon());
		
		
//		// Wait till the screen loads
//		waitTillElementPresent(newsList.getbookmarkIcon(), 15);
		//String expectedTitle = newsList.getnewslistfirsttitle().getText();
		String expectedTitle = homescreen.getFirstStoryTitle().getText();
		clickDeviceBackButton(1);
//		
//		//Tap on bookmark icon
//		
//		clickBtn(newsList.getbookmarkIcon(), "Bookmark icon");
//	
	//	clickBtn(homescreen.getBookmarkIcon());
		//Tap on hamburger menu
		clickBtn(homescreen.getHamburgerIconCopy(), "Hamburger menu");
		
		//Navigate to bookmark content
		clickBtn(hamburgerMenu.getBookmarkInHamburgerMenu(), "Bookmarks");
		clickBtn(bookmarkContent.getBookmarkFirstStory());
		//Verify if bookmarked story is present
		
		isElementExist(bookmarkContent.getVerifyFirstStoryTitle(), "Bookmarked Story");
		String actualTitle = bookmarkContent.getVerifyFirstStoryTitle().getText();
		
		//Validate the title of the story bookmarked  from newlist screen and the story present in the bookmark content
		verifyStoryTitles(expectedTitle,actualTitle);
	}

}