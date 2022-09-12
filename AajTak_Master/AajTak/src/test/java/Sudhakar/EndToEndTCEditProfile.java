package Sudhakar;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aajtak.android.init.Aajtak_app_Util;

@Listeners(com.aajtak.android.listener.MyExtentListners.class)
public class EndToEndTCEditProfile extends Aajtak_app_Util {
@Test
public void cars() throws InterruptedException {
	launchApp();
	
	
compelteOnboardingCopy();
	scrollToElement(homescreen.getFirstGalleryInHomeScreen());
	
	
	
}
}
