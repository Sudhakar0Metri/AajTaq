package com.aajtak.android.Sudhakar;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class TC0008  extends Aajtak_app_Util
{
	@Test(priority = 1, description = "Description: Verify once user launch the app,'Home' tab is selected by default")
	public void AT_Home_002() throws Throwable {
		launchApp();
		compelteOnboardingCopy();
		waitTillElementPresent(homescreen.getDailyCapsuleBannnerCopy(),20);
		scrollToElement(homescreen.getBadiKahbreinSection());
		isElementExist(homescreen.getBadiKahbreinSection());

	}
		}
