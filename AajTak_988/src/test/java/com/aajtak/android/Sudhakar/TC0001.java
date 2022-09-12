package com.aajtak.android.Sudhakar;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

import junit.framework.Assert;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)

public class TC0001 extends Aajtak_app_Util{
	@Test(priority = 1, description = "Description : Verify app installation is successful")

	public void AT_NonFun_001() {
		uninstallApp();
		installProdApp();
		boolean status = aDriver.isAppInstalled(properties.getProperty("appPackage"));
		Assert.assertEquals(true ,status );
	}
	
}
