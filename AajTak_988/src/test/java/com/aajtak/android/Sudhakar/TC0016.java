package com.aajtak.android.Sudhakar;

import java.util.List;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.android.AndroidElement;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC0016 extends Aajtak_app_Util{
	@Test(priority = 4, description = "Description: Verify that the live tv is not cropped")
	public void AT_LiveTVWidget_003() throws Exception {

		launchApp();
		compelteOnboardingCopy();
		waitTillElementPresent(liveTvWidget.getLiveTvWidget(), 20);
		clickBtn(liveTvWidget.getLiveTvWidget());
		//isElementExist(liveTvWidget.getWidgetShareIcon(), "Widget Share icon");
		clickBtn(liveTvWidget.getWidgetShareIcon(), "Share icon");
		Thread.sleep(3000);
		waitTillElementPresent(share.getShareCancel(), 10);
		Thread.sleep(3000);
		List<AndroidElement> optionText = share.getShareOptionHighlights();
		for (AndroidElement allText : optionText) {

			isElementExist(allText);
		}
		uninstallApp();
		installProdApp(); //app is not installing
	minWait();
	}
	
}
