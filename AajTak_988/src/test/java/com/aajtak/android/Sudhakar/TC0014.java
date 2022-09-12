package com.aajtak.android.Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import io.appium.java_client.touch.TapOptions;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC0014 extends Aajtak_app_Util{
	@Test(priority = 5,description = "Verify the mute icon")
	public void AT_LiveTVWidget_002() throws InterruptedException {
		launchApp();
		compelteOnboardingCopy();
	waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(), 20);
	clickBtn(liveTvWidget.getLiveTvWidget());

//	clickBtn(liveTvWidget.getLiveAudio());
	waitTillElementPresent(liveTvWidget.getMuteIcon(), 20);
	
	//isElementExist(liveTvWidget.getMuteIcon(), "Mute icon");


	//clickBtn(liveTvWidget.getLiveTV());
	isElementExist(liveTvWidget.getMuteIcon(), "Mute icon");

	clickBtn(liveTvWidget.getMuteIcon(), "Mute icon");
		
	}
}
