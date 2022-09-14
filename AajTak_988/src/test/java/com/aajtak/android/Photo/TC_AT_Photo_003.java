package com.aajtak.android.Photo;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC_AT_Photo_003 extends Aajtak_app_Util {

	/* Test case- 296 */

	@Test(priority = 4,description = "Verify the user is able to download the photos on the screen")
	public void AT_Photo_003() throws Exception {
		/* Launch The APP */
		launchApp();
		//Aajtak_app_Util.compelteOnboarding();
		compelteOnboardingCopy();
		// reOpenApp();
Thread.sleep(2000);
		/* wait for home screen to load & tap on photo section */
		//waituntilnewElementtobeClickable(photoList.getPhotoSectionFromHorizontalMenu(), 10);
		swipeToElement(photoList.getPhotoSectionFromHorizontalMenu());		
		clickBtn(photoList.getPhotoSectionFromHorizontalMenu());

		/* wait for Photo Section to Load & Tap on download icon */
		waitTillElementPresent(photoList.getDownloadIcon(), 15);
		clickBtn(photoList.getDownloadIcon(), "Save icon");
		clickBtn(newsList.getAllowButton());
		clickBtn(photoList.getDownloadIcon(), "Save icon");


		/* Save the Toast message */
		//String mesg = newsList.getToastMsg().getText();

		/* Validate */
	//	verifyTwoText(mesg, "सेव किया गया");

		/* Close The App */
		aDriver.closeApp();
		
	}

}