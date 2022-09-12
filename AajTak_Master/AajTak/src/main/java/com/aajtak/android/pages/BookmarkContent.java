package com.aajtak.android.pages;

import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BookmarkContent {
	
	public static AndroidDriver<AndroidElement> aDriver;
	
	public BookmarkContent(AndroidDriver<AndroidElement> aDriver) {
		this.aDriver = aDriver;
		PageFactory.initElements(new AppiumFieldDecorator(aDriver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/toolbar_title']")
	private AndroidElement bookmarkPageTitle;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=1]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
	private AndroidElement tasvireSection;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=2]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
	private AndroidElement videoSection;
	
	@AndroidFindBy(xpath = "(//android.widget.HorizontalScrollView//android.widget.LinearLayout//androidx.appcompat.app.ActionBar.Tab[@index=0]//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_tab'])[1]")
	private AndroidElement storySection;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/tv_nodata']")
	private AndroidElement contentMessage;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='in.AajTak.headlines:id/ed_save']")
	private AndroidElement sabhiSafKaren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/alertTitle']")
	private AndroidElement aletrtTitleOnSabhiSafKaren;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@resource-id='android:id/message']")
	private AndroidElement aletrtMessageOnSabhiSafKaren;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button2']")
	private AndroidElement nahiOptionForClearBookmarkContent;

	@AndroidFindBy(xpath = "//android.widget.Button[@resource-id='android:id/button1']")
	private AndroidElement haanOptionForClearBookmarkContent;
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/img_toolbar_back_arrow']")
	private AndroidElement backArrowButton;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@index=0]//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/story_delete']")
	private AndroidElement deleteSingleStory_Video;
	
	@AndroidFindBy(xpath = "//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/photo_parent_view']//android.widget.ImageView[@resource-id='in.AajTak.headlines:id/story_delete']")
	private AndroidElement deleteSinglePhoto;
	/*
	 * @AndroidFindBy(xpath =
	 * "(//android.widget.TextView[@resource-id='in.AajTak.headlines:id/story_desc'])[1]")
	 * private AndroidElement verifyStoryTitle;
	 */
	@AndroidFindBy(id = "in.AajTak.headlines:id/story_desc")
	private AndroidElement verifyStoryTitle;
	
	
	/*  @AndroidFindBy(xpath =
	  "//androidx.recyclerview.widget.RecyclerView//android.widget.RelativeLayout[@resource-id='in.AajTak.headlines:id/video_details']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/story_desc']")
	  private AndroidElement verifyVideoTitle;
	 */
	  @AndroidFindBy(id = "in.AajTak.headlines:id/story_desc")
	private AndroidElement verifyVideoTitle;
			 
	
	@AndroidFindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView//android.widget.LinearLayout[@resource-id='in.AajTak.headlines:id/photo_parent_view']//android.widget.TextView[@resource-id='in.AajTak.headlines:id/news_title'])[1]")
    private AndroidElement verifyPhotoTitle;
	
	
	@AndroidFindBy(id = "in.AajTak.headlines:id/news_date")
	private AndroidElement contentDate;
	
	@AndroidFindBy(xpath = "//android.widget.Toast[1]")
	private AndroidElement toastmsg;	
	
	public AndroidElement getBookmarkPageTitle() {
		return bookmarkPageTitle;	
	}
	
	
	public AndroidElement getTasvireSection() {
		return tasvireSection;	
	}
	
	public AndroidElement getVideoSection() {
		return videoSection;	
	}
	
	public AndroidElement getStorySection() {
		return storySection;	
	}
	
	public AndroidElement getContentMessage() {
		return contentMessage;
	}
	
	public AndroidElement getSabhiSafKaren() {
		return sabhiSafKaren;	
	}
	
	public AndroidElement getAletrtTitleOnSabhiSafKaren() {
		return aletrtTitleOnSabhiSafKaren;	
	}
	
	public AndroidElement getAletrtMessageOnSabhiSafKaren() {
		return aletrtMessageOnSabhiSafKaren;	
	}
	
	public AndroidElement getNahiOptionForClearBookmarkContent() {
		return nahiOptionForClearBookmarkContent;
	}
	
	public AndroidElement getHaanOptionForClearBookmarkContent() {
		return haanOptionForClearBookmarkContent;	
	}
	
	public AndroidElement getBackArrowButton() {
		return backArrowButton;
	}
	
	public AndroidElement getDeleteSingleStory_Video() {
		return deleteSingleStory_Video;
	}
	
	public AndroidElement getDeleteSinglePhoto() {
		return deleteSinglePhoto;
	}
	
	public AndroidElement getVerifyStoryTitle() {
		return verifyStoryTitle;
	}
	
	public AndroidElement getVerifyVideoTitle() {
		return verifyVideoTitle;
	}
	
	public AndroidElement getVerifyPhotoTitle() {
		return verifyPhotoTitle;
	}
	
	
	public AndroidElement getContentDate() {
		return contentDate;
	}

	public RemoteWebElement getToastMsg() {
		return toastmsg;
	}
	

}
