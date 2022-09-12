package com.aajtak.android.NewsList;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

/**
 * Date : 28 May 2021
 * 
 * Description: This is Newslist module of AajTak Application.
 * Verify that user is able to view the offlined story is available in
 * 'Downloaded Content' tab
 * 
 * @author Archana George
 * @version 9.37(417)
 *
 */
@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC_AT_NewsList_008 extends Aajtak_app_Util {

	@Test(priority = 16, description = "Description: Verify that user is able to view the offlined story is available in 'Downloaded Content' tab")
	public void AT_Newslist_008() throws InterruptedException {
		
		// launch app
		launchApp();
		
		// complete onboarding set up
		//compelteOnboarding();
		compelteOnboardingCopy();
		
		// Tap on Manoranjan Tab
		swipeToElement(homescreen.getManoranjanTab());
		clickBtn(homescreen.getManoranjanTab());
		clickBtn(homescreen.getManoranjanTab());
		clickBtn(homescreen.getFirstNewstitle());

		
		// Wait till the screen loads
		
	
		
		// Get the title of the story to be downloaded
		//String expectedTitle = newsList.getnewslistfirsttitle().getText();
		String expectedTitle = homescreen.getFirstStoryTitle().getText();
		

		clickBtn(homescreen.getAntButton());
		
		waitTillElementPresent(newsList.getdownloadIcon(), 5);
		//clickBtn(newsList.getdownloadIcon());

		// Tap on save icon
		clickBtn(newsList.getdownloadIcon(), "Save icon");
		clickBtn(newsList.getAllowButton());
		clickBtn(homescreen.getAntButton());
		clickBtn(newsList.getdownloadIcon(), "Save icon");
		clickDeviceBackButton(1);
		// Tap on hamburger menu
		clickBtn(homescreen.getHamburgerIconCopy(), "Hamburger Menu");
		
		// Navigated to downloaded content
		clickBtn(hamburgerMenu.getDownloadInHamburgerMenu(), "Downloaded Content");
		clickBtn(downloadedContent.getDownloadtitle());
		
		// Wait till the story is present in the downloaded content
		waitTillElementPresent(downloadedContent.getVerifyStoryTitle(), 15);
		
		// Verify if the story is downloaded
		isElementExist(downloadedContent.getVerifyStoryTitle(), "Saved Story");
		
		
		// Get text of the downloaded story
		String actualTitle = downloadedContent.getVerifyStoryTitle().getText();
		
		// Verify the title of the story that is downloaded from the newslist screen and
		// the title of the story present in the downloaded content
		
		verifyStoryTitles(expectedTitle, actualTitle);
	}

}
