package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0015 extends Aajtak_app_Util {

	@Test(priority = 2, description = "Description: Verify that the live tv is not cropped")
	public void AT_LiveTvWiget_001() throws Exception {


		launchApp();	
		compelteOnboardingCopy();
		waitTillElementPresent(liveTvWidget.getLiveTvWidget(), 20);
		clickBtn(liveTvWidget.getLiveTvWidget());
		Thread.sleep(5000);
		int actualheight = liveTvWidget.getLiveTvWidgetSize().getSize().getHeight();
		int actualwidth = liveTvWidget.getLiveTvWidgetSize().getSize().getWidth();
		int expectedHeight = liveTvWidget.getContainerSize().getSize().getHeight();
		int expectedWidth = liveTvWidget.getContainerSize().getSize().getWidth();
		verifyTwoSizes(expectedWidth, actualwidth);
		verifyTwoSizes(expectedHeight, actualheight);
	}
}
